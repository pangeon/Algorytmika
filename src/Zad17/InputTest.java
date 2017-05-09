/*
Ten program demonstruje pobieranie danych z konsoli.
Metody klasy Scanner
Scanner in = new Scanner(System.in); //tworzenie obiektu
String name = in.nextLine(); //czyta wiersz
String firstName = in.next(); //czyta słowo
int age = in.nextInt(); //czyta liczbę
 */
package Zad17;

import java.util.Scanner;

public class InputTest
{
public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        
        System.out.print("Jak się nazywasz? "); // Pobranie pierwszej porcji danych.
        String name = in.nextLine(); 
        
        System.out.print("Ile masz lat? "); // Pobranie drugiej porcji danych.
        int age = in.nextInt();
        
        // Wydruk danych w konsoli.
        System.out.println("Witaj użytkowniku " 
        + name + ". W przyszłym roku będziesz mieć " 
        + (age + 1) + "lat.");
    }
}
