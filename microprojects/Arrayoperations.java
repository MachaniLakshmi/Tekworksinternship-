import java.util.*;
class Arrayoperations
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter no.of elements:");
      int size=d.nextInt();
      int array[]=new int[size];
      System.out.println("Array operations");
      System.out.println("1.Insert an element in first index");
      System.out.println("2.Insert an element in last index");
      System.out.println("3.Insert an element in specified index");
      System.out.println("4.Remove element from first index");
      System.out.println("5.Remove element from last index");
      System.out.println("6.Remove element from specified index");
      System.out.println("7.Remove user entered element");
      System.out.println("8.Display all in ASC/DESC order");
      System.out.println("Which operation do you want to perform");
      int option=d.next();
    }
      switch(option)
        {
          case 1: InsertAtfirstIndex(array,size);
            break;
          case 2: InsertAtLastIndex(array,size);
            break;
          case 3: InsertAtSpecifiedIndex(array,size);
            break;          
          case 4: RemoveElementFirstIndex(array,size);
            break;
          case 5: RemoveElementLastIndex(array,size);
            break;
          case 6: RemoveElementSpecifiedIndex(array,size);
            break;
          case 7: RemoveuserEnteredelement(array,size);
            break;
          case 8: DisplayallinASCDESC(array,size);
            break;
        }
    }
    static void InsertAtfirstIndex(int array[],int n)
    {
      System.out.println("Enter the element to insert the first index:");
      Scanner d=new Scanner(System.in);
      array[o]=d.nextInt();
    }
    static void InsertAtLastIndex(int array[],int n)
    {
      System.out.println("Enter the element to insert the last index:");
      Scanner d=new Scanner(System.in);
      array[n-1]=d.nextInt();
    }
    static void InsertAtSpecifiedIndex(int array[],int n)
    {
      System.out.println("Enter position number to insert data");
      int position=d.nextInt();
      System.out.println("Enter element at specified +position+ index");
      array[position]=d.nextInt();
    }
    static void RemoveElementFirstIndex(int array[],int n)
    {
      System.out.println("Enter the element to remove the first index:");
      Scanner d=new Scanner(System.in);
      array[o]=d.nextInt();
    }
    static void RemoveElementLastIndex(int array[],int n)
    {
      System.out.println("Enter the element to remove the last index:");
      Scanner d=new Scanner(System.in);
      array[n-1]=d.nextInt();
    }
    static void RemoveElementSpecifiedIndex(int array[],int n)
    {
      System.out.println("Enter position number to insert data");
      int position=d.nextInt();
      System.out.println("Enter element at specified +position+ index");
      array[position]=d.nextInt();
    }
    static void  RemoveuserEnteredelement(int array[],int n)
    {
      System.out.println("Enter element to remove from array");
      int remove=d.nextInt();
      int i;
      for(i=0;i<size;i++)
        {
          if(array[i]==remove)
            array[i]==0;
          break;
        }
      if(i==size)
        System.out.println(remove+ "not available in the array");
    }
    static void  DisplayallinASCDESC(int array[],int n)
    {
      System.out.println("Enter the all elements in ascending order");
      for(int i=0;i<array.length;i++)
        {
          
        }
    }
