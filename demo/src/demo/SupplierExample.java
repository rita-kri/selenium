package demo;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
      
        Supplier<String> stringSupplier = () -> "Hello, World!";
        String result1 = stringSupplier.get();
        System.out.println("Example 1 Result: " + result1);

//        Supplier<Double> randomSupplier = Math::random;
//        double result2 = randomSupplier.get();
//        System.out.println("Example 2 Result: " + result2);
    }
}

