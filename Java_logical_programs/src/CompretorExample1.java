import java.util.Comparator;
import java.util.TreeSet;

public class CompretorExample1
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet(new Mycom());
		ts.add(33);
		ts.add(44);
		ts.add(33);
		ts.add(222);
		ts.add(66);
		ts.add(32);
		System.out.println(ts);
	}
}
 class Mycom implements Comparator
 {


	public int compare(Object o1, Object o2) {
    Integer a=(Integer)o1;
    Integer b=(Integer)o2;
    
    if(a>b) {
    	return -1;
    }
    else if(a<b) {return +1;}
    else return 0;
	}
	 
	 
 }
