import java.util.Scanner;

public class primeornot
  {
      public static void main(String args[])
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the no:");
              int a=sc.nextInt();
              int count==0;
              if(a%2==0)
              {
                  System.out.println("the no is not a prime");

              }
               for(int i=0;i<=9;i++)
                {
                    if(a%i==0)
                      {
                          count++;
                          

                      }
                }
                if(count==2)
                  {
                      System.out.println("no is prime");
                  }
            
                  
        }
  }