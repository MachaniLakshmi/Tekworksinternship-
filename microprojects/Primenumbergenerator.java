import java.util.*;
class Primenumbergenerator
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the prime number:");
      int n=d.nextInt();
      prime(n);
    }
    public static void prime(int n)
    {
      Scanner s=new Scanner(System.in); 
      int m=0,i,f=0;
      m=n/2;
      if(n==0||n==1)
         System.out.println("It is not prime");
      else
      {
        for(i=50;i<=m;i++)
        {
          if(n%i==0)
          {
            System.out.println("it is not a prime");
            f=1;
            break;
          }
        }
      if(f==0)
        System.out.println("it is a prime");
      System.out.println(f);
      }
      System.out.println("Do you want to continue");
      char c=d.next().CharAt(0);
      while(c!='n');
    }
  }