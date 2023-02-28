import java.util.*;
class Perfectnumber
  {
    public static void perfect(int n)
    {
      int i,j,nsum;
      for(i=1;i<=n;i++)
        {
          sum=0;
          for(j=1;j<i;j++)
            {
              if(i%j==0)
                sum+=j;
            }
          if(sum==i)
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=d.nextInt();
      perfect(n);
    }
  }