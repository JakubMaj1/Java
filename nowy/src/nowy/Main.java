package nowy;


import javax.swing.JOptionPane;

public class Main {
		static double poletr(double a,double h)
		{
			return (a*h/2);
		}
		static double poletr(double a,double b,double c)
		{
			if((a+b>c)&&(a+c>b)&&(b+c>a))
			{
				double p=((a+b+c)/2);
				return (double)Math.sqrt(p*(p-a)*(p-b)*(p-c));
			}
			else {
				
				
				System.out.print("Nie ma tr: ");
				return 0;
			}
		
		}
		public static void main(String[] args) {
			int a=Integer.parseInt(JOptionPane.showInputDialog("Podaj a: "));
			int b=Integer.parseInt(JOptionPane.showInputDialog("Podaj b: "));
			int c=Integer.parseInt(JOptionPane.showInputDialog("Podaj c: "));
			int h=Integer.parseInt(JOptionPane.showInputDialog("Podaj h: "));
			System.out.print("Pole trójk¹ta: "+poletr(a,h)+"\n");
			System.out.print("Pole trójk¹ta: "+poletr(a,b,c));
		}
	}