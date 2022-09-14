import java.util.function.BiFunction;

public class Example4 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (n1, n2) -> n1 + n2;
        int result = sum.apply(30, 50);
        System.out.println(result);
    }
}
