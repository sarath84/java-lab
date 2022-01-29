import java.util.*;
class replacearray
    { 
     public static void main(String args[])
     {
         System.out.println("Enter the number of elements in an array");
         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
  
         int a[]=new int[50];
         int i;
         
         System.out.println("Enter the elements in an array");
         
          for(i=0;i<n;i++)
           a[i]=sc.nextInt();
         
         System.out.println("Enter the position in which number to be replaced");
         int pos=sc.nextInt();
          
         System.out.println("Enter the number to be replaced");
         int num=sc.nextInt();
          
         a[pos-1]=num;
       
         System.out.println("New array is");                 
         for(i=0;i<n;i++)
            System.out.println(a[i]);
         
     }
    }
