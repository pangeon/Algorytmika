/*
Proszę uruchomić poniższy program, testując jego działanie na różnych typach plików. 
Proszę pamiętać że wszystkie muszą mieć rozszerzenie .txt
Proszę sprawdzić, jak działa ten program, gdy uruchomimy go 
bez przekształcania wartości liczbowej batjtów na znaki
 */
package Zad18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileProsto {
    public static void main(String[] args) {
        int i;
        //tworzymy referencję obiektu 'pliczek' klasy FileInputStream 
        FileInputStream pliczek;
        //odczytujemy sciezke dostepu do pliku podaną jako argument 
        //w linii komend (File-Project Properties-Run-Arguments)
        //inaczej: próbujemy przyporządkować konkretny plik do naszego programu
        try {
            pliczek = new FileInputStream(args[0]);
            // argument metody main czyli nazwa pliku !
            // użyj wiersza poleceń !
        }   
        catch(FileNotFoundException exc) {
            System.out.println("Nie znaleziono pliku " + exc);
            return;
        }
        try {
        // czytamy bajty i wypisujemy je na ekranie, do osiągnięcia EOF 
            do {
                i = pliczek.read();      
                    if(i != -1) {
                        System.out.print((char) i);       
                    }
            } 
                //wart liczbowa znaku jest zamieniana na znak przy pomocy 
                //metody (char) - operacja 'cast'           
            while(i != -1);
        }
        catch(IOException exc) {
            System.out.println("Błąd czytania pliku ");
        }
    }
}
