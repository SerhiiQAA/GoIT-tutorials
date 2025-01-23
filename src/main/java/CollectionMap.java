package main.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();    // Key + value
        map.put(1, "Black");
        map.put(2, "White");
        map.put(3, "Yellow");

        System.out.println(map.get(3));
        System.out.println();

        System.out.println(map.size());
        System.out.println();

//        map.clear();
        System.out.println(map.size());
        System.out.println();

        map.put(5, "Green");
        System.out.println(map.size());
        System.out.println();

        System.out.println(map.containsKey(90));
        System.out.println(map.containsKey(2));
        System.out.println();

        System.out.println(map.containsValue("White"));
        System.out.println(map.containsValue("Green"));
        System.out.println(map.containsValue("Red"));
        System.out.println();

        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }
        System.out.println();

        map.put(1, "Red");           //new color
        System.out.println(map.get(1));
        System.out.println();

        Map<String, String> map1 = new HashMap<>();
        map1.put("boy", "Genry");
        map1.put("girl", "Annie");
        System.out.println(map1.size());
        System.out.println(map1.get("boy"));

    }
}
