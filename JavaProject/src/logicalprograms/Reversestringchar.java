package logicalprograms;

import java.util.Scanner;

public class Reversestringchar {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your String value");
	String s=sc.next();
	char char1[]=s.toCharArray();
	for (int i=char1.length-1; ; i--) {
		
		System.out.println(char1[i]);
	}
	
	}
}
