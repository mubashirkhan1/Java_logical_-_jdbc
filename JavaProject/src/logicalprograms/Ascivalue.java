package logicalprograms;

import java.util.Scanner;

public class Ascivalue {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your character");
		String p=s.next();
		System.out.println("enter your index");
		int c=s.nextInt();
		char b=p.charAt(c);
	     int asci= b;
	     System.out.println("this is  "+p+"     index is    "+c+"     asci value of this index      "+asci+b);
	}

}
