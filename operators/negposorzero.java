import java.util.Scanner;
class positive
{
 public static void main(String args[])
  {
    int a;
    Scanner d=new Scanner(System.in);
    a=d.nextInt();
    if(a>0)
      System.out.println("a is positive number");
    else if(a<0)
      System.out.println("a is negative number");
    else
      System.out.println("a is Zero");
  }
}