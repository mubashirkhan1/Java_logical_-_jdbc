import java.util.Scanner;

public class Swap__number {
public static void main(String[] args) 
{

	Scanner sc=new Scanner(System.in);
	System.out.println("enter your first number");
	int input=sc.nextInt();
	
	System.out.println("enter your second number");
	int input2=sc.nextInt();
	
	int input3;
	//swapping using third variable
//	input3=input;
//	input=input2;
//	input2=input3;
	System.out.println("befor swapping  "+input+"   "+input2);
	input=input+input2;
	input2=input-input2;
	input=input-input2;
	
	System.out.println(input  +"  "+input2);
}
}
