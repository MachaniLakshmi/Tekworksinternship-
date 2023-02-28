import java.util.*;
class Diagonalmatrix
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter dimension of matrix:");
      int row=d.nextInt();
      int col=d.nextInt();
      System.out.println("Give data for matrix:");
      int mat[][]=new int[row][col];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            mat[i][j]=d.nextInt();
        }
      diagonalmatrix(mat,row,col);
    }
    public static void diagonalmatrix(int mat[][],int r,int c)
        {
         for(int i=0;i<r;i++)
           {
             for(int j=0;j<c;j++)
               {
                 if(i==j)
                   System.out.println(mat[i][j]);
                 else
                   System.out.println("\t");
               }
           }
        }
  }