public class Main {
    public static void main(String args[]) {
        int x = 3;
        int y = 4;
        int z = 2;
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

        play("Tom", 34);
        play("Bob", 28);
        play("Sam", 23);
        sum(100, 50);
        umnozh(10, 10, 10);
        int w = umnozh(5, 5, 5);
        System.out.println(w);
        ar(100,1, 2, 3, 4, 5, 6);
    }

    static void play(String name, int age) {
        System.out.println(name);
        System.out.println(age);
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

    static void ar(int a,int... nums) {
        int res = 0;
        for (int i : nums
        ) {
            res += i;
        }
        System.out.println(res);
        res+=a;
        System.out.println(res);
    }


}