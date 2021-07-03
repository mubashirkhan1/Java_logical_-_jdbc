package Synchronisation_program;

import java.util.ArrayList;

public class String_program {
	String poll=null;
	public static void main(String[] args) 
	{int count=1; String value = null;	String poll=null; int count11=1;
		ArrayList<String> a=new ArrayList<String>();
		a.add("A");//2
		a.add("B");
		a.add("A");
		a.add("C");
		a.add("D");
		a.add("B");//3
		a.add("B");
		
	int a1= a.size();
	System.out.println(a1);
	
	for(int i=0;i<a.size();i++) 
	{
		for(int j=1;j<a.size();j++) 
		{
			//String p=a.get(j);
			if(a.get(i).equals(a.get(j)))
			{   
				count=count+1;
			//System.out.println("hello");
			value=   a.get(i);
		    }

			else if(j==a1-1) 
			{
		      System.out.println(count+"   is "+ value+"    " +a.get(j));
		      
		      count=1;
		      value=null;
			}
		
	   }

	
	}
	
//	for(String value11:a) {
//		poll=value11;
//		if( poll.equals(value))
//		{
//			count11=count11+1;
//		System.out.println(value11 );
//		}
//		poll=null;
	}

}

