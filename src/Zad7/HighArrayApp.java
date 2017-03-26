
package Zad7;

public class HighArrayApp {

    public static void main(String[] args) {
        int maxSize = 100; // array size

        //tworzymy obiekt klasy HighArray:
        WysokaTablica tablica_przyrostowa; // reference to array
        tablica_przyrostowa = new WysokaTablica(maxSize); // create the array

        // insert 10 items
        // kazde wywołanie metody insert() zwiększa nElems o 1
        tablica_przyrostowa.insert(77); //wywołujemy metodę insert działającą na tablicty 'arr'
        tablica_przyrostowa.insert(99);
        tablica_przyrostowa.insert(44);
        tablica_przyrostowa.insert(55);
        tablica_przyrostowa.insert(22);
        tablica_przyrostowa.insert(88);
        tablica_przyrostowa.insert(11);
        tablica_przyrostowa.insert(00);
        tablica_przyrostowa.insert(66);
        tablica_przyrostowa.insert(33);
        tablica_przyrostowa.insert(1); //sam dopisałem nElems = 11

        tablica_przyrostowa.display(); // display items

        int searchKey = 35; // search for item
        if(tablica_przyrostowa.find(searchKey)) {
            System.out.println("Found " + searchKey);
        }
        else {
            System.out.println("Can't find " + searchKey);
        }
        searchKey = 35; // search for item


        tablica_przyrostowa.delete(00); // delete 3 items

        //dodano
        searchKey=56; //szukamy nieistniejacego aby skasować
        tablica_przyrostowa.delete(56); if (!tablica_przyrostowa.delete(56)) { 
            System.out.println("nie ma "); 
        }
        //arr.delete(56)==false
        tablica_przyrostowa.delete(99);
        tablica_przyrostowa.display(); // display items again
        tablica_przyrostowa.sumuj();
    }
}
