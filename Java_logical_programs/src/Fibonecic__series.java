import java.util.Scanner;

public class Fibonecic__series {
	
	public static void main(String[] args)
	
	{
		System.out.println("enter youe input");
	
		Scanner sc=new Scanner(System.in);
	
		int input=sc.nextInt();
		
		int first=0,second=1,result=0;
		
		for(int i=0;i<=input;i++)
		{
		 System.out.println(result +"   ");	
		 result=first+second;
		 first=second;
		 second=result;
			
		}

}
}