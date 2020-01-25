package Kalkulator;

import java.util.ArrayList;
import java.util.List;

public class HelperStaticMethods {

    static List<Integer> FindDotsAndCommas(String word) {
        List<Integer> tempList = new ArrayList<Integer>();
        int index = 0;

        for (char ch : word.toCharArray()) {
            if (ch == '.' || ch == ',') {
                tempList.add(index);
                for (int i = 1; i < 1000; i++) {
                    if (Character.isDigit(word.toCharArray()[index + i])) {
                        tempList.add(index + i);
                    } else {
                        break;
                    }
                }
            }

            index++;
        }
        return tempList;
    }

    static boolean CheckOrder(char[] tempArray, int index) {
        try {
            if (Character.isDigit(tempArray[index - 1])) {
                return true;
            } else if (Character.isDigit(tempArray[index + 1])) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    static double Sum(char[] tempArray, int index, double tempResult, boolean first) {
        int countOfDigitsUnForward = HowManyDigits(tempArray, index, false);
        int countOfDigitsForward = HowManyDigits(tempArray, index, true);

        int a = FullValue(tempArray, countOfDigitsUnForward, index, false);
        int b = FullValue(tempArray, countOfDigitsForward, index, true);

        double result = 0;
        if (first) {
            result = a + b;
        } else {
            result = tempResult + b;
        }
        return result;
    }

    static double Multiplication(char[] tempArray, int index, double tempResult, boolean first) {
        int countOfDigitsUnForward = HowManyDigits(tempArray, index, false);
        int countOfDigitsForward = HowManyDigits(tempArray, index, true);

        int a = FullValue(tempArray, countOfDigitsUnForward, index, false);
        int b = FullValue(tempArray, countOfDigitsForward, index, true);

        double result = 0;
        if (first) {
            result = a * b;
        } else {
            result = tempResult * b;
        }
        return result;
    }


    static double Division(char[] tempArray, int index) {
        int countOfDigitsUnForward = HowManyDigits(tempArray, index, false);
        int countOfDigitsForward = HowManyDigits(tempArray, index, true);

        int tempA = FullValue(tempArray, countOfDigitsUnForward, index, false);
        int tempB = FullValue(tempArray, countOfDigitsForward, index, true);
        Double a = new Double(tempA);
        Double b = new Double(tempB);
        double result = a / b;
        return result;
    }

 
    static double Subtraction(char[] tempArray, int index, double tempResult, boolean first) {
        int countOfDigitsUnForward = HowManyDigits(tempArray, index, false);
        int countOfDigitsForward = HowManyDigits(tempArray, index, true);

        int a = FullValue(tempArray, countOfDigitsUnForward, index, false);
        int b = FullValue(tempArray, countOfDigitsForward, index, true);

        double result = 0;
        if (first) {
            result = a - b;
        } else {
            result = tempResult - b;
        }
        return result;
    }

  
    static int HowManyDigits(char[] tempArray, int index, boolean forward) {
        int result = 0;
        if (forward) {
            for (int i = 1; i < tempArray.length - index; i++) {
                if (Character.isDigit(tempArray[index + i])) {
                    result = i;
                } else {
                    break;
                }
            }
        } else {
            for (int i = 1; i < index + 1; i++) {
                if (Character.isDigit(tempArray[index - i])) {
                    result = i;
                } else {
                    break;
                }
            }
        }
        return result;
    }

    
    static int FullValue(char[] tempArray, int count, int index, boolean forward) {
        char[] charArray = new char[count];
        if (forward) {
            for (int i = 1; i < count + 1; i++) {
                charArray[i - 1] = tempArray[index + i];
            }
        } else {
            for (int i = 1; i < count + 1; i++) {
                charArray[i - 1] = tempArray[index - (count - i + 1)];
            }
        }

        String result = "";

        for (char ch : charArray) {
            result = result + Character.getNumericValue(ch);
        }
        return Integer.parseInt(result);
    }

}