/*
Program jest podobny do highArray ale metoda find szuka binarnie,
dla uproszczenia w metodzie insert zastosowano szukanie liniowe.
Klasa OrdArray zawiera nową metodę size(), która zwraca ilość elementów 
* danych znajdujących się obecnie w tablicy. 
* Jest to przydatne dla metody main() gdy wywoływana jest metoda find(). 
* Jeżeli find() zwraca nElems, szukanego elementu nie ma w tablicy.
Lafore str. 84
*/

package Zad8;

class OrdArray {
    private double[] a; // ref to array a
    private int nElems; // number of data items

    public OrdArray(int max) { // constructor
        a = new double[max]; // create array
        nElems = 0;
    }
    public int size() { 
        return nElems; 
    }
    public int find(double searchKey) {

        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;

        while(true) {
            curIn = (lowerBound + upperBound ) / 2;
            if(a[curIn]==searchKey) {
                return curIn; // found it else
            }
            if(lowerBound > upperBound) {
                return nElems; // can't find it
            } else { // divide range
                if(a[curIn] < searchKey) {
                    lowerBound = curIn + 1; // it's in upper half
                } else { 
                    upperBound = curIn - 1; // it's in lower half
                }
                // end else divide range
            } // end while
        }
    } // end find()
    public void insert(double value) { // put element into array
        System.out.println("Dodaje do tablicy: " + value);
        /*fukcja porządkuje/sotuje dane
        tablica jest ZAWSZE POSORTOWANA BO DODAJEMY DO POSORTOWANEJ TABLICY
        */
        
        //wchodzę do pętli nElems zostało z zera zw. o 1 czyli teraz jest 1
        int j; // j = 0; wart pomocnicza, musi być zainicjowana wcześniej,
               // bo jest użyta w twóch pętlach
        for(j=0; j<nElems; j++) { // find where it goes
            // j=0; j<1; j++ - jeden obrót pętli
            if(a[j] > value) { // (linear search) // liczba dodawana do tablicy
                // jest porównywana z każdym indexem, jeśli jest mniejsza od któregoś,
                // pętla zostaje przerwana
                // jeśli warunek jest spełniony to znaczy że dodawana liczba nie jest
                // największa, j zatrzyma się przy liczbie mniejszej od dodawanej.
                // LICZBY SĄ POSORTOWANE, więc jasnym będzie gdzie wstawić liczbę
                // a[0], czyli 77, a[1] czyli 99 są równe value, a więc nie są mniejsze
                // pętla nie zostaje przerwana (?);
                System.out.println("Niewłaściwa kolejność zostanie skorygowana !");
                break;
            }
        }
        //wchodzę do pętli k=1 bo nElems = 1; (k to 1) > 0; k schodzi w dół 1 razy
        for(int k=nElems; k>j; k--) { // move higher ones up
            //(a[k] to wartość a[1] czyli 99) - zostaje przypisane do a[k-1] czyli a[0]
            // czyli wartość 77
            a[k] = a[k-1]; // zamiast 99 liczba 77 przypisana do indexu o jeden dalej
                           // co z poprzednim indexem ?
            // nie rozumiem po co ten blok (?)
//            System.out.println("etapy wykonania metody:");
//            for(int m=0; m<20; m++) { // for each element,
//                System.out.print(a[m] + " "); // display it
//            }
//            System.out.println();
        }
        a[j] = value; // insert it a[0] = 77;
        nElems++; // increment size
        for (j = 0; j < nElems; j++) {
            System.out.print("[" + j + "] " + a[j] + " | ");
        }
        
    } // end insert()
    public boolean delete(double value) {
        int j = find(value);
        if(j==nElems) { 
            return false; // can't find it
        }
        else { // found it
            for(int k=j; k<nElems; k++) // move higher ones down
                a[k] = a[k+1];
            nElems--; // decrement size
            return true;
        }
    } // end delete()
    public void display() { // displays array contents
        for(int j=0; j<nElems; j++) { // for each element,
            System.out.print(a[j] + " "); // display it
        }
        System.out.println("");
    }
} // end class OrdArray

