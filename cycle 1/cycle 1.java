import java.util.Scanner;
   class amstrong
     {
         public static void main(String args[])
           {
               Scanner sc = new Scanner(System.in);
               System.out.println("enter the nomber");
                int a=sc.nextInt();
                 int original=a,rem=0,d=0;
                while(a!=0)
                  {
                    rem=a%10;
                    d=d+rem*rem*rem;
                    a=a/10;

                  }
                if(original==d)
                   {
                    System.out.println("yes");   
                   }
                else{

                  System.out.println("no"); 
                }
           }
     
        }