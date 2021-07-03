import java.util.Scanner;

public class Palindrome__number {

	public static void main(String[] args) {
		int rev=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no ");
		int input = sc.nextInt();
	     int	temp=input;
		
		while(input !=0) 
		
		{
			rev=rev*10+input%10;
			input=input/10;
			
		}
		if(rev==temp)
		{
			
			System.out.println(rev+"      its no is palindrom");
		}
		
		else 
		{
			System.out.println(rev+"      its no is not  apalindrom");
		}
		
	}
}
