package Car;

public class Main {

	 public static void main(String[] args) {

		 mercedes a= new mercedes("Czarny",2.0,5);
			a.show();
			a.showMercedes();
			mercedes b=new mercedes("zielony",1.6,3);
			b.show();
			b.showMercedes();
			a.brake();
			a.turnLeft();
			a.sygnal();
	    }
}
