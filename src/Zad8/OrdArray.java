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
        int j;
        for(j=0; j<nElems; j++) { // find where it goes
            if(a[j] > value) { // (linear search)
                break;
            }
        }
        for(int k=nElems; k>j; k--) { // move higher ones up
            a[k] = a[k-1];
            for(int m=0; m<20; m++) { // for each element,
                System.out.print(a[m] + " "); // display it
            }
            System.out.println();
        }
        a[j] = value; // insert it
        nElems++; // increment size
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

