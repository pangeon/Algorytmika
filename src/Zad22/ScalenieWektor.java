/*
Proszę dokonać scalenia dwóch wektorów, umieszczając 
wyniki w trzecim. Scalenie polega na zapisaniu wartości wektorów 
z zachowaniem uporządkowania. 
Wynik działania programu dla poniższych wektorów:
powinien zatem wyglądać następująco: 
13 25 56 57 58 67 69 70 76 89 95 0 0 0...
Program powinien oczywiście działać  dla dowolnych długości wektorów 
(pierwszy może być dłuższy od drugiego i odwrotnie, 
mogą mieć też taką samą długość 
– ale każdy jest wypełniony do końca liczbami) i kombinacji ich wartości. 
Zakładamy że obydwa wektory wejściowe są posortowane rosnąco 
a wektor wynikowy jest na pewno dłuższy  niż suma ich długości 
(nie trzeba już tego sprawdzać, choć można wprowadzić taki bezpiecznik).

 */
package Zad22;

public class ScalenieWektor {

    public static void main(String[] args) {
        // identyczność zadeklarowanych nazw jak parametrów metody 
        // sort_array jest przypadkowa
        int[] wek = {13,57,89,95};
        int[] wek1 = {25,56,58,67,69,70,76};
        
        System.out.println("Metoda sum_array(): ");
        sum_array(wek, wek1, true); // suma dwóch zadeklarowych wcześniej tablic
        System.out.println("Metoda sort_array(): ");
        sort_array(sum_array(wek, wek1, false)); // sortowanie sumy wektorów
    }
    /* metoda sumująca wektory */
    static int[] sum_array(int[] wek, int[] wek1, boolean flag) {
        // dadaje dł. wektorów by otrzymać rozmiar nowej tablicy
        int dl_wek = wek.length + wek1.length;
        // inicjuje nową tablice o zdefiniowanym rozmiarze
        int[] wek2 = new int[dl_wek];
        for (int i = 0; i < dl_wek; i++) {
            // przypisuje elementy z tablicy pierwszej do trzeciej
            // numer ostatniego indexu - 1 to jej rozmiar
            if (i < wek.length) {  
                wek2[i] = wek[i];
            // przypisuje elementy z tablicy drugiej do trzeciej
            // w przypadku numeru indexu większego lub równego
            // rozmiarowi pierwszej tablicy
            } else {
                wek2[i] = wek1[i-wek.length];
            }
            // w celu uniknięcia podwójnego drukowania elementów tablicy 
            // podczas testowania
            if(flag == true) { 
                System.out.println(" [ " + i + " ] " + wek2[i]);
            }
        }
        return wek2;      
    }
    /* metoda sortująca wektor */
    static void sort_array(int[] tab) {
        for (int i = 0; i < tab.length; i++) {        
            if (tab[i] > tab[i+1]) {     
                // tab[1] - 56 > tab[2] - 23
                // tab[2-1] | tab[1+1]
                int temp; // ten większy
                temp = tab[i]; // zapisuje go
                tab[i+1] = temp; // przenoszę do kolejnego indexu
                tab[i] = tab[i+1]; // ten mniejszy przenoszę na dół         
            }
            System.out.println(" [ " + i + " ] " + tab[i]);
        }
    }
}
