import java.util.Scanner;

public class Reverse__String 
{

	public static void main(String[] args) 
	
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String value");
		String value=sc.nextLine();
		String rev ="";
		//String value = "abcd";
		int len = value.length();
		for (int i = len-1; i >=0 ; i--)
		{

			rev = rev + value.charAt(i);
			
		}
		
		System.out.println(rev);
	}

}
