package Calculator;

import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;
    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public BinaryOperator<Integer> devide = (x, y) -> {
        if (x == 0 || y == 0) {
            return 0;
        } else {
            return x / y;
        }
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    public Consumer<Integer> println = System.out::println;
}
