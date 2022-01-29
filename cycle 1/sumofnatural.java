import java.util.*;

class sumofnatural
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("sum up to:");
		int n=sc.nextInt();
        int sum=0;
         {
             for(int i=0;i<=n;i++)
               {
                  sum=sum+i;
               }
               System.out.println("the sum is");
               System.out.print(sum);

         }
    }
}         
