import java.util.*;
class Rockpaperscissors
  {
    public static void main(String args[])
    {
      int user,computer,rock,scissors,paper;
      Scanner d=new Scanner(System.in);
      System.out.println("user:choose1-rock,choose2-scissors or choose3-paper");
      user=d.nextInt();
      System.out.println("computer:choose1-rock,choose2-scissors or choose3-paper");
      computer=d.nextInt();
      if(user==1 && computer==2)
        System.out.println("user wins");
      else if(user==2 && computer==3)
        System.out.println("user wins");
      else if(user==3 && computer==1)
        System.out.println("user wins");
      else 
        System.out.println("computer wins");
    }
  }
        

      
      
      