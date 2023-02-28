import java.util.*;
class Passwordgenerator
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Password Generator:");
      System.out.println("Enter the length of the password:");
      int length=d.nextInt();
      System.out.println("Enter the Password:");
      String p=d.next();
      password(length,p);
    }
    public static void password(int length,String p)
    {
      String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      double digits="0123456789";
      String specialcharacter="!@#$~%^&*()_+{}<>?\"";
      for(int i=0;i<=length;i++)
        {
          if(uppercase)
          {
            System.out.println(p);
          if(specialcharacter)
          {
            System.out.println(p);
          if(digits)
            System.out.println(p);
          else
            System.out.println("Enter the correct password");
          }
          }
        }
    }
  }      