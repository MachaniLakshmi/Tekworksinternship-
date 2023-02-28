import java.util.*;
class Employeesalarycalculator
  {
    public static void main(String args[])
    {
    double basicsalary,HRA,DA,GS,incometax,annualsalary;
    Scanner d=new Scanner(System.in);
    System.out.println("Employeesalarycalculator");
    System.out.println("Enter the basicsalary:");
    basicsalary=d.nextDouble();
    HRA=(10/100)*basicsalary;
    DA=(73/100)*basicsalary;
    GS=basicsalary+HRA+DA;
    incometax=(30/100)*GS;
    annualsalary=GS-incometax;
    System.out.println("incometax="+incometax);
    System.out.println("annualsalary="+annualsalary);
    }
  }
    
  
  
     
    
  