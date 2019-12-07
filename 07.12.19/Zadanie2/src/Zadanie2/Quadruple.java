package Zadanie2;

import java.util.Scanner;

public class Quadruple<Pierwszy, Drugi, Trzeci, Czwarty> {
    private Pierwszy Pierwszy;
    private Drugi Drugi;
    private Trzeci Trzeci;
    private Czwarty Czwarty;

    protected Quadruple(Pierwszy Pierwszy, Drugi Drugi, Trzeci Trzeci, Czwarty Czwarty){
        this.Pierwszy=Pierwszy;
        this.Drugi=Drugi;
        this.Trzeci=Trzeci;
        this.Czwarty=Czwarty;
    }
    public Quadruple listCrew(){
        System.out.println("Pierwszy:"+Pierwszy);
        System.out.println("Drugi:"+Drugi);
        System.out.println("Trzeci:"+Trzeci);
        System.out.println("Czwarty:"+Czwarty);

        Quadruple quadruple = new Quadruple(Pierwszy,Drugi,Trzeci,Czwarty);

        return quadruple;
    }

    public static void main(String[] args) {

        Quadruple<String,String,String,String> quadrupleInstance = new Quadruple
                <String, String, String,String>
                ("Anna","Lukasz","Artut","Olaf");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String c = scanner.nextLine();

        quadrupleInstance.AddUserC(c);
        quadrupleInstance.AddUserB(a);
        quadrupleInstance.listCrew();
    }

    public void AddUserA(Pierwszy Pierwszy){
        this.Pierwszy=Pierwszy;
    }
    public void AddUserB(Drugi Drugi){
        this.Drugi=Drugi;
    }
    public void AddUserC(Trzeci Trzeci){
        this.Trzeci=Trzeci;
    }
    public void AddUserD(Czwarty Czwarty){
        this.Czwarty=Czwarty;
    }

}