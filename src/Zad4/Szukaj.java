/*
Należy zmodyfikować umieszczoną poniżej klasę Szukaj. 
Została ona zmieniona: elementy (których jest teraz 15) są uporządkowane rosnąco 
a na końcu są zera. Interpretujemy to tak, że zer nie traktujemy jako element danych ale 
puste miejsca w wektorze – rezerwę  na rozszerzenie.

Należy stworzyć algorytm dodawania nowego elementu do wektora tak, aby zachować uporządkowanie. Przykładowo:
Wektor przed dodaniem: {4,7,9,12,13,14,17,45,57,89,0,0,0,0,0};

Wektor po dodaniu: liczby 19 {4,7,9,12,13,14,17,19,45,57,89,0,0,0,0,0};

Proszę zauważyć że algorytm dodawania łączy się z przesuwaniem elementów 
aby zrobić miejsce dla nowego, zatem przeglądanie od początku wektora będzie nieefektywne. 
Nie zajmujemy się tu wejściem z klawiatury (na razie), elementy dodawane wpisujemy w tekst programu.
 */
package Zad4;

class Szukaj{

    public static void main (String Args[]) {
        //int ilw = 20; ???
        int[] wek = {4,7,9,12,13,14,17,45,57,89,0,0,0,0,0};
        int i = 0;
        int pom = 0;
        int liczba_szukana = 9; //liczba szukana lub nowy element
        int liczba_wstawiana = 11;
        boolean znaleziono = false;

        //wypisuje wektor
        System.out.println("Oto wektor: ");
        for (i=0;i<wek.length;i++) {
            System.out.print(wek[i]+ "  ");
        }
        System.out.println();

        //szukanie
        i=0;
        znaleziono=false;
        while ((i<wek.length) && !znaleziono) {
            if (wek[i]==liczba_szukana) {
                System.out.println("Szukana liczba " + liczba_szukana);
                System.out.println("występuje na pozycji " +(i+1));
                znaleziono=true;
                pom = i+1;
            } else {  
              i++;
            }
        }
        if(wek[pom] < wek[pom+1]) {
            System.out.println("Warunek spełniony");
            System.out.println(wek[pom] + "<" + wek[pom+1]);
        }
        for (int j = 0; j < wek.length; j++) {
            if(wek[j] >= liczba_wstawiana){
                //System.out.print(j+" ");
                if(wek[wek.length-1] == 0) {
                    wek[j] = wek[j+1];
                } else {
                    break;
                }
//                if(wek[j+1] <= liczba_wstawiana) {
//
//                }
                System.out.print(wek[j]+" "+" |"+j+"| ");
            }
            //System.out.print(wek[j]+" ");
        }
        

        if (!znaleziono) {
            System.out.println("Nie znaleziono w wektorze liczby " +liczba_szukana);
        }
    }	
}
