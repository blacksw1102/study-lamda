public class Example {
    interface Math {
        int sum(int n1, int n2);
    }

    static class MyMath implements Math {
        public int sum(int n1, int n2) {
            return n1 + n2;
        }
    }

    static int doSomething(Math math) {
        return math.sum(10, 20);
    }

    public static void main(String[] args) {
        Math math = new MyMath();
        int result = doSomething(math);
        System.out.println(result);
    }
}
