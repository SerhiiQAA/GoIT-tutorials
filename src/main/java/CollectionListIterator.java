package main.java;
// It`s really cool!
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionListIterator {
    public static void main(String[] args) {
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            list3.add(i);
        }
        System.out.println(list3.size());
        System.out.println();

        for (int news : list3){
            System.out.println(news);
        }
        System.out.println();

        Iterator<Integer> iterator = list3.iterator();       //Iterator
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());  //true
        System.out.println();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
