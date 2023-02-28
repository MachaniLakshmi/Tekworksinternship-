import java.util.*;
class Temperatureconverter
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Type 1 Fahrenheit to celsius");
      System.out.println("Type 2 celsius to Fahrenheit");
      int choice=d.nextInt();
      double fahrenheit=0.0,celsius=0.0;
      switch(choice)
        {
          case 1:
            System.out.println("Enter temperature in Fahrenheit:");
            fahrenheit=d.nextDouble();
            celsius=(fahrenheit-32)*5/9.0;
            System.out.println("temperature in celsius:"+celsius);
          case 2:
            System.out.println("Enter temperature in celsius:");
            celsius=d.nextDouble();
            fahrenheit=9.0/5.0*fahrenheit+32;
            System.out.println("temperature in fahrenheit :"+fahrenheit);
            
        }
    }
  }