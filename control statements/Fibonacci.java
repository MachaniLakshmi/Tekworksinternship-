import java.util.*;
class Fibonacci
  {
    public static void fib(int n)
    {
      int a=0,b=0,c=1;
      System.out.println("Fibonacci series:");
      for(int i=1;i<=n;i++)
        {
          a=b;
          b=c;
          c=a+b;
          System.out.println(a+"");
        }
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=d.nextInt();
      fib(n);
    }
  }