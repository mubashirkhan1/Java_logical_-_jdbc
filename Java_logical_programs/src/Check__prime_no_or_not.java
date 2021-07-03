import java.util.Scanner;

public class Check__prime_no_or_not 

{
	public static void main(String[] args)
	{
		int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int number=sc.nextInt();
		int temp=number;
		
		for(int i=2; i<number; i++)
		{
			if(number%i==0)
			{
				count++;
			}
			
		}
		
		if(count>1)
		{
			
			System.out.println(number +"   this no is not   prime");
		}
		else
		{
			System.out.println(number +"      this number is prime no");
		}
	}
}
