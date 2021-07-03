import java.util.Scanner;

public class Factorialnumber {
static	int result=1;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter you factorial no");
		
		int number=sc.nextInt();
	
		if(number<=0) {System.out.println("invalid no ");}
	
		else{for(int i=1; i<=number;i++){
			
        result=result*i;

    	System.out.println(i+"   is "+result);
		}
	
	}
	}

}
