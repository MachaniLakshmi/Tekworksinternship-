import java.util.*;
class Uppertriangle
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter row size of matrix:");
      int row=d.nextInt();
      System.out.println("Enter column size of matrix:");
      int col=d.nextInt();
      int mat[][]=new int[row][col];
      System.out.println("Give data for matrix:");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            mat[i][j]=d.nextInt();
        }
      upper(mat,row,col);
    }
    public static void upper(int mat[][],int r,int c)
    {
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              if(j<i)
                continue;
              else
                System.out.println(mat[i][j]+"");
              System.out.println();
            }
        }
    }
  }