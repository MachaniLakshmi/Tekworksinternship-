import java.util.*;
class Sumofeven
  {
    public static void main(String args[])
    {
      int i,n=100,sum=0;
      for(i=2;i<=n;i+=2)
        {
          sum+=i;
        }
      System.out.println(sum);
    }
  }