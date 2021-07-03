import java.util.Scanner;

public class Reverse__number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your no ");
	int input=sc.nextInt();
	int temp=input;
	int reverse=0;
	while(input !=0) {
		
		reverse=reverse*10+input%10;
		input=input/10;
	}
	
	System.out.println("reverse number of " +temp+"is   "+reverse);
} 

}
