import java.util.*;
import java.math.*;
public class qud
{
  public static void main(String args[])
 {
   Scanner input = new Scanner(System.in);
   System.out.println("Enter a");
   double a = input.nextDouble();
   System.out.println("Enter b");
   double b = input.nextDouble();
   System.out.println("Enter c");
   double c = input.nextDouble();
   double d=b*b-4*a*c;

  if(d>0.0)
  {
    System.out.println("root will be real and unequal");
    double r1 = (-b+Math.pow(d,0.5) / (2.0*a));
    double r2 = (-b-Math.pow(d,0.5) / (2.0*a));
    System.out.println("root are"+ r1 + " and "+ r2);
  }
  else if(d ==0.0)
  { 
    System.out.println("root will be real and equal");
    double r1 =-b / (2.0*a);
    System.out.println("root is"+r1);
  }
  else
  {
    System.out.println("not real root");
    double r1 = -b / (2*a);
    double r2 = Math.pow(d,0.5) / (2.0*a);
    System.out.println("root is:"+ r1 + "+" +r2 +"and" + r1 + "-" +r2);
  }
}
}
