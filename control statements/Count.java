import java.util.*;
class Count
  {
    public static void count(int n)
    {
      int count=0;
      while(n>0)
        {
          n=n/10;
          count++;
        }
      System.out.println("count number:"+count);
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=d.nextInt();
      count(n);
    }
  }