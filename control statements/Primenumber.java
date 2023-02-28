import java.util.*;
public class Primenumber
  {
    public static void prime(int n)
    {
      int m=0,i,f=0;
      m=n/2;
      for(i=2;i<=m;i++)
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
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=d.nextInt();
      prime(n);
    }
  }