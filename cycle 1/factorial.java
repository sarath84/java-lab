
import java.util.*;

class factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=n;i++)
        {
           factorial=factorial*i;

        }
        System.out.println("factorial");
        System.out.print(factorial);
    }
}         
         