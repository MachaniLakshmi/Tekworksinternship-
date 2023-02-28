import java.util.*;
class Frequency
  {
    public static void fre(int n)
    {
      for(int i=0;i<=9;i++)
        {
          int count=0;
          int temp=n;
          while(temp>0)
            {
              int digit=temp%10;
              if(digit==i)
                 count++;
              temp=temp/10;
            }
          if(count>0)
             System.out.println(i+"\t"+count);
        }
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=d.nextInt();
      fre(n);
    }
  }
    
  