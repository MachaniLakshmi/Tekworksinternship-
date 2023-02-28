import java.util.*;
class Multiplicationmatrix
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
      multiplication(mat1,row1,col1,mat2,row2,col2);
    }
    public static void multiplication(int mat1[][],int r1,int c1,int mat2[][],int r2,int c2)
    {
      int resultmatrix[][]=new int[r1][c2];
      if(c1==r2)
      {
        for(int i=0;i<r1;i++)
        {
          for(int j=0;j<c2;j++)
            {
              resultmatrix[i][j]=0;
              for(int k=0;k<c1;k++)
                 resultmatrix[i][j]=resultmatrix[i][j]+mat1[i][k]+mat2[k][j];
            }
        }
        for(int i=0;i<r1;i++)
        {
          for(int j=0;j<c2;j++)
            System.out.println(resultmatrix[i][j]+"\t");
          System.out.println("\n");
        }
      }
      else
        System.out.println("multiplication is not posssible");
    }
  }