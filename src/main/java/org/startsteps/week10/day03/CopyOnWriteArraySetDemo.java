package org.startsteps.week10.day03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hannover", "Berlin", "Frankfurt", "Leipzig", "Dresden");
        CopyOnWriteArraySet<String> cowArraySet = new CopyOnWriteArraySet<String>(list);

        System.out.println("Set = " + cowArraySet);

        Iterator<String> iterator1 = cowArraySet.iterator();

        // adding another element
        cowArraySet.add("Dortmund");

        while (iterator1.hasNext()) {
            System.out.println("Element from iterator1 : " + iterator1.next());
        }

        System.out.println("--------");
        Iterator<String> iterator2 = cowArraySet.iterator();

        while (iterator2.hasNext()) {
            System.out.println("Element from iterator2 : " + iterator2.next());
        }
    }
}
