
package Czarownice;

import java.util.Stack;

public class Flame {
    //statyczny obiekt z którego korzystamy cały czas
    static Stack stos_na_czarownice = new Stack();
    
    public static void main(String[] args) {
         //wyświetla ilość czarownic na stosie,
         //jeśli ich nie ma informuje o tym
         pokaz_grzesznice();
         
         //dodaje pojedyńczo w kolejności skazane na śmierć
         wrzuc("Rozpustnica Amelia");
         wrzuc("Stara Grzesznica");
         pokaz_grzesznice();
         
         //likwiduje skazane, licząc od dołu jak zostało wpisane
         pal(2);
         pokaz_grzesznice();
                  
         wrzuc("Diaboliczna Gertruda");
         wrzuc("Nierządnica Stefania");
         wrzuc("Kostropata Emma");
         pokaz_grzesznice();
         
         //szuka czarownicy opętanej przez demony 
         //jeśli jest żywa podaje która to
         //stos może pochłonąć na raz tylko 5 kobiet
         znajdz_opetana("Nierządnica Stefania");
         znajdz_opetana("Rozpustnica Amelia");
    }
    static void wrzuc(String wiedzma) {
        stos_na_czarownice.push(wiedzma);
    }
    static void pal(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println("Za grzechy śmierć poniosła: " + stos_na_czarownice.peek());
            stos_na_czarownice.pop();
        }
    }
    static void znajdz_opetana(String wiedzma) {
        int wybierz = stos_na_czarownice.search(wiedzma);
        if (wybierz < 0) {
            System.out.println("Tej opętanej już nie ma jest wśród grzesznic.");
        } else {
            System.out.println("Diabelska moc drzemie w jednej niewiernych.");
            switch (wybierz) {
                case 5:
                    System.out.println("To pierwsza z nich");
                    break;
                case 4:
                    System.out.println("To druga z nich licząc spopielone.");
                    break;
                case 3:
                    System.out.println("To trzecia z nich licząc spopielone.");
                    break;
                case 2:
                    System.out.println("To czwarta z nich licząc spopielone.");
                    break;
                case 1:
                    System.out.println("To piąta z nich licząc spopielone.");
                    break;
                default:
                    System.out.println("Inkwizycja ma pełne ręce roboty !");
            }
        }
    }              
    static void pokaz_grzesznice() {
        if(stos_na_czarownice.isEmpty()) {
            System.out.println("Stos jest pusty !");
        } else {
            System.out.println("Skazano: " + stos_na_czarownice);
        }
    }
    
}
