package Zad29;

class Queue {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) { // constructor
        maxSize = s; // ustalam długość kolejki
        queArray = new int[maxSize]; // tworzę tablice, implementacja algorytmu
        // odbywa się poprzez tablice
        front = 0; // indeks elementu początkowego
        rear = -1; // koniec kolejki zawsze zero
        nItems = 0; // liczba elementów
    }
    /*
    Metoda insert() 
    Zakłada się że kolejka nie jest pełna. 
    Nie pokazano tego w main() ale trzeba 
    by wywoływać insert() dopiero po wywołaniu isFull() i
    otrzymaniu potwierdzenia że jest miejsce w tablicy.
    
    Normalnie wstawienie wiąże się z powiększniem końca kolejki (rear) 
    i wstawieniem do komórki która jest wskazana jako ten tył, 
    jednak jeżeli koniec jest na górze tablicy w miejscu maxSize-1, 
    musimy zawrócić do początku. Jest to robione przez ustawienie końca na -1; 
    wtedy po zwiększeniu będzie on miał wartość 0 - początku tablicy. 
    Na koniec zwiększane jest nItems.
    */
    public void insert(int j) { // umieść z tyłu kolejki
        if(rear == maxSize-1) { // deal with wraparound
            rear = -1;
        }
        queArray[++rear] = j; // inkrementacja i wstawianie
        nItems++; // jeszcze jeden
    }

    /*
    MetodA remove()
    Metoda remove() zakłada że kolejka nie jest pusta. Należy najpierw w zasadzie wywołać
    isEmpty() żeby to sprawdzić. Usuwanie zawsze zaczyna się od pobrania wartości 
    czoła i powiekszeniu jej. Jeżeli wychodzimy poza koniec tablicy, 
    wracamy na początek do 0.Wartość ta jest tymczasowo przechowywana 
    dopóki tego nie sprawdzimy, potem zmniejszane jest nItems.
    */

    public int remove() { // zabierz z przodu kolejki
        int temp = queArray[front++]; // uzyskuje wartość i przyrost przodu
        if(front == maxSize) { // deal with wraparound
            front = 0;
        }
        nItems--; // o jeden mniej
        return temp;
    }
    /*
    Metoda peek()jest prosta: 
    odczytuje wartość elementu początkowego. 
    Metody isEmpty(), isFull() i size() wykorzystują pole nItems sprawdzając 
    czy jego wartość to 0 (gdy maksimum) albo podając konkretną wartość.
    */

    public int peekFront() { // peek at front of queue
        return queArray[front];
    }

    public boolean isEmpty() { // true if queue is empty
        return (nItems==0);
    }

    public boolean isFull() { // true if queue is full
        return (nItems==maxSize);
    }

    public int size() { // number of items in queue
        return nItems;
    }
    // wyświetlam zawartość kolejki
    public void print() {
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.println("");
    }
} 
