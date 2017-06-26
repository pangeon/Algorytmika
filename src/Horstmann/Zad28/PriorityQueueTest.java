/*

 */
package Horstmann.Zad28;

import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

public class PriorityQueueTest implements Comparator<GregorianCalendar>  {
    public static void main(String args[]) {
        PriorityQueue<GregorianCalendar> priority_queque = new PriorityQueue<>(new PriorityQueueTest());
        
        priority_queque.add(new GregorianCalendar(1986, Calendar.FEBRUARY, 15)); // moje urodziny
        priority_queque.add(new GregorianCalendar(1564, Calendar.FEBRUARY, 15)); // urodziny Galileusza
        priority_queque.add(new GregorianCalendar(1942, Calendar.JANUARY, 8)); // urodziny S.Hawkinga
        priority_queque.add(new GregorianCalendar(1879, Calendar.MARCH, 14)); // urodziny Einsteina
        
        System.out.println("Iteracja przez elementy...");
        for(GregorianCalendar date : priority_queque) {
            System.out.println(date.get(Calendar.YEAR));
        }
        System.out.println("Usuwanie elementów...");
        while(!priority_queque.isEmpty()) {
            System.out.println(priority_queque.remove().get(Calendar.YEAR));
        }
    }
    // co zrobić by sortowanie następowało w kolejności odwrotnej ?
    @Override
    public int compare(GregorianCalendar o1, GregorianCalendar o2) {
        return Integer.compare(o2.get(Calendar.YEAR), o1.get(Calendar.YEAR));
    }   
}

