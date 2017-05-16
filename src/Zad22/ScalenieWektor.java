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
        /*
        Sortowanie bąbelkowe:
        ---------------------
        Sterowanie przepływem:
            1) Pętla kończy swoje wykonywanie gdy "warunek A" jest równy false
            (w przeciwnym razie wykonuje się w nieskończoność).
            2) Pętla wykonuje się conajmniej raz przed sprawdzeniem "warunku A".
            3) "Blok D" zawiera informacje o zmianie stanu flagi na false
            (pętla jednak nie kończy swego działania).
            4) "Blok D" inicjuje wykonanie "bloku E".
            5) "Blok F" jest zamknięty w "bloku E" będącym pętlą.
            6)  Wykonanie "bloku F" warunkuje zmianę flagi na true;
            7) Flaga będzie zmieniania dopóki spełniony będzie "warunek B",
            występujący w "bloku E".
            8) Brak spełniania "warunku B" warunkuje brakiem wykonania "bloku F",
            w którym to następuje zmiana flagi na true.
            9) Flaga false oznacza zamknięcie pętli.
        Sortowanie:
        ---------------------
            1) Spełnienie "warunku B", koniecznego do wykonania "bloku F".
            2) Przypisanie do zmiennej "temp" n-elementu z tablicy.
            3) Przypisanie do n-elementu elementu go poprzedzającego
            (o indexie mniejszym o 1)
            4) Przypisanie do elementu o indexie mniejszym o 1 niż ten, na którym
            operuje instrukcja 2 wartości zmiennej temp opisanej w instrukcji 1
            5) Zamiana kolejności elementów z tablicy
            6) Operacja wykonywana do uzyskania uporządkowania
            (chodzi o kolejność rosnącą)
        */
        boolean flag = true;
        int temp;
        // blok D
        do { 
            flag = false;
            // blok E
            for (int i = 1; i < tab.length; i++) { 
                // blok F    
                if (tab[i] < tab[i-1]) { // warunek B 
                    temp = tab[i]; // instr 1
                    tab[i] = tab[i-1]; // instr 2
                    tab[i-1] = temp; // intr 3
                    flag = true;
                }
            }
        }    
        while (flag); // warunek A
        for (int i = 0; i < tab.length; i++) {
            System.out.println(" [ " + i + " ] " + tab[i]);
        }
    }
}
