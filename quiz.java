import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class quiz {
	public static void main(String[] args) throws FileNotFoundException
	{
	    File file = new File("Quiz.txt");
       
        
	    String absolutePath = file.getAbsolutePath();
	    System.out.println("W tej lokalizacji powinien znajdowa� si� plik txt : "+absolutePath);
		
	    
		
	    Scanner scan = new Scanner(System.in);
		Scanner scanner = new Scanner(file);
		int ilePytan = 0;
		int punkt =0;
		System.out.println();
		System.out.println("Aby odpowiedz zosta�a zaliczona wybierz tylko litery 'a' 'b' 'c' 'd'");
			
			while (scanner.hasNext())
			{
				System.out.println();
				System.out.println(" PYTANIE " + (ilePytan+1)  );
				String pytanie = scanner.nextLine();
				System.out.println(pytanie);
				
				String a = scanner.nextLine();
				System.out.print("Odpowiedz a) ");
				System.out.println(a);
		
				String b = scanner.nextLine();
				System.out.print("Odpowiedz b) ");
				System.out.println(b);
		
				String c = scanner.nextLine();
				System.out.print("Odpowiedz c) ");
				System.out.println(c);
		
				String d = scanner.nextLine();
				System.out.print("Odpowiedz d) ");
				System.out.println(d);
				System.out.println();
				String prawidlowaOdp = scanner.nextLine();
				System.out.print("Dokonaj wyboru :   ");
				
				ilePytan= ilePytan+1;
				
				String odp = scan.nextLine();
		
				if (odp.equals(prawidlowaOdp))
				{
					System.out.println("Uda�o si� dobra odpowiedz. +1 punkt\n");
					
			 punkt = punkt+1;
					
					
				}
				else
				{
					System.out.println("Nie uda�o si� to z�a odpowiedz, powinienie� wybra� " + prawidlowaOdp + "\n");
				}
				
				System.out.println("```````````````````````````````````````````````````````````````````");
			}
			
			switch(punkt) {
			case 0:
				System.out.println("Bardzo s�aby wynik my�l�, �e sta� Cie na wi�cej");
			break;
			
			case 1:
				System.out.println("S�aby wynik my�l�, �e sta� Cie na wi�cej");
			break;
			case 2:
				System.out.println("To ju� prawie po�owa");
			break;
			
			
			case 3:
				System.out.println("Uda�o si� przekroczy� po�owe");
			break;
			case 4:
				System.out.println("Dobry wynik, tylko raz si� pomyli�e�");
			break;
			case 5:
				System.out.println("Uda�o si� odpowiedzie� na wszystkie pytania prawid�owo");
			break;
			}
			
			System.out.println("Odpowiedziano na " + ilePytan + " pytania,  uda�o si� zgromadzic " + punkt + " punkt�w");
	
	}}
	
