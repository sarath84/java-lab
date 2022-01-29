import java.util.*;
class smallarray
  {
    public static void main(String args[])
       {
           System.out.println("Enter the number of elements in an array");
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
 
           int a[]=new int[50];
           int i;
 
           System.out.println("Enter the elements in an array");
              for(i=0;i<n;i++)
                 a[i]=sc.nextInt();
              
             int small=a[0];
               
              for(i=0;i<n;i++)
                {  
                  if(a[i]<small)
                       small=a[i];
                }
           System.out.println("Smallest element is "+small);
         }
   }
                              
