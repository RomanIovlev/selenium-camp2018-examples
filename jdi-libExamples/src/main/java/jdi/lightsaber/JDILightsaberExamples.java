package jdi.lightsaber;

import com.epam.jdi.tools.LinqUtils;
import com.epam.jdi.tools.PrintUtils;
import com.epam.jdi.tools.func.JFunc4;
import com.epam.jdi.tools.func.JFunc6;

import java.util.List;

import static com.epam.jdi.tools.LinqUtils.*;
import static com.epam.jdi.tools.PrintUtils.print;
import static java.util.Arrays.asList;
import static jdk.nashorn.internal.objects.NativeArray.reduce;

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
    }

    public static void funcDemo() {
        System.out.println("Func demo");
        System.out.println(print.execute("Roman", 5, true, "good day"));
        for (int i=0; i<10; i++)
            System.out.println(print.execute("Roman", i, i%3==0, "good day"));
    }

    private static <T> void print(List<T> list) {
        System.out.println(PrintUtils.print(select(list, Object::toString)));
    }

    public static void linqDemo() {
        System.out.println("Linq demo");
        List<Integer> numbers = asList(3, 5, 8);
        List<Integer> result = map(numbers, n -> n*n);  print(result);
        //List<Integer> result = where(numbers, n -> n*n);  print(result);
        result = LinqUtils.filter(numbers, n -> n>4); print(result);
        //result = LinqUtils.where(numbers, n -> n>4); print(result);
        int first = first(numbers, n -> n%2!=0);
        System.out.println(first);
        int last = last(numbers, n -> n%2!=0);
        System.out.println(last);
    }


}
