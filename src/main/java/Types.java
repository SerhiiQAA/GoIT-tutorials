package main.java;

public class Types {
    public static void main(String[] args) {
        byte a = 5; //-128 127
        short b = -100; //-32768 32767
        int c;
        c = 1000000;
        long d = -1223323544;
        System.out.println(a);
        System.out.println("byte a: " + a);
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("long d: " + d);

        double double1 = 123.143;
        float float1 = 150.4346343f;
        System.out.println("double d: " + double1);
        System.out.println("float d: " + float1);

        boolean booleanTrue = 1 > 0;
        boolean booleanFalse = 1 < 0;
        System.out.println(booleanTrue);
        System.out.println(booleanFalse);

        String str1 = "Hellow";
        String str2 = "World!";
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        char char1 = 'd';
        System.out.println(char1);

    }
}
