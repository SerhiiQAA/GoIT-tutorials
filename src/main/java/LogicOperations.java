package main.java;

public class LogicOperations {
    public static void main(String[] args) {
        int a;
        a = 10;
        a = 20;
        System.out.println("a: " + a);

        int b = a;
        System.out.println("b: " + b);

        int c, d;
        c = d = b;
        System.out.println("c: " + c);
        System.out.println();

        a = 13;
        b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println();

        double e = 15;
        double f = 7;
        System.out.println(e / f);
        System.out.println();

        a = b + c * d;
        System.out.println(a);

        a = (b + c) * d;
        System.out.println(a);

        a = 15;
        b = 10;
        System.out.println();
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a - 5 >= b);
        System.out.println(a - 5 <= b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a + 10 <= b + 15);
        System.out.println(!(a + 10 <= b + 15));
        System.out.println(!(false));

        int i = 2;
        i++;
        System.out.println(i);
        i--;
        i--;
        System.out.println(i);

        i = 5;
        System.out.println();
        System.out.println(i++);
        System.out.println(i);

        i = 5;
        System.out.println();
        System.out.println(++i);
        System.out.println();

        i = 3;
        a = i++;
        System.out.println(a);
        i = 3;
        b = ++i;
        System.out.println(b);

        a = 10;
        b = 20;
        System.out.println();
        System.out.println(a > b || a < b);
        System.out.println(a > b || a > 30);
        System.out.println(a > b && a < b);
        System.out.println(a > 9 && b == 20);

        System.out.println();
        System.out.println(a + 10 > 15 || b - 5 > 10 && a < b );
        System.out.println(!(a + 10 > 15 || b - 5 > 10 && a < b ));

        a = 9;
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a, 5));

        a = 10;
        a = a + 5;
        System.out.println();
        System.out.println(a);
        System.out.println();

        a = 10;
        a += 5;
        System.out.println(a);
        a -= 5;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 3;
        System.out.println(a);

    }
}
