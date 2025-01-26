package MPP_Labs.Lab8.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionTest {
    public static void main(String[] args) {
       BiFunction<Double, Double, List<Double>> bifunc = (a,b)->{
           List<Double> list = new ArrayList<>();
           list.add(Math.pow(a,b));
           list.add(a*b);
           return list;
       };
        System.out.println(bifunc.apply(2.0, 3.0));
    }
}
