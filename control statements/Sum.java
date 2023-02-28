import java.util.*;
public class Sum
  {
    public static void digit(int n)
    {
      int m=n%10;
      while(n>=10)
        n=n/10;
      System.out.println(n+m);
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=d.nextInt();
      digit(n);
    }
  }