import java.util.Scanner;
class alphabetornot
{
 public static void main(String args[])
  {
    char c;
    Scanner d=new Scanner(System.in);
    c=d.next().charAt(0);
    if((c>='a' && c<='z') || (c>='A' && c<='Z'))
      System.out.println("c is alphabet");
    else
      System.out.println("c is not alphabet");
  }
}
      