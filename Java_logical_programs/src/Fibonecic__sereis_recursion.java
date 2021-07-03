import java.util.Scanner;

public class Fibonecic__sereis_recursion {
	static int first=0,second=1, result=0;	

	public static void main(String[] args) 
 {  
	System.out.println("enter your input");
	

	
	
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	Fibonecic__sereis_recursion obj=new Fibonecic__sereis_recursion();
	obj.recursionmethod(input);
	
 }	


	void recursionmethod(int input) 
	
	
	{
     	
		if(input>=1)
		{
		result=first+second;
		first=second;
		second=result;

		System.out.println(result);
		recursionmethod(input-1);
		}
	  	
	}
}