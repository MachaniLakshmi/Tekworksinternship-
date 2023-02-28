import java.util.*;
class Trafficlightsimulator
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Trafficlightsimulator");
      System.out.println("Enter time in seconds:");
      int seconds=d.nextInt();
      if(seconds<=20)
        System.out.println("Green");
      else if(seconds<=40)
        System.out.println("orange");
      else
        System.out.println("Red");
    }
  }
        
      