package MPP_Labs.Lab8.task1;

import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        Supplier<Double> randomSuppier = ()->Math.random();
        System.out.println(randomSuppier.get());
    }
}
