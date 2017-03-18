/*
Sortowanie bąbelkowe (przez prostą zamianę). 
Przypomnijmy sobie słowny opis tego algorytmu:
1. Porównujemy pierwszy element z drugim i jeżeli drugi jest mniejszy – 
zamieniamy je miejscami (jeżeli jest większy nic nie robimy)
2. Powtarzamy tę operację dla elementu drugiego i trzeciego – aż do końca ‘wektora’
3. Jeżeli nie dokonaliśmy żadnej zamiany – elementy są już uporządkowane;  
jeżeli zrobiliśmy choć jedną – wracamy na początek wektora i porównujemy 
znów wszystkie pary elementów.
*/
package Zad3;

class SortBubble_one{

    public static void main (String Args[]) {
        int dl_vector = 15;
        int[] wek = new int[dl_vector];
        int i = 0;
        int j = 0; //określa sumę przesortowań
        int pom = 0;
        boolean flaga = true;
        int test = 0;

        //generuje wektor
        for (i=0;i<dl_vector;i++) {
            wek[i]=(int)(100*Math.random());
        }
        //wypisuje wygenerowany wektor (wart. 0-100)
        System.out.println("Wektor bazowy: ");
        for (i=0;i<dl_vector;i++) {
            System.out.print(" [" + i + "] = " + wek[i]+ " | ");
        }
        System.out.println();

        //sortowanie
        System.out.println("Początek sortowania...");
        double a = System.currentTimeMillis();
        
        do {
            flaga=false;
            for (i=1;i<dl_vector;i++){
                System.out.print(" [" + i + "] = " + wek[i]+ " |"); //wyniki kolejnych przesortowań
                
                if (i == dl_vector-1) {
                    System.out.println(""); //niezbędne do łamania linii
                }
                if (wek[i]<wek[i-1]){
                    pom = wek[i];
                    wek[i] = wek[i-1];
                    wek[i-1] = pom;
                    flaga=true;
                }
            }
            j++; //suma przeortowań - inkrementacja przy każdym obrocie pętli
        }
        while (flaga);
        System.out.println("ilość przesortowań: " + j);
        double b = System.currentTimeMillis();
        System.out.println("Czas sortowania: " + (b - a));
        System.out.println("Koniec sortowania...");

        //wypisuje posortowany wektor
        //czyli podstawia pod indexy rosnące wartości wektora bazowego
        System.out.println("Wektor posortowany: ");
        for (i=0;i<dl_vector;i++) {
            System.out.print(" [" + i + "] = " + wek[i]+ " | ");
        }
    } // sortowanie mało efektywne
}
