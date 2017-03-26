/* Klasa HighArray jest teraz opakowana dookoła tablicy. 
W procedurze main(), tworzymy tablicę tej klasy 
i dokonujemy prawie tych samych operacji jak w programie lowArray.java: 
wstawiamy 10 elementów, szukamy elementu (którego tam nie ma) i wyświetlamy tablicę. 
Ponieważ to jest takie łatwe, usuwamy trzy elementy (0, 55, and 99) zamiast jednego 
i ostatecznie  znów wyświetlamy tablicę:

77 99 44 55 22 88 11 0 66 33
Can't find 35
77 44 22 88 11 66 33

Proszę zauważyć jak krótka i prosta jest metoda main(). 
Szczegóły, które musiały być zawarte w main() w lowArray.java  
są teraz zapisane w metodach klasy HighArray.
W HighArray class, metoda  find() przegląda tablice szukając elementu 
którego indeks przekazano jej jako argument. Zwraca true lub false.
Metoda insert() umieszcza nowy element w dostępnym miejscu tablicy. 
Pole nElems przechowuje liczbę aktualnie wykorzystanych elementów tablicy.
Metoda delete() szuka elementu, którego indeks dostała jako argument 
i gdy go znajdzie przesuwa wszystkie elementy o wyższych indeksach w dół 
– nadpisując go -  oraz  zmniejsza wartość w polu nElems. 
Metoda display() wyświetla tablicę.
W lowArray.java, kod w  main() dla znajdowania elementu ma osiem linii, w 
highArray.java, tylko jedną. 
Użytkownik w HighArrayApp.class, nie musi myśleć o indeksach 
i innych szczególach tablicy. Właściwie nie musi w ogóle wiedzieć 
w jakiej strukturze danych informacje są przechowywane przez HighArray.class! 
Ta struktura jest ukryta za interfejsem. Ten mechanizm określamy jako abstrakcję.
*/
package Zad7;

public class WysokaTablica {
    private double[] a; // ref to array a
    private int nElems; // number of data items
    private double s=0;

    public WysokaTablica(int max) // konstruktor: metoda wywoływana zawsze w momencie
            //tworzenia obiektu w pamięci; nigdy nie zwaraca wyniku, musi mieć nazwę
            //taką samą jak klasa. Może mieć parametry; tu parametrem jest zmienna
            //całkowita 'max'
    {
        a = new double[max]; // tworzenie wektora 'a' o długości max'
        nElems = 0; // na razie bez elementów
        //to jest tylko metoda - będzie użyta - wywołana w klasie HighArrayApp
    }

    public boolean find(long searchKey) {
     // find specified value
        int j;
        for(j=0; j<nElems; j++) { // for each element,
            if(a[j] == searchKey) {// found item?
                break; // exit loop before end
            } 
        }
        if(j == nElems) { // gone to end?
            return false;
        } else { // yes, can’t find it
            return true;
        }// no, found it
    } // end find()

    public void insert(double value) { // umieszczanie el w tablicy - na końcu
        a[nElems] = value; // insert it 
        nElems++; // increment size
    }

    public boolean delete(double value) {
        //metoda wywoływana jest z parametrem 'value' - wartość do usunięcia
        //a zwraca wartość logiczną - usunięto lub nie znaleziono
        int j;
        for(j=0; j<nElems; j++) { // look for it
            if( value == a[j] ) {
                break;
           }
        }
        if(j==nElems) { // can't find it
            return false;
        } else { // found it
            for(int k=j; k<nElems; k++) { // move higher ones down
                a[k] = a[k+1];
            }
            nElems--; // decrement size
            return true;
        }
    } // end delete()

    public void display() { // displays array contents 
        for(int j=0; j<nElems; j++) { // for each element,
            System.out.print(a[j] + " ");
        } // display it
        System.out.println("");
    }
    public void sumuj() {
        double suma = 0;
        for (int j = 0; j < nElems; j++) {
            suma += a[j];
        }
        System.out.println(suma);
    }
}
