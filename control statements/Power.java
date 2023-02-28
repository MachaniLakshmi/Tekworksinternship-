import java.util.*;
public class Power
  {
    public static void pow(int n,int m)
    {
      int p=1;
      for(int i=1;i<=m;i++)
        p=p*n;
      System.out.println(p);
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=d.nextInt();
      System.out.println("Enter the exponent:");
      int m=d.nextInt();
      pow(n,m);
    }
  }