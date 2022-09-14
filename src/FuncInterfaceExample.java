import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncInterfaceExample {
    public static void main(String[] args) {
        testRunnable();
        testSupplier();
        testConsumer();
        testFunction();
        testPredicate();
    }

    public static void testRunnable() {
        Runnable runnable = () -> System.out.println("test runnable");
        runnable.run();
    }

    public static void testSupplier() {
        Supplier<String> getString = () -> "test supplier";
        String str = getString.get();
        System.out.println(str);
    }

    public static void testConsumer() {
        Consumer<String> printString = text -> System.out.println("Miss " + text + "?");
        printString.accept("me");
    }

    public static void testFunction() {
        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add = (value) -> value + 3;

        Function<Integer, Integer> addThenMultiply = multiply.compose(add);
        Integer result = addThenMultiply.apply(3);
        System.out.println(result);

        Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);
        Integer result2 = multiplyThenAdd.apply(3);
        System.out.println(result2);
    }

    public static void testPredicate() {
        Predicate<Integer> isBiggerThanFive = num -> num > 5;
        Predicate<Integer> isLowerThanSix = num -> num < 6;
        Boolean result = isBiggerThanFive.and(isLowerThanSix).test(5);
        Boolean result2 = isBiggerThanFive.or(isLowerThanSix).test(5);
        System.out.println(result);
        System.out.println(result2);

        Predicate<String> isEquals = Predicate.isEqual("Google");
        Boolean result3 = isEquals.test("Google");
        Boolean result4 = isEquals.negate().test("Google");
        System.out.println(result3);
        System.out.println(result4);
    }

}
