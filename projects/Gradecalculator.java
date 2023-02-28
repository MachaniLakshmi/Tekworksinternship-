import java.util.*;
class Gradecalculator 
{
  public static void main(String args[])
  {
    Scanner d=new Scanner(System.in);
    System.out.println("enter test score 1:");
    double t1=d.nextDouble();
    System.out.println("enter test score 2:");
    double t2=d.nextDouble();
    System.out.println("enter test score 3:");
    double t3=d.nextDouble();
    System.out.println("enter test score 4:");
    double t4=d.nextDouble();
    System.out.println("enter test score 5:");
    double t5=d.nextDouble();
    double sum=t1+t2+t3+t4+t5;
    double percentage=(sum/500)*100;
      if(percentage>=90)
      System.out.println("grade A");
      else if(percentage>=80)
      System.out.println("grade B");
      else if(percentage>=70)
      System.out.println("grade C");
      else if(percentage>=60)
      System.out.println("grade D");
      else if(percentage>=40)
      System.out.println("grade E");  
      else 
      System.out.println("grade F");
  }
}
    
    
   
       
    
    
    
      
    