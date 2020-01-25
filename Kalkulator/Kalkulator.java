package Kalkulator;

import java.util.List;

import static Kalkulator.HelperStaticMethods.*;


public class Kalkulator {


    static void RunCalculator(String equation) {

     
        String inputArray = equation.replaceAll("\\s+", "");
        List<Integer> indexesToRemoveList = FindDotsAndCommas(inputArray);
        StringBuilder stringBuilder = new StringBuilder(inputArray);

        int removeCount = 0;
        for (int tempIndex : indexesToRemoveList) {
            stringBuilder.deleteCharAt(tempIndex - removeCount);
            removeCount++;
        }

        inputArray = stringBuilder.toString();

        int operationsCount = 0;

        int index = 0;
        double tempResult = 0;
        boolean first = true;
        for (char ch : inputArray.toCharArray()) {
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                if (!CheckOrder(inputArray.toCharArray(), index)) {
                    System.out.println("Zla kolejnosc b¹dŸ nie wpisana liczba ! Sprobuj jeszcze raz");
                    continue;
                }

                if (ch == '+') {
                    tempResult = Sum(inputArray.toCharArray(), index, tempResult, first);
                    operationsCount++;
                    first = false;
                }
                if (ch == '-') {
                    tempResult = Subtraction(inputArray.toCharArray(), index, tempResult, first);
                    operationsCount++;
                    first = false;
                }
                if (ch == '/') {
                    tempResult = Division(inputArray.toCharArray(), index);
                    operationsCount++;
                    first = false;
                }
                if (ch == '*') {
                    tempResult = Multiplication(inputArray.toCharArray(), index, tempResult, first);
                    operationsCount++;
                    first = false;
                }
            }
            index++;
        }

        if (operationsCount == 0) {
            System.out.println("BRAK WYKONANYCH OPERACJI ! Spróbuj ponownie !");
            return;
        }

        System.out.println("Wynik to = " + tempResult);
    }
}