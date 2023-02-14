import java.util.Scanner;
class leapyear
{
 public static void main(String args[])
  {
    int n;
    Scanner d=new Scanner(System.in);
    n=d.nextInt();
    if(n%400==0)
      System.out.println("it is a leap year");
    else if(n%100==0)
      System.out.println("it is not a leap year");
    else if(n%4==0)
      System.out.println("it is a leap year");
    else
      System.out.println("it is not a leap year");
  }
}