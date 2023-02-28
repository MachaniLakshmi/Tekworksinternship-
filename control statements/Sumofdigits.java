import java.util.*;
public class Sumofdigits
  {
    public static void digit(int n)
    {
      int sum=0;
      while(n>0)
        {
          sum=sum+n%10;
          n=n/10;
        }
      System.out.println(sum);
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=d.nextInt();
      digit(n);
    }
  }