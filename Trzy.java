
import java.util.Scanner;


 
public class Trzy {
 
 
 public static void main(String[] args) {
      
 Scanner scan = new Scanner(System.in);
 
        
       
System.out.println("Podaj d�ugo�ci bok�w tr�jk�ta: ");
        
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
     
        System.out.println("```````````````````````````````````````````````````````````````````````"); 
    
    if(a+b>=c&& a+c>=b && b+c>=a)
    {
    
    System.out.println("Super da sie zrobi� trojkat z liczb : "+ a +", "+b +", "+ c );
    
    }
    else {
    
    System.out.println("Niestety nie znasz warunkow trojkata, nie uda sie stworzyc trojkota z liczb : "+ a +", "+ b +", "+ c );
    System.exit(0);
    }
 
    System.out.println("```````````````````````````````````````````````````````````````````````");
 
   if(a<b)
      {
       if(b>c)
         {
          if(a<c) System.out.println("sortowanie: "+a+" "+c+" "+b);
          else    System.out.println("sortowanie: "+c+" "+a+" "+b);
         }
       else System.out.println("sortowanie: "+a+" "+b+" "+c);
      }
    else
      {
       if(a>c)
         {
          if(b<c) System.out.println("sortowanie: "+b+" "+c+" "+a);
          else    System.out.println("sortowanie: "+c+" "+b+" "+a);
         }
       else System.out.println("sortowanie: "+b+" "+a+" "+c);
      }
   
   double obwod = a+b+c;
   double p= obwod/2;
   double pole = Math.sqrt(p*(p-a)*(p-b)*(p-c));
   System.out.println("```````````````````````````````````````````````````````````````````````");
   
   System.out.println("Obw�d tr�jk�ta wynosi :  "+ obwod + "   Pole tr�jk�ta wynosi :  " + pole);
   
   System.out.println("```````````````````````````````````````````````````````````````````````");
   
   if (a==b && a==c && b==c)
   {
   System.out.println("Z podanych bok�w utworzy�e� tr�jk�t r�wnoboczny ");
   }
   else if (a==b || a==c || b==c)
   {
   System.out.println("Z podanych bok�w utworzy�e� tr�jk�t r�wnoramienny ");
   }
   else
   {
   System.out.println("Z podanych bok�w utworzy�e� tr�jk�t r�noboczny ");
   }
   System.out.println("```````````````````````````````````````````````````````````````````````");
   double h1 = (pole*2)/a;
   double h2 = (pole*2)/b;
   double h3 = (pole*2)/c;
   System.out.println("Wysoko�� tr�jk�ta przy podstawie a : "+ h1);
   System.out.println("Wysoko�� tr�jk�ta przy podstawie b : "+ h2);
   System.out.println("Wysoko�� tr�jk�ta przy podstawie c : "+ h3);
 }}