package Car;

public class mercedes extends Car {
	public String model = "Mercedes Benz";
	
	public void brake() 
	{
		System.out.println("Pierwszy Komunikat : ");
		System.out.println("STOP");
	}
	public void turnLeft()
	{
		System.out.println("Kolejny komunikat to :");
		System.out.println("Teraz w Lewo");
	}
	
	public  mercedes(String kolor, double silnik, int drzwi )
	{
		super( kolor, silnik , drzwi);
		
	}
	public void showMercedes() {
		System.out.println("Model: "+this.model);
	}
}