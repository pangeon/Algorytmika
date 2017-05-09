/*
czytamy plik txt, zawartość wpisujemy w tablice napisów i wyświetlamy na ekranie, 
następnie dane z tablic zapisujemy w nowym pliku txt o podnej nazwie.
 */
package Zad19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class CzytajPlik {

        public static void main(String[] args) {
        int i,j;			
        int ilw = 260; //rozmiar tablicy
        int dn = 12;

        //tablice napisów w których umieszczamy wiersze odczytywanego pliku
        //wiersze są dzielone na części - nazwa i liczba
        
        String[] n1 = new String [ilw];
        String[] d1 = new String [ilw];
        String nazwa="";
        
        //czytanie nazwy pliku do przetwarzania
        /*klasa BufferedReader jest podklasą klasy Reader. Czyta tekst ze strumienia wejściowego do bufora.
        klasa InputStreamReader czyta bajty i przekształca  je na znaki. Każde wywołanie metod InputStreamReader 
        może powodować przeczytanie jednego lub więcej bajtów.
        System.in: standardowy strumień wejścia - domyślnie klawiatura
        */

        BufferedReader brIn=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("podaj polozenie i nazwe pliku");
        
        try {
            String adrespliku = brIn.readLine(); 
            // readLine: metoda klasy BufferedReader,czyta linie tekstu
            System.out.println(adrespliku + " :plik");
            nazwa = adrespliku;	
        }
        catch(IOException e){
            System.out.println("Blad odczytu: " + e);
        }

        // czytanie pliku tekstowego
        File plik = new File(nazwa);
        if (!plik.exists()) {    
            // metoda exists klasy File sprawdza czy plik istnieje
            System.out.println("Brak podanego pliku");   
            return;
        }
        else {
            System.out.println("Przetwarzam plik o nazwie" + plik.getName());
        }
        //metoda getName klasy File zwraca ścieżke do katalogu i nazwę pliku

        RandomAccessFile ra = null;
        /*
        klasa RandomAccessFile obsługuje czytanie i pisanie do pliku. 
        RandomAccessFile zachowuje sie jak wielka 
        tablica bajtów przechowywanych w systemie plików
        */
        try {
            ra = new RandomAccessFile(plik,"r");
        }
        catch (FileNotFoundException e){
            System.out.println("Blad przy otwarciu pliku!! " + e);
            return;
        }

        String ln = ""; //inicjacja zmiennej tekstowej

        //przetwarzanie pliku
        /*                
        readLine: metoda klasy BufferedReader - czyta linie tekstu
        trim: metoda klasy String - czyta napis opuszczając spacje wiodące i kończące
        substring: metoda klasy String, zwraca fragment napisu
        */
        try { //czyta cale linie z pliku do napotkania konca
            i=0;
            while((ln=ra.readLine()) !=null) {
                ln=ln.trim(); 		
                n1[i]=ln.substring(0,dn); //zapis nazwy w tablicy 
                d1[i]=ln.substring(dn+1); //zapis danej w tablicy
                i=i+1; 
            }	
        }
        catch (IOException e) {
            System.out.println("Blad czytania pliku"+e);
        }

        //wypisuje wektory do których wczytano plik txt
        System.out.println("dane");
        for (i=0;i<ilw;i++) {
            if (n1[i]==null) { 
                n1[i]="x";
            }
            System.out.println(n1[i]+ " "+d1[i]);
        }

        System.out.println("Podaj nazwę i położenie pliku wyjściowego");
        try {
            String line = brIn.readLine();	
            System.out.println(line+" :plik wynikowy");
            nazwa=line;
        }
        catch(IOException e) {
            System.out.print("Blad we/wy"+e);
            return;
        }
        //sprawdzanie ewentualnego istnienia w tym katalogu pliku o danej nazwie
        File file = new File(nazwa);
        if (file.exists()){
            System.out.println("Plik o podanej nazwie juz istnieje");
            return;
        }
        RandomAccessFile raf=null;
        try {
            raf=new RandomAccessFile(file, "rw");
        }
        catch (FileNotFoundException e) {
            System.out.println("Nie udało się utworzyć pliku");
            return;
        }

        //zapisywanie wektorów w pliku tekstowym
        String liniawy="";
        try {
            for (i=0;i<ilw;i++){
                liniawy=(n1[i]+ " "+d1[i]);
                raf.writeBytes(liniawy+"\n"+"\r");
            }
            System.out.println("Utworzono plik "+ nazwa);
            raf.close();
        }
        //metoda close klasy File zamyka plik - zwalniając zasoby

        catch(IOException e){
            System.out.print("Blad we/wy");
            return;
        } 
    }	
} 
