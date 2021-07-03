
public class Arraydublicate__find {
	public static void main(String[] args) {
		
	
 
	int a[]= {22,4,3,66,44,66,3,5,5};
	
	for(int i=0; i<a.length; i++)
	
		
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]==a[j]) {
				System.out.println(a[j]);
				
				
			}
		}
	}
}
