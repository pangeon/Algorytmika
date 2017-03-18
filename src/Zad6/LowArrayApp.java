/*
W array.java użyliśmy tablicy jako struktury do przechowania danych. 
Teraz umieścimy ją w klasie o nazwie LowArray. Stworzymy też metody 
przy pomocy których obiekty innych klas (tu: klasy LowArrayApp) 
mogą uzyskać dostęp to tej tablicy.
W lowArray.java, zapakowaliśmy tablicę. Tablica jest chroniona wewnątrz klasy,  
jest prywatna więc tylko metody klasy LowArray mają do niej dostęp. Są tu trzy metody:
setElem(), getElem() - dodawanie i odczytywanie elementu tablicy, oraz konstruktor, 
który tworzy pustą tablicę o określonym rozmiarze.
Inna klasa, LowArrayApp, tworzy obiekt typu LowArray 
i używa go do przechowywania i manipulowania danymi. 
Możemy myśleć o LowArray jako o narzędziu a LowArrayApp jest jego użytkownikiem. 
Podzieliliśmy zatem program na dwie klasy z jasno zdefiniowanymi rolami. 
Sposób w jaki klasy współpracują ze sobą określa się jako interfejs. 
Ponieważ pola w klasach są w typowym przypadku prywatne, gdy mówimy o interfejsie 
zazwyczaj mamy na myśli metody: co robią i jakie sa ich argumenty. 
Przez wywołanie tych metod użytkownik oddziaływuje na obiekty klasy. 
Interfejs do klasy LowArray w lowArray.java nie jest zbyt wygodny. 
Metody setElem()i getElem() działają jak operator [] w zwykłej tablicy. 
Użytkownik klasy reprezentowany przez metodę main() w klasie LowArrayApp 
działa na tak samo niskim poziomie jak w pierwotnej wersji programu - array.java. 
Jedyna różnica to taka, że odwołuje się do setElem() i getElem() zamiast do operatora []. 
Nie jest do końca jasne co to usprawnia? 
*/
package Zad6;
    
class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr; // reference
        arr = new LowArray(100); // create LowArray object
        int nElems = 0; // number of items in array
        int j; // loop variable

        arr.setElem(0, 77); // insert 10 items
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);

        nElems = 10; // now 10 items in array

        for(j=0; j<nElems; j++) { // display items
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println("");

        int searchKey = 26; // search for data item
        for(j=0; j<nElems; j++) { // for each element,
            if(arr.getElem(j) == searchKey) // found item?
                break;
        } if(j == nElems) { // no
            System.out.println("Can't find " + searchKey);
        } else { // yes
            System.out.println("Found " + searchKey);
        }
        // delete value 55
        for(j=0; j<nElems; j++) { // look for it
            if(arr.getElem(j) == 55) {
                break;
            }
        }
        for(int k=j; k<nElems; k++) { // move higher ones down
            arr.setElem(k, arr.getElem(k+1) );
        }
        nElems--; // decrement size

        for(j=0; j<nElems; j++) { // display items
            System.out.print( arr.getElem(j) + " ");
        }
        System.out.println("");
    } 
} 
 
