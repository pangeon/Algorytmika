/** na podstawie 13.2.1. Listy powiązane str. 674, kod 681 - Horstmann (część I wyd. polskie) 
    pomoc: https://www.cs.usfca.edu/~galles/visualization/Algorithms.html
    ---------------------------------------------------------------------
    * public Iterator<E> iterator()

    Returns an iterator over the elements in this list in proper sequence.

    Returns:
    an iterator over the elements in this list in proper sequence
    --------------------------------------------------------------------
    * public boolean hasNext()
    Returns true if the iteration has more elements. 
    (In other words, returns true if Iterator.next would 
    return an element rather than throwing an exception.)

    Returns:
    true if the iteration has more elements
    --------------------------------------------------------------------
    * public E next()
    Returns the next element in the list and advances the cursor position. 
    This method may be called repeatedly to iterate through the list, 
    or intermixed with calls to ListIterator.previous to go back and forth. 
    (Note that alternating calls to next and previous will 
    return the same element repeatedly.)

    Returns:
    the next element in the list 

    Throws:
    NoSuchElementException - if the iteration has no next element
*/
package Horstmann.Zad24;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Sowa");
        linkedList.add("Vizvary");
        linkedList.add("Filutowicz");
        
        List<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Marchlewska");
        linkedList2.add("Matusiak");
        linkedList2.add("Siwocha");
        linkedList2.add("Kaźmiarczak");
        
        // scalenie list
        
        // tworze iteratory - wskazują one na miejsce na liście
        ListIterator<String> iter = linkedList.listIterator();
        Iterator<String> iter2 = linkedList2.iterator();

        while(iter2.hasNext()) {
            if(iter.hasNext()) {
                iter.next();
            }
            iter.add(iter2.next());
        }
        System.out.println("linkedList: " + linkedList);
        
        // usunięcie drugiego słowa z LinkedList2
        iter2 = linkedList2.iterator();
        
        while(iter2.hasNext()) {
            iter2.next();
            if (iter2.hasNext()) {
                iter2.next(); // opuszczenie następnego elementu
                iter2.remove(); // usunięcie elementu
            }
        }
        System.out.println("linkedList2: " + linkedList2);
        
        // usunięcie wszystkich słów znajdujących się w liście b z lista a
        linkedList.remove(linkedList2);
        
        System.out.println("linkedList (po modyfikacji):" + linkedList);        
    }    
}
