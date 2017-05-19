/*
 na podstawie 13.2.1. Listy tablicowe str. 684, kod 686 - Horstmann (część I wyd. polskie) 
    pomoc: https://www.cs.usfca.edu/~galles/visualization/Algorithms.html
 */
package Zad24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetTest {
/* liczy wszystkie unikatowe słowa z pliku tekstowego */
    public static void main(String[] args) {
        // stosując ArrayList można policzyć wszystkie słowa
        Set<String> words = new HashSet<>(); // implementuje interfejs set
        long totalTime = 0;
        
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            totalTime += callTime;
        }
        Iterator<String> iter = words.iterator();
        for (int i = 0; i <= 20 && iter.hasNext(); i++) {
            System.out.println(iter.next());
        }
        System.out.println(". . .");
        System.out.println(words.size() + " liczba unikatowych słów. " +
        totalTime + "milisekund");
        
    }
    
}
