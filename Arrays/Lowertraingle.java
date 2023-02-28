import java.util.*;
class Lowertraingle
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
      lowertraingle(mat,row,col);
    }
    public static void lowertraingle(int mat[][],int r,int c)
    {
      for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
            {
              if(i>=j)
                continue;
              else
                System.out.println(mat[i][j]+"");
              System.out.println();
            }
        }
    }
  