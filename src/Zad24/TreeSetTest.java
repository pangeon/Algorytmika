/*
 na podstawie 13.2.2. Listy tablicowe str. 684, kod 691 - Horstmann (część I wyd. polskie) 
    pomoc: https://www.cs.usfca.edu/~galles/visualization/Algorithms.html
 */ 
package Zad24;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Intel Nuc", 178432));
        parts.add(new Item("Arduino Nano", 903218));
        parts.add(new Item("Rasberry Pi 3", 052214));
        System.out.println(parts);
        
        SortedSet<Item> sortByDescription = new TreeSet<>(
        new Comparator<Item>() {
            @Override
            public int compare(Item a, Item b) {
                String descrA = a.getDescription();
                String descrB = b.getDescription();
                return descrA.compareTo(descrB);
            }    
        });
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);

    }
    
}
