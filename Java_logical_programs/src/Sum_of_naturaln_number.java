import java.util.Scanner;

public class Sum_of_naturaln_number {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your no ");
		int input=sc.nextInt();
		
		int sum=0;
		for(int i=1; i<=input; i++)
		{
			
			sum=sum+i;
		}
		
		System.out.println(sum);
	}
}
