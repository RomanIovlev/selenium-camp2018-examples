package jdi.lightsaber;

import com.epam.jdi.tools.LinqUtils;
import com.epam.jdi.tools.func.JFunc4;
import com.epam.jdi.tools.map.MapArray;

import java.util.List;

import static com.epam.jdi.tools.LinqUtils.*;
import static com.epam.jdi.tools.PrintUtils.print;
import static java.lang.System.out;
import static java.util.Arrays.asList;

/**
 * Created by Roman_Iovlev on 3/2/2018.
 */
public class JDILightsaberExamples {

    static JFunc4<String, Integer, Boolean, String, String> print =
            (name, number, acceppted, descr) ->
                    acceppted + ":" + name + number*number + "'"+ descr+"'";

    public static void main(String[] args) {
        funcDemo();
        linqDemo();
        printDemo();
    }

    public static void funcDemo() {
        out.println("Func demo");
        out.println(print.execute("Roman", 5, true, "good day"));
        for (int i=0; i<10; i++)
            out.println(print.execute("Roman", i, i%3==0, "good day"));
    }

    private static <T> void output(String message, List<T> list) {
        out.println(message + print(select(list, Object::toString)));
    }
    private static <T> void output(List<T> list) {
        output("", list);
    }

    public static void linqDemo() {
        out.println("Linq demo");
        List<Integer> numbers = asList(3, 5, 8);
        List<Integer> result = map(numbers, n -> n*n);  output(result);
        //List<Integer> result = where(numbers, n -> n*n);  output(result);
        result = LinqUtils.filter(numbers, n -> n>4); output(result);
        //result = LinqUtils.where(numbers, n -> n>4); output(result);
        int first = first(numbers, n -> n%2!=0);
        out.println(first);
        int last = last(numbers, n -> n%2!=0);
        out.println(last);
    }
    public static void printDemo() {
        out.println("Print demo");
        List<String> strings = asList("Roman", "4", "test");
        out.println(print(strings));
        out.println(print(strings, "; "));
        out.println(print(strings, "; ", "[%s}"));
    }

    MapArray<String, Integer> map = new MapArray<>(new Object[][]{
            {"One", 1},
            {"Two", 2},
            {"Three", 3},
            {"Four", 4},
    });
    MapArray<String, String> mapLists = new MapArray<>(
        asList("Test", "Value", "JDI"),
        asList("new", "world", "awesome"));
    MapArray<Integer, Integer> mapProstyeSquares = new MapArray<>(
            new Integer[] {1, 2, 3, 5, 7, 11},
            k -> k, v -> v*v);
    MapArray<Integer, Integer> mapFibonacchiDoubles = new MapArray<>(
            asList(3, 5, 8, 13, 21),
            k -> k, v -> 2*v);
    MapArray<Integer, Integer> mapCollection = new MapArray<>(
            10, k -> k, v -> v*v);

    public void mapArrayDemo() {
        out.println("Map demo");
        out.println("Last: " + map.last());
        out.println("hasAny: " + map.any());
        out.println("Any > 3: " + map.any(n -> n >3));
        output("To negative list: ",
            map.select((k,v) -> -v));
        out.println("To negative list: " +
            map.filter((k,v) -> v>3));
        out.println("To negative list: " +
                map.filter((k,v) -> v>3));

    }


}
