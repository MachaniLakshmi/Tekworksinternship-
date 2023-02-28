import java.util.*;
public class Prime
  {
    public static void prime(int n)
    {
      int i,j,c=0;
      for(j=2;j<=n;j++)
        {
          for(i=1;i<=j;i++)
            {
              if(j%i==0)
                c++;
            }
        }
        if(c==2)
          System.out.println(j+"");
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=d.nextInt();
      prime(n);
    }
  }