import java.util.*;
class IndexElement
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter no.of elements:");
      int size;
      size=d.nextInt();
      int array[]=new int[size];
      System.out.println("Enter array elements:");
      for(int i=0;i<=size-1;i++)
        array[i]=d.nextInt();
      elementIndex(array,size);
    }
    public static void elementIndex(int array[],int n)
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter element number");
      int element=d.nextInt();
      for(int i=0;i<n;i++)
        System.out.println("array of "+element+" is");
      System.out.println(array[n]);
    }
  }
