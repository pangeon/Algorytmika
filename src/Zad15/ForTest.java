/*
Proszę uruchomić poniższy program i prześledzić uważnie jego działanie.
 */
package Zad15;

public class ForTest {
    public static void main(String[] args) throws java.io.IOException {
        int i;
        System.out.println("Press S to stop.");
        for(i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Pass #" + i);
            // CZEMU KOD WYKONUJE SIĘ 2 RAZY !!!
        }
    }    
}

