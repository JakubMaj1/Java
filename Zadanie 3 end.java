package END;
import javax.swing.*;
import java.util.Scanner;

public class end {
    public static void main(String[] args) {

for(;;) {
    System.out.println("Dodaj kilka parametrow program je wyswietli , aby zako�czyc program wpisz 'end' ");
    Scanner scanner = new Scanner(System. in);
    String input = scanner. nextLine();
	System.out.println("Tw�j parametr to : " + input + " ");
    if(input.equals("end")){

        System.out.println("Koniec programu - wpisa�e� end");
        return;
    }
}
    }
}

