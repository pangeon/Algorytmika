/*
Program przygotowany w oparciu o kurs
http://kobietydokodu.pl/
 */
package KobietyDoKodu;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Cat {
    private String cat_name;
    // obiekt Calendar musi zostać zainicjalizowany ! domyślnie aktualny rok
    private final GregorianCalendar cat_birth;
    private Float cat_weight;
    private String cat_patron;

    // kostrutor wymusza wpisanie jedynie imienia kota
    // pozostałe pola są inicjalizowane domyślnymi wartościami
    public Cat(String cat_name) {
        this.cat_name = cat_name;
        this.cat_weight = new Float(0);
        this.cat_birth = new GregorianCalendar();
        this.cat_patron = "bezdomny";
    }   
    public String getCat_name() {
        return cat_name;
    }
    // zwraca liczbę całkowitą, czyli rok
    public int getCat_birth() {
        return cat_birth.getWeekYear();
    }
    public Float getCat_weight() {
        return cat_weight;
    }
    public String getCat_patron() {
        return cat_patron;
    }
    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }
    public void setCat_birth(int year, int month) {
        cat_birth.set(year, month, Calendar.DAY_OF_MONTH);   
    }
    public void setCat_weight(Float cat_weight) {
        this.cat_weight = cat_weight;
    }
    public void setCat_patron(String cat_patron) {
        this.cat_patron = cat_patron;
    }   
    void CatShow() {
        System.out.println("---DANE KOTA---");
        System.out.println("1.    Imię: " + getCat_name()); 
        System.out.println("2.    Rok urodzin: " + getCat_birth()); 
        System.out.println("3.    Waga: " + getCat_weight()); 
        System.out.println("4.    Opiekun: " + getCat_patron());
        System.out.println("----------------");
        if (getCat_birth() == 2017) {
            System.out.println("Określ date urodzenia zwierzaka.");           
        }
        if (getCat_weight() == 0) {
                System.out.println("Twój kot nie ma określonej wagi.");
            }
        if (getCat_weight() > 15f) {
                System.out.println("Twój pupil powinien przejść na dietę.");
        }
    }
    
}
