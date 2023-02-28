import java.util.*;
class Count
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
      int cou_neg=0,cou_pos=0,cou_zero=0,cou_even=0,cou_odd=0;
      for(int i=0;i<n;i++)
        {
          if(arr[i]<0)
            cou_neg++;
          else if(arr[i]>0)
            cou_pos++;
          else if(arr[i]==0)
            cou_zero++;
          else if((arr[i]%2)==0)
            cou_even++;
          else if((arr[i]%2)!=0)
            cou_odd++;
        }
      System.out.println("positive numbers are:"+cou_pos);
      System.out.println("Negative numbers are:"+cou_neg);
      System.out.println("zeroes are:"+cou_zero);
      System.out.println("Even numbers are:"+cou_even);
      System.out.println("odd numbers are:"+cou_odd);
    }
  }