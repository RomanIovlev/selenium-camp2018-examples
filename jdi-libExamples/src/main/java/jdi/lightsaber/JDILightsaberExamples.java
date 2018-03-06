package jdi.lightsaber;

import com.epam.jdi.tools.LinqUtils;
import com.epam.jdi.tools.PrintUtils;
import com.epam.jdi.tools.SwitchActions;
import com.epam.jdi.tools.func.JFunc4;
import com.epam.jdi.tools.map.MapArray;

import java.util.List;
import java.util.concurrent.locks.Condition;

import static com.epam.jdi.tools.LinqUtils.*;
import static com.epam.jdi.tools.PrintUtils.*;
import static com.epam.jdi.tools.PrintUtils.print;
import static com.epam.jdi.tools.SwitchActions.*;
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
        System.out.println("Func demo");
        System.out.println(print.execute("Roman", 5, true, "good day"));
        for (int i=0; i<10; i++)
            System.out.println(print.execute("Roman", i, i%3==0, "good day"));
    }

    private static <T> void output(List<T> list) {
        System.out.println(print(select(list, Object::toString)));
    }

    public static void linqDemo() {
        System.out.println("Linq demo");
        List<Integer> numbers = asList(3, 5, 8);
        List<Integer> result = map(numbers, n -> n*n);  output(result);
        //List<Integer> result = where(numbers, n -> n*n);  output(result);
        result = LinqUtils.filter(numbers, n -> n>4); output(result);
        //result = LinqUtils.where(numbers, n -> n>4); output(result);
        int first = first(numbers, n -> n%2!=0);
        System.out.println(first);
        int last = last(numbers, n -> n%2!=0);
        System.out.println(last);
    }
    public static void printDemo() {
        System.out.println("Print demo");
        List<String> strings = asList("Roman", "4", "test");
        System.out.println(print(strings));
        System.out.println(print(strings, "; "));
        System.out.println(print(strings, "; ", "[%s}"));
    }

    static MapArray<String, Integer> map = new MapArray<>(new Object[][]{
            {"One", 1},
            {"Two", 2},
            {"Three", 3},
            {"Four", 4},
    });
    static MapArray<String, String> map2 = new MapArray<>(
        asList("Test", "Value", "JDI"),
        asList("new", "world", "awesome"));

    public static void mapArrayDemo() {
        System.out.println("Map demo");
        System.out.println(map.last());
        System.out.println(map.any());
        System.out.println(map.any(n -> n >3));
        output(map.select((k,v) -> v*v));
    }


}
