/*
Proszę uruchomić i prześledzić działanie poniższego programu. 
Proszę zwrócić uwagę na różnice w stosunku do programu ReadBytes.
 */
package Zad14;

class Czytajnapis {
    public static void main(String args[]) throws java.io.IOException {
        String napis="";
        int ilezn=5;
        int k;
        
        System.out.print("Wprowadź napis "+ilezn+"-znakowy i naciśnij Enter ");
        for (k=0; k<ilezn; k++) {
            napis=napis+(char)System.in.read(); // do stringa przyklejam char
        }
        System.out.println(napis);

    }
}
