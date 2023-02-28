import java.util.*;
class Agecalculator 
{
  public static void main(String args[])
  {
    int birthdate,currentdate;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter birthdate(YYYY):");
    birthdate=s.nextInt();
    System.out.println("Enter currentdate(YYYY):");
    currentdate=s.nextInt();
    int currentage=currentdate-birthdate;
    System.out.println(currentage);
    if(currentage<=18)
      System.out.println("you are a minor");
    else
      System.out.println("you are an adult");
    }
}
    
      
  
    
    
    
    