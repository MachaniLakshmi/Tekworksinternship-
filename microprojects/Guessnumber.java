import java.util.*;
import java.util.Scanner;
class Guessnumber
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("enter the user number:");
      int n=d.nextInt();
      System.out.println("enter the system number:");
      int m=d.nextInt();
      guess(n,m);
    }
    public static void guess(int n,int m)
    {
      Scanner s=new Scanner(System.in);
      do
        {
          for(int i=10;i<=1000;i++)
            {
              if(n==m)
                {
                  System.out.println("your guess is correct");
                }
              else
                System.out.println("your guess is wrong");
            }
          System.out.println("Do you want to continue");
          char c=d.next().charAt(0);
        }
        while(c!='n');
    }
  }