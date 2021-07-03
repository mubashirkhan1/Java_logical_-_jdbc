import java.util.Scanner;

public class count__even_odd_digit {

	
	

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int number=sc.nextInt();
		
		int even_count=0;int odd__count=0;
		
		while(number>0) {
			
			
			int rem=number%10;
			if(rem%2==0) {even_count++;}
		
		else
		{ 
			odd__count++;
			}
			
			number=number/10;
		}
		System.out.println("odd digit is  "+odd__count+"     even digit is    "+even_count);
		
}
}