import java.util.*;
class DeleteElement
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
      elementDelete(array,size);
    }
    public static void elementDelete(int array[],int n)
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter position number");
      int position=d.nextInt();
      System.out.println("Delete element at specified "+position+" index");
      array[position]=d.nextInt();
      for(int i=0;i<n;i++)
        System.out.println(array[i]);
      System.out.println(array[n]);
    }
  }