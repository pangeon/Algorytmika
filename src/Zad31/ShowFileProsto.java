/*
Proszę uruchomić następujący, zmodyfikowany program ShowFileProsto dla pliku dane.txt 
z zadania maturalnego. Proszę ustawić w linii komend ścieżkę dostępu do pliku!
Proszę zwrócić uwagę na znaki końca wiersza (10 13) oraz końca pliku (-1).
Proszę rozbudować ten program w ten sposób, aby łączyć ciągi znaków w łańcuchy 
i tworzyć z  nich liczby (albo przez konkatenację łańcuchów 
albo przez metodę Append klasy String)
 */
package Zad31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileProsto {
    public static void main(String[] args) {
        int i;
        //tworzymy referencję obiektu 'pliczek' klasy  FileInputStream 
        FileInputStream pliczek;
        //odczytujemy sciezke dostepu do pliku podaną jako argument 
        //w linii komend (File-Project Properties-Run-Arguments)
        //inaczej: próbujemy przyporządkować konkretny plik do naszego programu
        //System.out.println();
        try {
            pliczek = new FileInputStream(args[0]);
        }   
        catch(FileNotFoundException exc) {
            System.out.println("Nie znaleziono pliku "+exc);
            //System.out.println("Nie znaleziono pliku ");
            //exc - tam wyświetla się polski komunikat
            //(Nie można odnaleźć określonego pliku)
            //wyk jest getLocalizedMessage - jedna z metod klasy FileNotFoundException
            return;
        }
        try {
        // czytamy bajty i wypisujemy je na ekranie, do osiągnięcia EOF 
            do {
                i = pliczek.read();      
                //if(i != -1) {System.out.print((char) i);
                if((i != -1)&&(i!=10)) {
                    System.out.print(i+" ");
                } else {
                    System.out.println(i+" ");
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
