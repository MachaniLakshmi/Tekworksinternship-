import java.util.*;
public class Reverse
  {
    public static void rev(int n)
    {
      int r=0;
      while(n>0)
        {
          int rem=n%10;
          r=r*10+rem;
          n=n/10;
        }
      System.out.println(r);
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=d.nextInt();
      rev(n);
    }
  }