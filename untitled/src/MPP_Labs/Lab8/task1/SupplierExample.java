package MPP_Labs.Lab8.task1;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        InnerRandomSupplier rand= new InnerRandomSupplier();
        System.out.println(rand.get());
    }

    public static class InnerRandomSupplier implements Supplier<Double>{
        @Override
        public Double get(){
            return Math.random();
        }
    }
}
