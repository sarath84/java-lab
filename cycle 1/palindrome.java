import java.util.Scanner;
  
   class palindrome
    {
       public static void main(String args[]) 
          {
              System.out.println("enter the nomber");
              Scanner sc= new Scanner(System.in);
              int a = sc.nextInt();
              int original=a;
              int rem=0,reversed=0;
              while(a!=0)
                {
                    rem=a%10;
                     reversed=(reversed*10)+rem;
                     a=a/10;

                }
                if(reversed==original)
              System.out.println("it is palindrome");
                else
              System.out.println("not a palindrome");
          }

    }