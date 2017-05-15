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
        int[] wek = {13,57,89,95};
        int[] wek1 = {25,56,58,67,69,70,76};
        
        int dl_wek = wek.length; // ilość elem. wek
        int dl_wek1 = wek1.length; // ilość elem. wek1
        int sum_dl_wek = dl_wek + dl_wek1; // suma elem. obu wek.
        System.out.println("dl_wek: " + dl_wek);
        System.out.println("dl_wek1: " + dl_wek1);
        System.out.println("sum_dl_wek: " + sum_dl_wek);
                
        int[] wek2 = new int[sum_dl_wek];
        
        for (int i = 0; i < dl_wek; i++) {
            wek2[i] = wek[i];
            if (i==0) {
                System.out.println("wek2: ");
            }
            System.out.print(" [ " + i + " ] " + wek2[i]);
        }
//        int j = 0;
//        for (int i = 3; i < dl_wek1; i++) {           
//            
//            wek2[i] = wek1[j];
//            if (i==0) {
//                System.out.println("wek2: ");
//            }
//            j += i;
//            System.out.print(" [ " + i + " ] " + wek2[i]);
//        }
    }        
}
