/*
Proszę uruchomić i zanalizować działanie poniższego programu, modyfikując go i rozwijając w miarę możliwości.

 We wcześniejszych przykładach przechowywaliśmy dane prostego typu double; 
to upraszczało programy ale było oderwane od rzeczywistości. 
Naprawdę zazwyczaj przechowujemy rekordy złożone z pól różnych typów. 
W Javie rekord najczęściej jest reprezentowany przez obiekt jakiejś klasy. 
W poniższym programie mamy do tego klasę Person. 
Konstruktor tworzy nowy obiekt klasy Person i inicjuje jego pola, 
metoda displayPerson() wyświetla pola tego obiektu 
a metoda getLast() odczytuje nazwisko; jest to klucz wyszukiwania.
Program wykorzystujący klasę Person jest podobny do highArray.java, 
potrzebne jest tylko kilka zmian: 
- typ tablicy jest zmieniony na Person, 
- pole klucza jest obiektem typu String 
a więc porównania wymagają metody equals() a nie operatora ==.  
Metoda getLast() klasy Person odczytuje nazwisko obiektu a equals() dokonuje porównań:
if( a[j].getLast().equals(searchName) ) // found item?
Metoda insert() tworzy nowy obiekt Person i umieszcza go w tablicy

Lafore str. 91
 */
package Zad21;

class ClassDataApp {
public static void main(String[] args) {
        int maxSize = 100; // array size
        ClassDataArray arr; // reference to array
        arr = new ClassDataArray(maxSize); // create the array

        // insert 10 items
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);
        arr.displayA(); // display items

        String searchKey = "Stimson"; // search for item
        Person found;
        found=arr.find(searchKey);

        if(found != null) {
            System.out.print("Found ");
            found.displayPerson();
        } else {
            System.out.println("Can't find " + searchKey);
            System.out.println("Deleting Smith, Yee, and Creswell");
        }

        arr.delete("Smith"); // delete 3 items
        arr.delete("Yee");
        arr.delete("Creswell");
        arr.displayA(); // display items again
    }
}
