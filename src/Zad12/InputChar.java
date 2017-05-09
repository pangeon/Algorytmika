/*
Proszę uruchomić poniższą klasę (wewnątrz projektu o nazwie inputchar...).
Proszę zmodyfikować ją tak aby wyświetlana była wartość kodu wprowadzanego znaku. 
Np dla litery 'j' powinno wyświetlić 106.
 */
package Zad12;

import java.io.IOException;

public class InputChar {

    public static void main(String[] args) throws IOException {
        char zn;
        System.out.print("Press a key followed by ENTER: ");
        zn = (char) System.in.read(); // czyta wartość znaku!!
        int char_code = zn;
        
        //char – odpowiada jednemu znakowi (np. literze), 
        //może przechowywać liczby całkowite z zakresu od 0 do 65.535,
        //short – może przechowywać liczby całkowite z zakresu 
        //od –32.768 do 32.767 (za mało)
        //byte z zakresu od -128 do 127 (też za mało)
        
        System.out.println("Your key is: " + zn);
        System.out.println("Your char code is: " + char_code);
    }
    
}
