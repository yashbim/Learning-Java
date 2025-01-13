package org.example;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> locations = new LinkedList<String>();
        locations.add("Sri Lanka");
        locations.add("Brazil");
        locations.add("Germany");
        locations.add("USA");
        locations.add("India");
        locations.add("United Kingdom");
        printList(locations);

        locations.add(1, "Peru");
        printList(locations);

        locations.remove(4);
        printList(locations);
    }

    private static void printList(LinkedList<String> LinkedList) {
        Iterator<String> i = LinkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now at : " +i.next());
        }

        System.out.println("============");
    }
}
