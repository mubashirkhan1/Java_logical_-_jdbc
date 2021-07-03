import java.util.Scanner;

public class Palindrom__String 
{
	public static void main(String[] args)
	{
		String rev="";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your String value");
		String input=sc.nextLine();
    	String temp=input;
		
		int length=input.length();
		for(int i=length-1; i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
		if(temp.equals(temp)) {
		System.out.println(rev +"   its palindrom String");
		}
		else {
			System.out.println(rev +"   its not palindrom String");
		}
	}
	
		
}
