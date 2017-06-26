/*
Proszę uruchomić i przestudiować działanie poniższego programu - ilustrującego działanie kolejki:
Lafore str. 163
 */
package Zad29;

public class QueueApp {
 
public static void main(String[] args) {
        
    Queue theQueue = new Queue(5) {}; // kolejka posia 5 pozycji
    theQueue.print();
    
    theQueue.insert(10); // dodaje 4 wartości
    theQueue.insert(20);
    theQueue.insert(30);
    theQueue.insert(40);
    
    theQueue.print();
    
    theQueue.insert(66); // dodaje 4 wartości
    theQueue.insert(77);
    theQueue.insert(88);
    theQueue.insert(99);
    
    theQueue.print();
    
    theQueue.remove(); // usuwam trzy wartości
    theQueue.remove(); // od góry (10, 20, 30)
    theQueue.remove();

    
    theQueue.insert(50); // wstawiam 4 dodatkowe wartości
    theQueue.insert(60); // (okrąża się ???)
    theQueue.insert(70);
    theQueue.insert(80);
    theQueue.insert(90);
    
    theQueue.print();
    
    // KONIEC OZNACZA OSTATNI DODANY ELEMENT DO KOLEJKI OD TEGO MIEJSCA POZOSTAŁE SĄ
    // WYPYCHANE

    // instrukcja remove() znajduje się w pętli ! 
    while(!theQueue.isEmpty()) { // usuwam i wyświetlam
        // wszystkie wartości
        int n = theQueue.remove(); // usuwam (40, 50, 60, 70, 80)
        // póki nie będzie puste
        System.out.print(n); // ilość obrotów, do n przypisuje każda usuniętą
        // wartość
        System.out.print(" ");
    }
    System.out.println("");
    
    // Queue i Deque w Javie to interfejsy nie klasy !!!!
    } 
} 
