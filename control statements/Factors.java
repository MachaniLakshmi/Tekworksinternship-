import java.util.*;
class Factors
  {
    public static void fact(int n)
    {
      for(int i=1;i<=(n/2);i++)
        {
          if(n%i==0)
            System.out.println(i+"");
        }
      System.out.println(n);
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=d.nextInt();
      fact(n);
    }
  }