import java.util.*;
class Factorial
  {
    public static void fact(int n)
    {
      int i=1;double f=1;
      while(i<=n)
        {
          f=f*i;
          i++;
        }
      System.out.println("Factorial of number is:"+f);
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=d.nextInt();
      fact(n);
    }
  }