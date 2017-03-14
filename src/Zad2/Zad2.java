
package Zad2;

public class Zad2 {

    public static void main(String[] args) {
        /*
        Generujemy liczby całkowite z zadanego przedziału, 
        te z nich które są parzyste umieszczamy w wektorze 
        do momentu gdy ich suma nie przekroczy zadanej liczby.
        dla podanych niżej wartości:
        */
        int ilw = 500; 
        int max= 100;
        int[] rob = new int[ilw];
        
        /*
        jeżeli zmniejszymy długość wektora z 500 do 20 
        program nie działa poprawnie. Dlaczego tak jest 
        i jak to poprawić?
        */
        
        for (int j = 0; j < ilw; j++) {   
            rob[j] = (int)(max*Math.random());
            if(rob[j] % 2 == 0) {
                System.out.println("ilw = " + ilw + " | max = " + max + " | rob = " + rob[j]);
            }
        }
        // nie rozumiem gdzie szukać problemu.
        
        
    }
    
}
