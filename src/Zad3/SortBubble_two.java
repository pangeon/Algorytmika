
/* 
Analizując dokładniej działanie powyższego algorytmu 
można zauważyć że każde przejście wewnętrznej pętli powoduje, 
że najmniejszy w danym momencie element przesuwa się na sam początek; 
nie trzeba zatem za każdym razem porównywać początkowych, 
już uporządkowanych elementów 
– można za każdym razem zaczynać zamiany trochę dalej. 
Spróbujcie napisać taki ulepszony algorytm.
 */
package Zad3;

class SortBubble_two{

    public static void main (String Args[]) {
        int ilw = 15;
        int[] wek = new int[ilw];
        int i = 0;
        int j = 0;
        int k = 0;
        int pom = 0;

        //generuje wektor
        for (i=0;i<ilw;i++) {
            wek[i]=(int)(100*Math.random());
        }
        //wypisuje wygenerowany wektor
        System.out.println("Wektor bazowy: ");
        for (i=0;i<ilw;i++) {
            System.out.print(" [" + i + "] = " + wek[i]+ " | ");
        }
        System.out.println();

        //sortowanie
        System.out.println("Początek sortowania...");
        double a = System.currentTimeMillis();
        for (i=1;i<ilw;i++){ 
            System.out.print(wek[i]+" ");
            for (j=ilw-1;j>=i;j--) {
                System.out.print(j+" ");
                if (j == ilw-1) {
                    System.out.println("");
                }
                if (wek[j-1]>wek[j]){
                    pom = wek[j-1];
                    wek[j-1] = wek[j];
                    wek[j] = pom;
                    k++;
                }
            } 
        }
        System.out.println("");
        System.out.println("ilość przesortowań: " + k);
        double b = System.currentTimeMillis();
        System.out.println("Czas sortowania: " + (b - a));
        System.out.println("Koniec sortowania...");
        
        //wypisuje posortowany wektor
        System.out.println("Wektor posortowany: ");
        for (i=0;i<ilw;i++) {
            System.out.print(" [" + i + "] = " + wek[i]+ " | ");
        }
    }	
}