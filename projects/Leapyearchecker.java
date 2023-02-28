import java.util.Scanner;
class Leapyearchecker
{
 public static void main(String args[])
  {
    Scanner d=new Scanner(System.in);
    System.out.println("LeapyearChecker");
    System.out.println("enter a year:");
    int year=d.nextInt();
    if(year%4==0)
        {
          if(year%100==0)
          {
            if(year%400==0)
            System.out.println("it is a leap year");
          }
        }
       else
        System.out.println("it is not a leap year");
    }
  }
