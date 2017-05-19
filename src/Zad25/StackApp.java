/**
 * Przykład Lafore str. 93
Proszę zwrócić uwagę na istnienie konstruktora StackX w klasie StackX, 
który następnie jest wywoływany w metodzie głównej instrukcją:
StackX theStack = new StackX(10); // make new stack
która tworzy fizycznie tablicę. 
Zmienna "top" przechowuje indeks ostatniego elementu stosu; jest to potrzebne 
gdy przechowujemy stos w tablicy; gdy implementujemy stos przy pomocy listy 
z odsyłaczami ta informacja jest zbędna.
-------------------------------------------------------------------------------
* Metoda main() w klasie StackApp tworzy stos mogący przechować 10 elementów, 
układa na nim 4 elementy i wyświetla je pobierając je ze stosu aż go opróżni. 
Wyjście wygląda następujaco: 80 60 40 20
Proszę zauważyć że porządek danych jest odwrócony.
Metoda push()zwiększa zmienną "top" tak że wskazuje miejsce powyżej 
poprzedniego wierzchołka a potem układa tam następny element. 
Zwiększenie następuje zanim element jest umieszczony na stosie.
Metoda pop() zdejmuje element ze stosu i zmniejsza zmienną "top". 
Zdjęty element jest już niedostępny, choć fizycznie znajduje się nadal w tablicy. 
Dopiero nadpisanie jakimś innym kasuje go.
Metody isEmpty() oraz isFull() zwracają "true" 
jeżeli stos jest pusty lub pełen, odpowienio. 
Zmienna "top" ma wartość –1 jeżeli stos jest pusty a "maxSize-1" jeżeli jest pełen.
Ta wersja klasy StackX przechowuje dane typu double 
ale można go zmienić na dowolny inny, również obiektowy.
 */
package Zad25;

public class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10); // make new stack
        theStack.push(20); // push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        System.out.println(theStack.isEmpty()); // nie jest pusty - false
        while(!theStack.isEmpty()) { // until it's empty,
         // delete item from stack
            double value = theStack.pop();
            System.out.print(value); // display it
            System.out.print(" ");
        } // end while
        System.out.println("");
        System.out.println(theStack.isEmpty()); // jest pusty - true
    }
}