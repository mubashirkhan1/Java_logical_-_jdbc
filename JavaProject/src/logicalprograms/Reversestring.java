package logicalprograms;

import java.util.Scanner;

public class Reversestring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your String value");
		String s=sc.next();
		StringBuffer sb=new StringBuffer();
		sb.append(s);
		sb.reverse();
		System.out.println(sb);
	}

}
