import java.util.Scanner;

public class Factorialno___byrecursion {
	static int fact=1;
	public static long recursionmethod(int input) 
	
	{
		 if(input>=1) {
			
		   fact=input*fact;
		   recursionmethod(input-1);
		   
		}
		return fact;
		
		
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your no ");
		int input=sc.nextInt();
		recursionmethod(input);
		System.out.println( input+"    factorial is    "+fact);
	}
}
