package main.java;

public class Str {
    public static void main(String[] args) {
        String a = "Hellow Serhii!";
        System.out.println(a.equals("Hellow Serhii!")); // true

        String a2 = "Hellow";
        System.out.println(a.equals(a2)); //false
        System.out.println();

        a = "text";
        a2 = "TEXT";
        System.out.println(a.equals(a2));
        System.out.println(a.equalsIgnoreCase(a2));
        System.out.println();

        a = "NexT";
        System.out.println(a.toLowerCase()); //next
        System.out.println(a.toUpperCase()); // NEXT

        System.out.println();
        System.out.println(a.charAt(1)); //e
        System.out.println(a.indexOf("xT")); //2

        a = "Hellow, Serhii!";
        System.out.println();
        System.out.println(a.contains("He"));
        System.out.println(a.length());

        System.out.println();
        System.out.println(a.startsWith("H")); //true
        System.out.println(a.endsWith("!")); //true

        a = "Hellow world!";
        System.out.println();
        String[] arr = a.split("");
        System.out.println(arr[7]); //w
        System.out.println();

        String str = "My name %s! It`s %d years old!";
        int age = 40;
        String name = "Serhii";
        System.out.println(String.format(str, name, age));
        System.out.println();

        String age2 = "30";
        int num = Integer.parseInt(age2);
        System.out.println(num * 3);
        System.out.println();

        a = "Hellow my friend!";
        System.out.println(a.substring(1, 5)); // ello
        System.out.println(a.substring(10)); // friend!
        System.out.println();

        System.out.println(a.substring(7, a.length() -2)); // my frien
        System.out.println();

        String a1 = "Hellow ";
        a2 = "world";
        String a3 = "! ";
        String a4 = "I`m fun with coding!";
        String res;
        res = a1 + a2 + a3 + a4;
        System.out.println(res);
        System.out.println();

        res = a1.concat(a2).concat(a3).concat(a4);
        System.out.println(res + " It`s really cool!");

    }
}
