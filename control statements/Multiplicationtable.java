import java.util.*;
class Multiplicationtable
  {
    public static void mul(int n)
    {
      for(int i=1;i<=10;i++)
        System.out.println(n+"*"+i+"="+n*i);
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the multiplication table number:");
      int n=d.nextInt();
      mul(n);
    }
  }