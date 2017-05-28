/*
Proszę uruchomić i przestudiować działanie poniższego programu 
- ilustrującego działanie kolejki priorytetowej:
Lafore wyd. 2 str. 172
 */
package Zad30;

import java.io.IOException;

class PriorityApp {
    public static void main(String[] args) throws IOException {
        PriorityQ thePQ = new PriorityQ(6);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);
        thePQ.insert(15);
        while(!thePQ.isEmpty()) {
            double item = thePQ.remove();
            System.out.print(item + " "); // 10, 20, 30, 40, 50
        } // end while
        System.out.println("");
    }   
}
