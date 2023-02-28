import java.util.*;
class FrequencyElement
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
      elementFrequency(array,size);
    }
    public static void elementFrequency(int array[],int n)
    {
      for(int i=0;i<size;i++)
        {
          int count=0;
          int temp=array[i];
          while(temp>0)
            {
              int array[i]=temp%10;
              if(array[i]==i)
                 count++;
              temp=temp/10;
            }
          if(count>0)
             System.out.println(array[i]+"\t"+count);
        }
    }
  }