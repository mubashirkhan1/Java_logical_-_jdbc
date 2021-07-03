import java.util.Scanner;

public class sum__digit 
{
	public static void main(String[] args) {
		
	
	   int sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your number");
			int number=sc.nextInt();
			int temp=number;
			
			
			while(number>0)
			{
				int rem=number%10;
				sum=sum+rem;
				
				number=number/10;
			}
			
			System.out.println("sum of this number "+temp+"  is    " +sum);
			
}
}