
package Zad2;

public class Zad2 {

    public static void main(String[] args) {
        /*
        Generujemy liczby całkowite z zadanego przedziału, 
        te z nich które są parzyste umieszczamy w wektorze 
        do momentu gdy ich suma nie przekroczy zadanej liczby.
        dla podanych niżej wartości:
        */
        int czy_parzysta = 2; //jeśli 1 - nieparzysta
        int ilw = 500;
        int ilw_2 = 20;
        int max = 100/czy_parzysta;
        int[] rob = new int[ilw];
        int[] rob_2 = new int[ilw_2];
        
        /*
        jeżeli zmniejszymy długość wektora z 500 do 20 
        program nie działa poprawnie. Dlaczego tak jest 
        i jak to poprawić?
        */
        System.out.println("Losowe liczby ilość: " + ilw_2 + " maks. wart: " + max*czy_parzysta);
        System.out.println("Wektor 1 - losowe liczby parzyste (1-500):");
        for (int j = 0; j < ilw; j++) {
            //chcąc uzyskać liczby parzyste mnoże wynik przez 2
            //suma liczb nieparzystych daje liczbe parzystą
            //suma liczb parzystych daje liczbę parzystą
            rob[j] = ((int)(max*Math.random()))*czy_parzysta;     
            System.out.print(" [" + j + "]=" + rob[j]);
        }
        // generuje losowo liczby parzyste
        System.out.println("");
        System.out.println("");
        System.out.println("Losowe liczby ilość: " + ilw_2 + " maks. wart: " + max*czy_parzysta);
        System.out.println("Wektor 2 - losowe liczby parzyste (1-20):");
        for (int j = 0; j < ilw_2; j++) {
            rob[j] = ((int)(max*Math.random()))*czy_parzysta; //tworzy wektor
            System.out.print(" [" + j + "]=" + rob[j]); //wyświetla jego część
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Losowe liczby ilość: " + ilw_2 + " maks. wart: " + max*czy_parzysta);
        System.out.println("Wektor 3 - losowe liczby nieparzyste i parzyste (1-20):");
        for (int j = 0; j < ilw_2; j++) {
            czy_parzysta = 1;
            rob[j] = ((int)(max*Math.random()))*czy_parzysta; //tworzy wektor
            System.out.print(" [" + j + "]=" + rob[j]); //wyświetla jego część
        }
        //do wektora 4 przypisujemy liczby parzyste wektora 3
        System.out.println("");
        System.out.println("");
        System.out.println("Wektor 4 - liczby parzyste i zera || wektor na bazie wektora 3:");
        System.out.println("Liczby nieparzyste przyjmują wart 0");
        System.out.println("Losowe liczby ilość: " + ilw_2 + " maks. wart: " + max*czy_parzysta);
        for (int i = 0; i < ilw_2; i++) {
            if (rob[i] % 2 == 0) {
                    rob_2[i] = rob[i];
                }
                System.out.print(" [" + i + "]=" + rob_2[i]);
                int count = rob_2.length;
            if (i == 19) {
                    System.out.println("");
                    System.out.println("dłogość wektora: " + count);
                }
            }
        } //rozpisanie zajęło trochę czasu ale nie znazłem problemu !
    }        
