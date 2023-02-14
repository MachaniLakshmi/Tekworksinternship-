import java.util.Scanner;
class student
  {
   public static void main(String args[])
    {
      int sid;String sname;int m1,m2,m3;int sum;double average;
      Scanner d=new Scanner(System.in);
      sid=d.nextInt();
      sname=d.next();
      m1=d.nextInt();
      m2=d.nextInt();
      m3=d.nextInt();
      sum=d.nextInt();
      average=d.nextDouble();
      System.out.println("sid="+sid);
      System.out.println("sname="+sname);
      System.out.println("m1="+m1);
      System.out.println("m2="+m2 );
      System.out.println("m3="+m3 );
      sum=m1+m2+m3;
      average=sum/3;
      System.out.println("average"+average);
    }
  }