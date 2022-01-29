import java.util.*;
class secondlarge
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
           
          int large=a[0],seclarge=a[0];
          
          for(i=0;i<n;i++)
            if(a[i]>large)
               {
                 large=a[i];
                }
          for(i=0;i<n;i++)
             if(a[i]>seclarge && a[i]<large)
               seclarge=a[i];
         System.out.println("Second largest element is "+seclarge);         
     }
    }
