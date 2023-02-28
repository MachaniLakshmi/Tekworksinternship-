import java.util.*;
public class Product
  {
    public static void prod(int n)
    {
      int prod=1;
      while(n>0)
        {
          prod=prod*(n%10);
          n=n/10;
        }
      System.out.println(prod);
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=d.nextInt();
      prod(n);
    }
  }