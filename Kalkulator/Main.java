package Kalkulator;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("\t \n MENU");
            System.out.println("Obliczenia z Command Line : wciœnij 1");
            System.out.println("Obliczenia z pliku tekstowego : wciœnij 2");
            System.out.println("Koniec programu : wciœnij 3");

            try {
                int choosedNumber = Integer.parseInt(JOptionPane.showInputDialog("Wybierz funkcje"));

                if (choosedNumber == 3) {
                    System.out.println("Koniec programu");
                    return;
                } else if (choosedNumber == 1) {
                    System.out.println("Napisz równanie oraz wciœnij enter by dostaæ wynik");
                    System.out.println("Liczby zmienno przecinkowe bêd¹ zamienione na ca³kowite.");
                    Scanner scan = new Scanner(System.in);
                    String temp = scan.nextLine();
                   
                    Kalkulator.RunCalculator(temp);
                } else if (choosedNumber == 2) {
                    System.out.println("Wybra³eœ opcje wczytania równania z pliku tekstowego !");
                    System.out.println("Plik zostanie wczytany z folderu gdzie znajdujê siê program.");
                    File file =
                            new File("C:\\Users\\106598\\eclipse-workspace\\Kalkulator\\src\\Kalkulator\\plik_tekstowy.txt");
                    Scanner sc;

                    int lineCount = 0;
                    {
                        try {
                            sc = new Scanner(file);
                        } catch (FileNotFoundException e) {
                            System.out.println("Brak takiego pliku ze œcie¿k¹ " + e.getLocalizedMessage());
                            System.out.println("Spróbuj jeszcze raz");
                            continue;
                        }
                    }
                    while (sc.hasNextLine()) {
                        lineCount++;
                        System.out.println("Wczytanie linii numer " + lineCount);
                        String writenFromFile = sc.nextLine();
                        Kalkulator.RunCalculator(writenFromFile);
                    }
                    System.out.println("Brak kolejnych linii równañ do obliczenia");
                    System.out.println("Powrót do menu");

                } else {
                    System.out.println("Nie poda³eœ jednej z mo¿liwych liczb ! Spróbuj jeszcze raz.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Wyst¹pi³ b³¹d -> " + e.getMessage());
                System.out.println("Najprawdopodobniej nie poda³eœ liczby ! - koniec programu");
                return;
            }
        }
    }
}