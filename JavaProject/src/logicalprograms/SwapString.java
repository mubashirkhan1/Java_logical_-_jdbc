package logicalprograms;

import java.util.Scanner;

public class SwapString {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	//System.out.println("enter your x and y value");
	System.out.println("enter your no1 and no2 value");

	String s1=sc.next();
	String s2=sc.next();
	int i=sc.nextInt();
	int i1=sc.nextInt();
     System.out.println("before swapping  i is      " +i+"    "+i1);
     System.out.println("Before Swapping        " + s1 +"    "   + s2);
	String s3=s1;
	System.out.println(s3);
	 s2=s1;
	 s1=s3;
	 int i3=i1;
	 i1=i;
	 i=i3;
	 System.out.println("afetr Swapping     " + s1 + "   "+s1);
	  System.out.println("after swapping  i is         " +i+"    "+i1);

}}
