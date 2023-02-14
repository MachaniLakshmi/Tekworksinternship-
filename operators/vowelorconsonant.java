import java.util.Scanner;
class vowelorconsonant
{
 public static void main(String args[])
  {
    char ch;
    Scanner d=new Scanner(System.in);
    ch=d.next().charAt(0);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
  System.out.println("it is a vowel");
else
  System.out.println("it is a consonant");
  }
}
    
    