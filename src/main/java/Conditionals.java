package main.java;

public class Conditionals {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Start with Serhii!");
        if (i > 10) {
            System.out.println("i > 10");
            i++;
            System.out.println(i);
            System.out.println(i);
        }
        else if (i < 10 && i > 5) {
            System.out.println("i < 10 and i > 5");
            i--;
            System.out.println(i);
        }
        else {
            System.out.println("Nothing");
        }
        System.out.println();

        i = 91;
        if (i > 50) {
            System.out.println("i > 50");
            if (i > 90) {
                System.out.println("i >= 90");
            }
            else {
                System.out.println("i <= 90");
            }
        }
        else {
            System.out.println("i <= 50");
        }
        System.out.println();

        i = 2;
        switch (i){
            case 1:
                System.out.println("Then number is 1");
                break;
            case 2:
                System.out.println("Then number is 2");
                break;
            case 3:
                System.out.println("Then number is 3");
                break;
            default:
                System.out.println("I don`t know the number!");
        }

        System.out.println();

        i = 950;
        switch (i){
            case 100:
                System.out.println("100");
                break;
            case 50:
                System.out.println("50");
                break;
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("Hmmmmmmmmmmmmmmmmmmmm! I don`t know!");
        }

        System.out.println("End! To be continued with Serhii!");
    }
}
