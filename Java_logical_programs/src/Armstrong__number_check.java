import java.util.Scanner;

public class Armstrong__number_check 
{
	 public static void main(String[] args) 
	 {
		 Scanner sc=new Scanner(System.in);
			System.out.println("enter you armstrong no");
			
			int number=sc.nextInt();
			
			int temp=number;
		 int count=0;
			while(number>0)
			{
				int rem=number%10;
				count=count+rem*rem*rem;
				number=number/10;
			}
			
			if(temp==count)
			{
				System.out.println("this no is armstrong number" +temp+ "    "+count);
			}
			else
			{
				System.out.println("this no is  not armstrong number" +temp+ "    "+count);
				
			}
	 }
}
