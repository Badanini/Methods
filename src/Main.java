public class Main {
    static int x = 3;
    static int y = 4;
    static int z = 2;

    public static void main(String args[]) {

        hello();
        welcome();
        welcome();
        hello();
        sum(y, z);
        System.out.println();
        int e = umnozh(x, y, z);
        System.out.println(umnozh(x, x, x));
        System.out.println(e);
        System.out.println(umnozh(z, z, z));
        System.out.println(sum(y, y));
    }

    static void hello() {
        System.out.println("Hello");
    }

    static void welcome() {
        System.out.println("Welcome to Java 10 DRRRRRR");
    }

    static int sum(int a, int b) {
        int summ = a + b;
        System.out.println("x=" + a + " , y=" + b + " ,x+y=" + summ);
        return summ;
    }

    static int umnozh(int a, int b, int c) {
        int umn = a * b * c;
        System.out.println(a + " *" + b + " *" + c + " =" + umn);
        return umn;
    }
}