package logicalprograms;

import java.util.Scanner;

public class Stringvalueprintchar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int value=sc.nextInt(); int rem=0;int rev=0; int temp;
		temp=value;
	   /*  for(int i=1; i<=value;i++)
	     {
	    	 
	     }*/
		while(value !=0) {
			rem=value%10;
			value=value/10;
			rev=rev*10+rem;
			
		
			//rev=rev
			//System.out.print(rem);
			
		}
		if(temp==rev) {System.out.println("palindrom no");}
		else {System.out.println("it is not palindrtom no");}
		System.out.println(rev);
	}

	
	

}
