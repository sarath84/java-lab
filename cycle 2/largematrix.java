import java.util.*;
class largematrix
  {
    public static void main(String args[])
    {
      System.out.println("Enter the number of rows: ");
      Scanner sc=new Scanner(System.in);
      int row=sc.nextInt();
      
      System.out.println("Enter the number of columns: ");
      int col=sc.nextInt();
      
      int A[][]=new int[50][50];
      int i,j;
      
      System.out.println("Enter the matrix elements: ");
       for(i=0;i<row;i++)
               for(j=0;j<col;j++)
                     A[i][j]=sc.nextInt();
                     
       int large=A[0][0];
       
       for(i=0;i<row;i++)
               for(j=0;j<col;j++)
                    {
                        if (A[i][j]>large)
                             large=A[i][j];
                    }
                    
       System.out.println("Largest number in the matrix is "+large);
      }
    }
