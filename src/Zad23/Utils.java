/*
 Narzędzia do pracy z plikami
 */
package Zad23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
    /* odchylenie standardowe jest pierwiastkiem z wariancji 
    a wariancja średnią kwadratów odchyleń od średniej arytmetycznej. */
    static void OdStand(double[] kolejne_proby) {
        int ilosc_prob = kolejne_proby.length; 
        double[] badanie = new double[ilosc_prob];
        double sr_arytm = 0;
        double[] odchylenia = new double[ilosc_prob];
        double[] kw_odchylen = new double[ilosc_prob];
        double suma_kw_odch = 0;
        double wynik = 0;
        for (int i = 0; i < kolejne_proby.length; i++) {
            badanie[i] = kolejne_proby[i];
            sr_arytm += badanie[i];
        }
        sr_arytm /= ilosc_prob;
        for (int i = 0; i < badanie.length; i++) {
            odchylenia[i] = badanie[i] - sr_arytm;
            kw_odchylen[i] = Math.pow(odchylenia[i], 2);
            suma_kw_odch += kw_odchylen[i]; 
        }
        wynik = Math.sqrt(suma_kw_odch / (ilosc_prob-1));
        System.out.println("----------------------------");
        System.out.println("ilosc prob: " + ilosc_prob);
        System.out.println("sr_arytm: " + sr_arytm);
        for (int i = 0; i < odchylenia.length; i++) {
            System.out.println("odchylenia: [ " + i + " ] " + odchylenia[i]);
            System.out.println("kw_odchylenia: [ " + i + " ] " + kw_odchylen[i]);
        }
        System.out.println("suma_kw_odch: " + suma_kw_odch);
        System.out.println("----------------------------");
        System.out.println("Wynik: " + wynik);
        
    }
    static String[] readFile(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String textLine = bufferedReader.readLine();
        String[] tab = new String[208];
        do {
            System.out.println(textLine);
            for (int i = 0; i < tab.length; i++) {
                tab[i] = bufferedReader.readLine();
                System.out.println(tab[i]);
            }
            bufferedReader.close();
            return tab;

        } while(textLine != null);
    }
    static void splitColumn(String[] file) {
        String[] tokens = null;
        for (String line : file) {        
            tokens = line.split(" ");
            System.out.println(tokens[tokens.length-1]);
        }

  
    }

        /* sugestia
            ArrayList<String> linie = new ArrayList<String>();
            String linia = null;
            while ((linia = bfr.readLine()) != null) {
                linie.add(linia);
            }

            for (String l: linie) {
            String[] tokens = l.split(","); // podzial po przecinku
            for (String token: tokens) {
                System.out.print("[" + token + "] ");
            }
                System.out.println();
            }
        */
        
}
