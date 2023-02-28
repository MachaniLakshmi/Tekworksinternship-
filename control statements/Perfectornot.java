import java.util.*;
class Perfectornot
  {
    public static void perfect(int n)
    {
      int i,sum=0;
      for(i=1;i<=n/2;i++)
        {
          if(n%i==0)
          sum=sum+i;
        }
      if(sum==n && n>0)
        System.out.println("it is a perfectnumber");
      else
        System.out.println("it is not aperfect number");
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=d.nextInt();
      perfect(n);
    }
  }