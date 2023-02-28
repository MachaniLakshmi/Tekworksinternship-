import java.util.*;
class Number
  {
    public static void main(String args[])
    {
      int n,m,i;
      Scanner d=new Scanner(System.in);
      n=d.nextInt();
      m=d.nextInt();
      System.out.println("stop the number");
      int x=d.nextInt();
      for(int i=n;i<=m;i++)
        {
          if(i%2==0 && i%3==0)
          {
           if(i==x)
             break;
            System.out.println(i);
          }
        }
    }
      