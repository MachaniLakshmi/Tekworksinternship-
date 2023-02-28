import java.util.*;
class InsertElement
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter no.of elements:");
      int size;
      size=d.nextInt();
      int array[]=new int[size+1];
      System.out.println("Enter array elements:");
      for(int i=0;i<size;i++)
        array[i]=d.nextInt();
      elementInsert(array,size);
    }
    public static void elementInsert(int array[],int n)
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter position number");
      int position=d.nextInt();
      System.out.println("Insert element at specified "+position+" index");
      int element=d.nextInt();
      array[position]=element;
      for(int i=0;i<n;i++)
        System.out.println(array[i]);
      System.out.println(array[n]);
    }
  }      