
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
        int l = 0;
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
        for (i=1;i<ilw;i++){ //i=0; i<(maks.15); 1++
            //przy każdym obrocie pętli a, gdzie wartości i wrastają wykonuj
            //(ilw-1) obrótów pętli b, gdzie wartości j maleją
            //i wzrasta tym samym j maleje np=(i=5 więc: j=14; 14>=5; 14--)
            //między 14 a 5 jest 9 liczb
            //j maleje do coraz większej granicy gdy i=15 pętla b zatrzymuje się
            //zmniejsza się ilość obrotów pętli b
            System.out.println(" i= "+i+" ");
            for (j=ilw-1;j>=i;j--) { //j=14; j>=(maks.14); 14--
                System.out.print(" j= "+j+" ");
                //jeżeli wartość jednej ze sładowych wektora, poprzedającej
                //następną po niej składową wektora jest większa.
                if (wek[j-1]>wek[j]){   //np. j=4; wek[3]>wek[4] | 12>6
                    pom = wek[j-1];     //np. pom = wek[3] | pom=12
                    wek[j-1] = wek[j];  //np. wek[3] = wek[4] | [3]6 zamiast [3]12
                    wek[j] = pom;       //np. wek[4] = pom czyli wek[4] = wek[3] | [4]12 zamiast [4]6
                    k++;                //licze obroty pętli z wystąpieniem warunku       
                    /*
                    wniosek:
                    zamieniamy wartości miejscami przypisujemy jedną z podmienienianych wartości
                    do zmiennej pomocniczej by jej nie "zgubić". Wykonywane jest coraz mniej porównań.
                    */   
                }
            }
            l++; //ilość obrotów pętli nie zmienia się
            
        }
        System.out.println("");
        System.out.println("ilość przesortowań jednostkowych: " + k);
        System.out.println("ilość przesortowań całościowych: " + l);
        double b = System.currentTimeMillis();
        System.out.println("Czas wykonania instrukcji: " + (b - a));
        System.out.println("Koniec sortowania...");
        
        //wypisuje posortowany wektor
        System.out.println("Wektor posortowany: ");
        for (i=0;i<ilw;i++) {
            System.out.print(" [" + i + "] = " + wek[i]+ " | ");
        }
    } //nie umiem wypisać kolejnych etapów sortowania wektora	
}