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
        int ilw = 15;
        int[] wek = new int[ilw];
        int i,j;
        int pom;
        boolean zamieniono;

        //generuje wektor
        for (i=0;i<ilw;i++)
                wek[i]=(int)(100*Math.random());	
        //wypisuje wygenerowany wektor
        System.out.println("Wektor danych: ");
        for (i=0;i<ilw;i++)
            System.out.print(wek[i]+ "  ");
        System.out.println();

        //sortowanie
        do {
            zamieniono=false;
            for (i=1;i<ilw;i++){
                if (wek[i]<wek[i-1]){
                    pom = wek[i];
                    wek[i] = wek[i-1];
                    wek[i-1] = pom;
                    zamieniono=true;
                }
            }
        }
        while (zamieniono);

        //wypisuje posortowany wektor
        System.out.println("Wektor posortowany: ");
        for (i=0;i<ilw;i++)
            System.out.print(wek[i]+ "  ");

    }	
}
