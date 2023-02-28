import java.util.*;
class Twodimensional
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter rows size:");
      int rows=d.nextInt();
      System.out.println("Enter columns size:");
      int columns=d.nextInt();
      System.out.println("Enter array elements:");
      int array[][]=d.nextInt();
      for(int i=0;i<=rows;i++)
        {
          for(int j=0;j<=columns;j++)
            {
              array[i][j]=d.nextInt();
            }
        }
    }
  }
      