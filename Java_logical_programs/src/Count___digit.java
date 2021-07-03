import java.util.Scanner;

public class Count___digit 

{

	
	public static void main(String[] args) {
      int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int number=sc.nextInt();
		int temp=number;
		
	  while(number>0) 
	  {
		 count= count+1;
		 
		 number=number/10;
	  }
		System.out.println("this digit of this number    " +temp +"    "+count);
		
	}
}
