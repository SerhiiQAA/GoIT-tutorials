package main.java;

public class Array {
    public static void main(String[] args) {

        String[] name = new String[34];
        int[] arr = new int[100];

        name[3] = "Serhii3";
        name[5] = "Serhii5";
        name[4] = "Serhii4";

        System.out.println(name[5]);
        System.out.println(name.length);

        arr[3] = 15;
        arr[4] = 20;
        System.out.println(arr[4]);

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array[0]);
        for (int i = 0; i < 5; i++){
            System.out.println(array[i]);
        }
        System.out.println();
        int[] arr2 = new int[15];
        for (int i = 0; i < 15; i++){
            arr2[i] = i * 10;
            System.out.println(arr2[i]);
        }

        System.out.println(arr2.length);
        System.out.println(arr2[arr2.length-1]);

    }
}
