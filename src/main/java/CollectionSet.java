package main.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//Unique data. Without method Get!!!!!!!!!!!!!!!!!!!
public class CollectionSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++){
            set.add(i);                       // Unique data only!!!!!!!!! Without method Get
        }
        System.out.println(set.size());
        System.out.println();

        for (int nset : set){
            System.out.println(nset);
        }
        System.out.println();

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() );
        }

        set.remove(1);
        set.clear();
        System.out.println(set.contains(9));

    }
}
