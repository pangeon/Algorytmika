
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
    int i,j;
    int pom;

    //generuje wektor
    for (i=0;i<ilw;i++)
            wek[i]=(int)(100*Math.random());	
    //wypisuje wygenerowany wektor
    System.out.println("Wektor danych: ");
    for (i=0;i<ilw;i++)
        System.out.print(wek[i]+ "  ");
    System.out.println();

    //sortowanie
    for (i=1;i<ilw;i++){
        for (j=ilw-1;j>=i;j--){
            System.out.print(j+" ");
            if (wek[j-1]>wek[j]){
                pom = wek[j-1];
                wek[j-1] = wek[j];
                wek[j] = pom;
            }
        }
    }
    //wypisuje posortowany wektor
    System.out.println("Wektor posortowany: ");
    for (i=0;i<ilw;i++)
        System.out.print(wek[i]+ "  ");
    }	
}