/*
1. Program powinien być podzielony na metody wywoływane w klasie głównej 
(np. analogicznie do struktury programu HighArrayApp  (Lafore str. 49))

2. Program powinien czytać pliki txt o swobodniejsze strukturze - wynikającej 
z budowy wyjściowych tablic w arkuszu kalkulacyjnym (Health_June2011, 
Income_June2011. Można czytać bezpośrednio z arkusza ale to sporo pracy 
nie związanej z programowaniem w Java i sensowniesze wydaje sie 
jednak wypreparowanie potrzebnych kolumn, usunięcie nagłówków i
umieszczenie danych w łatwych do utworzenia plikach tekstowych 
- na przykład: Health_June2011.txt. Z takigo pliku należałoby wypreparować 
skróty nazw oraz człony liczbowe, w tym przykładzie długość życia

3. Operacja dobierania w klasycznej formie (w dawnych, słusznie minionych 
czasach, na taśmach  magnetycznych) robiona była bezpośrednio na plikach 
sekwencyjnych  - (czytanie na zmianę z dwóch plików wejściowych 
i zapisywanie dobranych rekordów w pliku wynikowym). 
Algorytm ten jest dość złożony i niezbyt dziś przydatny - 
w bazach danych dobieranie jest banalnie proste, więc można zostawić 
to w formie dobierania tablic tak jak jest. Poprawić trzeba tylko to, 
żeby nie powstawały puste linie (null) gdy coś się nie dobierze - 
trzeba sprytniej zmieniać indeksy pętli).

4. Można się pokusić o obliczenie współczynnika korelacji w Javie. 
Istnieją bilioteczne klasy do takich obliczeń (choć poza klasą 'Math'- 
trzeba raczej użyć zewnętrznych biliotek); można to też zrobić używając 
elementarnych operacji matematycznych. Zrozumienie zasady pomóc może 
wykonanie tych obliczeń w Excelu (funkcja: Formuły - Statystyczne - 
PEARSON lub WSP.KORELACJI).
 */
package Zad32;

import java.io.*;

public class Dob {
        public static void main(String[] args) {
        int i,j;	
        int ilw = 260;
        int dn = 8;

        String[] n1 = new String [ilw];
        String[] d1 = new String [ilw];
        String[] n2 = new String [ilw];
        String[] d2 = new String [ilw];
        String[] n3 = new String [ilw];
        String[] d3 = new String [ilw];
        String[] d4 = new String [ilw];
        String nazwa="";

        //czytanie nazwy pliku do przetwarzania
        BufferedReader brIn=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("podaj polozenie i nazwe pliku 1");
        try{
                String line = brIn.readLine(); 
                System.out.println(line+" :plik1");
                nazwa=line;	
        }
        catch(IOException e){
                System.out.println("Blad odczytu");
        }

        File plik= new File(nazwa);//odczytanie pliku tekstowego
        if (!plik.exists()){//sprawdza czy taki plik istnieje
                System.out.println("Brak podanego pliku");   
                return;
        }
                else {
                        System.out.println("Przetwarzam plik o nazwie" + plik.getName());
        }

        RandomAccessFile ra=null;
        try{
                        ra=new RandomAccessFile(plik,"r");
        }
        catch (FileNotFoundException e){
                System.out.println("Blad przy otwarciu pliku!!");
                return;
        }

        String ln="";//inicjacja zmiennej tekstowej

        //przetw 1 pliku


        try{ //czyta cale linie z pliku do napotkania konca
                i=0;
                while((ln=ra.readLine()) !=null){
                        ln=ln.trim(); 
                        //Returns a copy of the string, with leading and trailing whitespace omitted

                        n1[i]=ln.substring(0,dn); //zapis nazwy
                        d1[i]=ln.substring(dn+1); //zapis danej
                        i=i+1; 
                }//while	
        }//try
        catch (IOException e){
                System.out.println("Blad czytania pliku");
        }


        //wypisuje  wektory do kt wczytano plik txt
        System.out.println("dane1");
        for (i=0;i<ilw;i++){
                if (n1[i]==null) n1[i]="x";
                System.out.println(n1[i]+ " "+d1[i]);
        }

        //przetw 2 pliku

        //czytanie nazwy pliku do przetwarzania
        System.out.println("podaj polozenie i nazwe pliku 2");
        try{
                String line = brIn.readLine(); 
                System.out.println(line+" :plik2");
                nazwa=line;	
        }
        catch(IOException e){
                System.out.println("Blad odczytu");
        }


        File plik1 = new File(nazwa);//odczytanie pliku tekstowego
                if (!plik1.exists()){//sprawdza czy taki plik istnieje
                        System.out.println("Brak podanego pliku");   
                        return;
                }
                else {
                        System.out.println("Przetwarzam plik o nazwie" + plik1.getName());
                }

        RandomAccessFile rb=null;
        try{
                        rb=new RandomAccessFile(plik1,"r");
        }

        catch (FileNotFoundException e){
                System.out.println("Blad, przy otwarciu pliku!!");
                return;
        }

        try{ //czyta cale linie z pliku do napotkania końca	
                i=0;
                while((ln=rb.readLine()) !=null){
                        ln=ln.trim(); //odrzucenie skrajnych spacji
                        n2[i]=ln.substring(0,dn); //zapis nazwy
                        d2[i]=ln.substring(dn+1); //zapis danej
                        i=i+1;		
                }	
        }
        catch (IOException e){
                System.out.println("Blad czytania pliku");
        }
        //wypisuje  wektor
        System.out.println("dane2");
        for (i=0;i<ilw;i++){
                if (n2[i]==null) n2[i]="x";
                System.out.println(n2[i]+ " "+d2[i]);
        }


        //dobieranie wektorów, wyniki w 3
        //wynik jest niedoskonały - gdy nie dobierze się są null w wekt wynikowych
        //i pliku wynikowym
        //1 rozwiązanie: opuszczać null przy zapisywaniu do pliku - banalne
        //2 rozwiązanie: nie robić null

        String na="";
        String nb="";

        int k=0;

        i=0;
        while (i<ilw) {
                na=n1[i].trim(); 
                for (j=0;j<ilw;j++){ 
                        nb=n2[j].trim();
                        if (na.equals(nb)){
                                System.out.println(i+"  "+na+" i  "+nb);			
                                n3[i]=n1[j];
                                d3[i]=d1[j];                        
                                d4[i]=d2[j];  
                                //i++;                      
                        }                
                }
                i++;
        } 
        //wypisuje  wektory
        System.out.println("wyniki ost");
        for (i=0;i<ilw;i++)
                System.out.println(n3[i]+ " "+d3[i]+" "+d4[i]);


        //zapisywanie wektorów wy w pliku wynikowym

        System.out.println("Podaj nazwę i położenie pliku wyjściowego");
        try{
                String line = brIn.readLine();	
                System.out.println(line+" :plik wynikowy");
                nazwa=line;
        }
        catch(IOException e){
                System.out.print("Blad we/wy");
                return;
        }
        //sprawdzanie ewentualnego istnienia pliku
        File file = new File(nazwa);
        if (file.exists()){
                System.out.println("Plik o podanej nazwie juz istnieje");
                return;
        }
        RandomAccessFile raf=null;
        try{
                raf=new RandomAccessFile(file, "rw");
        }
        catch (FileNotFoundException e){
                System.out.println("Nie udało się utworzyć pliku");
                return;
        }


        //w pliku wy zapisywane sa tylko te linie gdzie nie było null
        String liniawy="";
        i=0;
        try {
            while (i<ilw){
                for (i=0;i<ilw;i++){          
                    liniawy=(i+"  "+n3[i]+ " "+d3[i]+" "+d4[i]);
                    raf.writeBytes(liniawy+"\r"+"\n");
                    i++;
                }           
            }
            System.out.println("Utworzono plik "+ nazwa);
            raf.close();
        }
        catch(IOException e){
            System.out.print("Blad we/wy");
            return;
        }    
    }  
}
