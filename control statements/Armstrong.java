import java.util.*;
public class Armstrong
  {
    public static void number(int n)
    {
      int m,s,sum=0;
      m=n;
      while(m>0)
        {
          s=m%10;
          sum=sum+s*s*s;
          m=m/10;
        }
      if(sum==n)    
        System.out.println("It is a armstrong number.");    
      else    
        System.out.println("Not a armstrong");
    }
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Input a number: ");
      int n = in.nextInt();
      number(n);
    }
  }    