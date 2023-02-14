import java.util.Scanner;
class divisible
{
 public static void main(String args[])
  {
    int n;
    Scanner d=new Scanner(System.in);
    n=d.nextInt();
    if(n%5==0 && n%11==0)
      System.out.println("n is divisible by 5 and 11");
    else
      System.out.println("n is not divisible by 5 and 11");
    
  }
}