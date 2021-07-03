package jdbcprograms11;

import java.util.Scanner;

public class Arraybyuser1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter you size");
		int size=sc.nextInt();
		int []a=new int [size];
		System.out.println("add elements in array");
		for(int i=0;i<a.length;i++)
		{
			   a[i] = sc.nextInt();
		}
		Array11.Array111(a);
		
	}

}
class Array11
{
static void Array111(int[] a) {
for(int i=0;i<a.length;i++)
 {
	 System.out.println(a[i]);
 }
}
}
