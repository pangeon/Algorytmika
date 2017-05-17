/*
Obliczyć odchylenie standardowe dla dochodów (z pliku Inc.txt) 
wg. definicji: odchylenie standardowe jest pierwiastkiem z wariancji 
a wariancja średnią kwadratów odchyleń od średniej arytmetycznej. \
Dla sprawdzenia można porównać obliczenia przy pomocy funkcji 
'Odchylenie standardowe populacji' arkusza kalkulacyjnego 
Excel lub (dla zaawansowanych) spróbować obliczyć odchylenie standardowe 
używając klasy Javy: StandardDeviation.
 */
package Zad23;

import java.io.IOException;

public class OdchylenieStand { 
    public static void main(String[] args) throws IOException {
        double[] tab = {3.7, 3, 8, 9, 13.8};
        Utils.OdStand(tab);
        String file[];
        String column[] = new String[10];
        file = Utils.readFile("C:\\Users\\Kamil\\Documents\\NetBeansProjects\\Algorytmika\\src\\Zad23\\Inc.txt");
        Utils.splitColumn(file);
        for (int i = 0; i < 10; i++) {
            column[i] = file[i];
            System.out.println(column[i]);
        }
    }
}
