/*
przykład Lafore str. 96
program czyta napis zakończony znakiem Enter i wyświetla go w odwrotnej kolejności.
koniec - pusty Enter

Utworzyliśmy klasę Reverser do odwracania wprowadzonego łańcucha. 
Jej kluczowym komponentem jest metoda doRev(), 
która przeprowadza odwracanie używając stosu. Stos jest tworzony wewnątrz doRev(), 
która to metoda określa jego rozmiar stosownie do długości wprowadzonego stringa. 
W metodzie main() otrzymujemy łańcuch od użytkownika, tworzymy obiekt Reverser 
ze stringiem jako argumentem konstruktora, wywołujemy metodę doRev() 
i wyświetlamy zwracaną wartość (odwrócony łańcuch).
 */

package Zad26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while(true) {
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString(); // read a string from kbd
            if(input.equals("")) // quit if [Enter]
                break;
            // make a Reverser
            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev(); // use it
            System.out.println("Reversed: " + output);
        }
    }
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
} 
