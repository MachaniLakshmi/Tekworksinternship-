import java.util.*;
class CommonElement
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter no.of elements:");
      int size1;
      size1=d.nextInt();  
      int array1[]=new int[size1];
      System.out.println("Enter array elements:");
      for(int i=0;i<=size1-1;i++)
        array1[i]=d.nextInt();
      System.out.println("Enter no.of elements:");
      int size2;
      size2=d.nextInt();
      int array2[]=new int[size2];
      System.out.println("Enter array elements:");
      for(int i=0;i<=size2-1;i++)
        array2[i]=d.nextInt();
      elementCommon(array1,size1,array2,size2);
    }
    public static void elementCommon(int arr1[],int size1,int arr2[],int size2)
    {
      for(int i=0;i<arr1.length;i++)
        {
          for(int j=0;j<arr2.length;j++)
            {
              if(arr1[i]==arr2[j])
              {
                System.out.println(arr1[i]);
                break;
              }
            }
        }
    }
  }