package main.java;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(100);
        list.add(14);
        System.out.println(list.size());
        System.out.println();

        System.out.println(list.get(1));
        System.out.println();

        list.set(0, 150);
        System.out.println(list.get(0));
        System.out.println();

        list.remove(0);
        System.out.println(list.get(0));

        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println();

        for (int i = 0; i < 10; i++){
            list.add(i * 10);
        }
        System.out.println(list.size());
        System.out.println();

        for (int newList : list){
            System.out.println(newList);
        }
        System.out.println();

        List<Integer> list2 = new ArrayList<>();
        list2.add(42345);
        list2.add(12345);
        list2.add(62345);
        list2.add(72345);
        list2.add(82345);
        System.out.println(list2.size());
        System.out.println();

        list.addAll(list2);
        System.out.println(list.size());
        System.out.println();

        list.removeAll(list2);
        System.out.println(list.size());
        System.out.println();

        System.out.println(list2.isEmpty());
        System.out.println(!(list2.isEmpty()));
        System.out.println();

        list2.addAll(list);
        System.out.println(list2.size());
        System.out.println();

        System.out.println(list2.contains(72345));
        System.out.println(list2.contains(100000000));
        System.out.println();

        list2.addAll(list);
        System.out.println(list2.containsAll(list));
        System.out.println();

        list2.removeAll(list);
        System.out.println(list2.containsAll(list));
        System.out.println();


    }
}
