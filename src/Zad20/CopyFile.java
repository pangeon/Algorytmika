/*
Schildt 344
Ten program kopiuje plik tekstowy tworząc drugi o nowej nazwie. 
Nazwy pliku wejściowego i wyjściowego są podane w linii komend w postaci dwóch parametrów, 
na przykład TEST.TXT TESTWY.TXT
 */
package Zad20;

import java.io.*;
class CopyFile {
    public static void main(String args[]) throws IOException {
        
        int i;
        FileInputStream plikwe = null;
        FileOutputStream plikwy = null;
        // Sprawdzamy czy okreslono oba pliki
        if(args.length != 2) {
            System.out.println("Nie wskazano plikow");
            return;
        }
        // kopiowanie pliku
        try {
        // Próba otwarcia plików; exc jest kodem błędu - można go nie wyświetlać
            plikwe = new FileInputStream(args[0]);
            plikwy = new FileOutputStream(args[1]);
            do {
                i = plikwe.read();
                if(i != -1) plikwy.write(i);
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("Blad we/wy " + exc);
        }

        //to co po finally jest nieobowiązkowe - to tylko czyści bufory nawet jak coś pójdzie nie tak z przetwarzaniem plików
        finally {
            try {
                if(plikwe != null) {
                   plikwe.close();
                }
            } catch(IOException exc) {
                System.out.println("Blad zamykania pliku wejsciowego");
            }
            try {
                if(plikwy != null) {
                   plikwy.close();
                }
            //Read bytes from one file and write them to another.
            } catch(IOException exc) {
                System.out.println("Blad zamykania pliku wyjściowego");
            }
        }
    }
}

