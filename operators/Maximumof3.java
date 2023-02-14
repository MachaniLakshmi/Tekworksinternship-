import java.util.Scanner;
class Maximumof3,
{
 public static void main(String args[])
  {
    int a,b,c;
    Scanner d=new Scanner(System.in);
    a=d.nextInt();
    b=d.nextInt();
    c=d.nextInt();
    if(a>=b && a>=c)
     System.out.println("a is maximim");
    else if(b>=a && b>=c)
     System.out.println("b is maximum");
    else
     System.out.println("c is maximum");
  }
      
}
    
    
    