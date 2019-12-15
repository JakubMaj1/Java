import java.util.*;


public class Main {
	 public static void main(String[] args) {
	        Czlowiek Czlowiek = new Czlowiek(23,"Jakub","Maj");
	        Czlowiek Czlowiek2 = new Czlowiek(20 , "Pitor","Maj");
	        Czlowiek Czlowiek3 = new Czlowiek(50 , "Jan","Mak");

	        List<Czlowiek> CzlowiekList = new ArrayList<>();
	        CzlowiekList.add(Czlowiek);
	        CzlowiekList.add(Czlowiek2);
	        CzlowiekList.add(Czlowiek3);

	        for (Czlowiek temp: CzlowiekList) {
	           //System.out.println(temp.PrintInfo());
	        }

	        CzlowiekList.sort(Comparator.comparingInt(a -> a.wiek));
	        Collections.reverse(CzlowiekList);
	        for (Czlowiek temp: CzlowiekList) {
	           // System.out.println(temp.PrintInfo());
	        }

	        CzlowiekList.sort(Comparator.comparing(a -> a.nazwisko));
	        Collections.reverse(CzlowiekList);
	        for (Czlowiek temp: CzlowiekList) {
	        	
	            System.out.println(temp.PrintInfo());
	        }
	    }
	}


