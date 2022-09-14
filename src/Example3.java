import java.util.function.BiFunction;

public class Example3 {
    static int doSomething(BiFunction<Integer, Integer, Integer> sum) {
        return sum.apply(30, 50);
    }

    public static void main(String[] args) {
        int result = doSomething((n1, n2) -> n1 + n2);
        System.out.println(result);
    }
}
