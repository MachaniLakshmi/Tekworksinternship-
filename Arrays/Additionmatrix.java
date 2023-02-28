import java.util.*;
class Additionmatrix
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter first matrix rows size:");
      int row1=d.nextInt();
      System.out.println("Enter first columns size:");
      int col1=d.nextInt();
      int mat1[][]=new int[row1][col1];
      System.out.println("Enter first matrix elements:");
      for(int i=0;i<row1;i++)
        {
          for(int j=0;j<col1;j++)
            mat1[i][j]=d.nextInt();
        }
      System.out.println("Enter second matrix rows size:");
      int row2=d.nextInt();
      System.out.println("Enter second columns size:");
      int col2=d.nextInt();
      int mat2[][]=new int[row2][col2];
      System.out.println("Enter second matrix elements:");
      for(int i=0;i<row2;i++)
        {
          for(int j=0;j<col2;j++)
            mat2[i][j]=d.nextInt();
        } 
      addition(mat1,row1,col1,mat2,row2,col2);
    }
    public static void addition(int mat1[][],int row1,int col1,int mat2[][],int row2,int col2)
    {
      int resultmatrix[][]=new int[row1][col1];
      if(row1==col1 && row2==col2)
      {
        for(int i=0;i<row1;i++)
          {
            for(int j=0;i<col2;j++)
              resultmatrix[i][j]=mat1[i][j]+mat2[i][j];
          }
        for(int i=0;i<=row2;i++)
        {
          for(int j=0;j<=col2;j++)
             System.out.println(resultmatrix[i][j]+"t");
          System.out.println("\n");
        }
      }
    }
  }    