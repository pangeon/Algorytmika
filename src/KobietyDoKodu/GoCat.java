/*
Program przygotowany w oparciu o kurs
http://kobietydokodu.pl/
 */
package KobietyDoKodu;

public class GoCat {

    public static void main(String[] args) {
        
        Cat lapek = new Cat("Łapek");
        lapek.setCat_birth(2014, 7);
        lapek.setCat_weight(5.5f);
        lapek.setCat_patron("Joanna");
        
        lapek.CatShow();
    
    }    
}
