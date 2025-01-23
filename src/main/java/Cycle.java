package main.java;

public class Cycle {

    public static void main(String[] args) {

        System.out.println("Start");
        System.out.println();
        for (int i = 0; i < 10; i++){
            System.out.println(i * 10);
        }
        System.out.println();

        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
        System.out.println();

        int[] array = new int[10];
        for (int i = 0; i < 10; i++){
            array[i] = i * 10;          // add data in array
            System.out.println(array[i]);
        }
        System.out.println();

        for (int i = 0; i < 10; i++){
            System.out.println("Element with index " + i + "is: :" + array[i]);
        }
        System.out.println();

        for(int serhii : array){
            System.out.println(serhii);
        }
        System.out.println();

        String[] name = {"Seraphic", "Oleg", "Dmitro", "Saschko", "Peter"};

        for ( String names : name){
            System.out.println(names);// cycle for each
        }

        System.out.println(name.length);

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++){
            numbers[i] = i * 100;
        }
        for (int num : numbers){
            System.out.println(num);
        }
        System.out.println();

        int i = 0;
        boolean bool = true;
        while (bool){                          // while
            System.out.println("While: " + i);
            i++;
            if (i == 5) bool = false;
        }
        System.out.println();

        i = 3;
        do {                                   // do while
            System.out.println("Do: " + i);
            i++;
        } while (i < 5);

        int[] aw = new int[10];
        for (int j = 0; j < 10; j++){
            aw[j] = j * 100;
            System.out.println(aw[j]);
        }
        for (int newAW : aw){
            System.out.println(newAW);
            System.out.println(aw[9]);
        }

        System.out.println();
        System.out.println("Happy end!");
    }
}
