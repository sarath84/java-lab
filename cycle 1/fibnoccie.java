import java.util.*;
  class fibnoccie
    {
        public static void main(String args[]) 
          {
              Scanner sc = new Scanner(System.in);
              System.out.println("enter up to");
                int a=sc.nextInt();
                int n=0,b=1,f=0;
                    for(int i=0;i<a;i++)
                       {
                        System.out.println(f);
                          n=b;
                          b=f; 
                          f=n+b;
                         
                          
                       }

          }
    }