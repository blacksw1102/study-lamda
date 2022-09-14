public class Example1 {
    interface Math {
        int sum(int n1, int n2);
    }

    static int doSomething(Math math) {
        return math.sum(20, 30);
    }

    public static void main(String[] args) {
        int result = doSomething(new Math() {
            @Override
            public int sum(int n1, int n2) {
                return n1 + n2;
            }
        });
        System.out.println(result);
    }
}
