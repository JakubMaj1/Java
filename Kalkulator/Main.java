package Kalkulator;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("\t \n MENU");
            System.out.println("Obliczenia z Command Line : wci�nij 1");
            System.out.println("Obliczenia z pliku tekstowego : wci�nij 2");
            System.out.println("Koniec programu : wci�nij 3");

            try {
                int choosedNumber = Integer.parseInt(JOptionPane.showInputDialog("Wybierz funkcje"));

                if (choosedNumber == 3) {
                    System.out.println("Koniec programu");
                    return;
                } else if (choosedNumber == 1) {
                    System.out.println("Napisz r�wnanie oraz wci�nij enter by dosta� wynik");
                    System.out.println("Liczby zmienno przecinkowe b�d� zamienione na ca�kowite.");
                    Scanner scan = new Scanner(System.in);
                    String temp = scan.nextLine();
                   
                    Kalkulator.RunCalculator(temp);
                } else if (choosedNumber == 2) {
                    System.out.println("Wybra�e� opcje wczytania r�wnania z pliku tekstowego !");
                    System.out.println("Plik zostanie wczytany z folderu gdzie znajduj� si� program.");
                    File file =
                            new File("C:\\Users\\106598\\eclipse-workspace\\Kalkulator\\src\\Kalkulator\\plik_tekstowy.txt");
                    Scanner sc;

                    int lineCount = 0;
                    {
                        try {
                            sc = new Scanner(file);
                        } catch (FileNotFoundException e) {
                            System.out.println("Brak takiego pliku ze �cie�k� " + e.getLocalizedMessage());
                            System.out.println("Spr�buj jeszcze raz");
                            continue;
                        }
                    }
                    while (sc.hasNextLine()) {
                        lineCount++;
                        System.out.println("Wczytanie linii numer " + lineCount);
                        String writenFromFile = sc.nextLine();
                        Kalkulator.RunCalculator(writenFromFile);
                    }
                    System.out.println("Brak kolejnych linii r�wna� do obliczenia");
                    System.out.println("Powr�t do menu");

                } else {
                    System.out.println("Nie poda�e� jednej z mo�liwych liczb ! Spr�buj jeszcze raz.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Wyst�pi� b��d -> " + e.getMessage());
                System.out.println("Najprawdopodobniej nie poda�e� liczby ! - koniec programu");
                return;
            }
        }
    }
}