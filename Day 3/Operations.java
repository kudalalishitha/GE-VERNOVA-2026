@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

class Operations {
    static int add(int a, int b) { return a + b; }
    static int sub(int a, int b) { return a - b; }
    static int mul(int a, int b) { return a * b; }
    static int div(int a, int b) { return a / b; }

    public static void main(String[] args) {
        Calculator c1 = Operations::add;
        Calculator c2 = Operations::sub;
        Calculator c3 = Operations::mul;
        Calculator c4 = Operations::div;

        System.out.println(c1.calculate(10, 5));
        System.out.println(c2.calculate(10, 5));
        System.out.println(c3.calculate(10, 5));
        System.out.println(c4.calculate(10, 5));
    }
}
