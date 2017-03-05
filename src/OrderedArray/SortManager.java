
package OrderedArray;

public class SortManager {
    
    private int[] wek = 
    {5,7,12,14,18,23,27,34,56,60,62,0,0,0,0,0,0,0,0,0};
    
    public void szukanie(int d) {
        System.out.println("metoda szukanie():");
        for (int i = 0; i < wek.length; i++) {
            if (d == wek[i]) {
                System.out.println("numer indexu: " + i);
                System.out.println("wartość: " + wek[i]);
            }
        }
        System.out.println("");
    }
    public void dopisywanie(int d) {
        System.out.println("metoda dopisywanie():");
        for (int i = 0; i < wek.length; i++) {
            
        }
        System.out.println("");
    }
    public void kasowanie(int d) {
        System.out.println("metoda kasowanie():");
        System.out.println("Usunięto: "  + wek[d] + " [" + d + "]");
        for (int i = d; i < wek.length; i++) {
            if (i < wek.length-1) { 
                wek[i] = wek[i+1];
            }
            
        }
        System.out.println("");
    }
    public void wypisz() {
        System.out.println("metoda wypisz():");
        for (int j = 0; j < wek.length; j++) {
            System.out.print(wek[j] + " ["+ j + "] " + " | ");
            if (j == wek.length-1) {
                System.out.println("\n");
            }
        }
    }
    public void przestawlewo() {
        System.out.println("wykonanie metody przestawlewo():");
        for (int i = 0; i < wek.length; i++) {
            if (i < wek.length-1) { 
                wek[i] = wek[i+1];
            }
        }
        System.out.println("");
    }
    public void przestawprawo() {
        System.out.println("wykonie metody przestawprawo():");
        for (int i = wek.length; i >= 0; i--) {    
            if (i < wek.length && i != 0) { 
                wek[i] = wek[i-1]; 
            }
            if (i == 0) {
                wek[0] = 0;
            }
        }
        System.out.println("");
    }
}
    

