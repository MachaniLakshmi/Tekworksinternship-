import java.util.Scanner;
  class product
  {
   public static void main(String arg[])
        {
          int mrp;double sellingprice;String prodname;
          Scanner d=new Scanner(System.in);
          mrp=d.nextInt();
          prodname=d.next();
          sellingprice=mrp*10/100;
          System.out.println("sellingprice is"+sellingprice);
          
        }
  }