/*
 Narzędzia do pracy z plikami
 */
package Zad23;

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
}
