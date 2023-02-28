import java.util.*;
class Secondmaxmin
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter array size");
      int size=d.nextInt();
      System.out.println("Enter array elements:");
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        arr[i]=d.nextInt();
      display(arr,size);
    }
    public static void display(int arr[],int n)
    {
      int max=arr[0],min=arr[0],secondmax=arr[0],secondmin=arr[0];
      for(int i=0;i<n;i++)
        {
          if(arr[i]>max)
          {
            secondmax=max;
            max=arr[i];
          }
          else if(arr[i]>secondmax)
            secondmax=arr[i];
        }
      for(int i=0;i<n;i++)
        {
          if(arr[i]<min)
          {
            secondmin=min;
            min=arr[i];
          }
          else if(arr[i]<secondmin)
            secondmin=arr[i];
        }
      System.out.println("Second maximum number is:"+secondmax);
      System.out.println("Second minimum number is:"+secondmin);
    }
  }