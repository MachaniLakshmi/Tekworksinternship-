import java.util.*;
class Sumofodd
  {
    public static void main(String args[])
    {
      int i,n=100,sum=0;
      for(i=1;i<=n;i+=2)
        {
          sum+=i;
        }
      System.out.println(sum);
    }
  }