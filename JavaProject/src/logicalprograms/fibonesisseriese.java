package logicalprograms;

import java.util.Scanner;

public class fibonesisseriese {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number");
	int no=sc.nextInt();
	Fibonocis.m1(no);
	
	}
}
class Fibonocis
{
 static void	m1(int no) {
	 
	 int v1=0,v2=1,v3=1;
	 for(int i=1;i<=no;i++) {
		 System.out.println(v3);
		 v1=v2;
		 v2=v3;
		 v3=v1+v2;
				 
	 }
 }
}
