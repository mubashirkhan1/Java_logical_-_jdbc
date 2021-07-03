package jdbcprogram;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Comparableexamle {
	public static void main(String[] args) 
	{
		TreeSet  ts=new TreeSet(new Mycomparator());
		ts.add(33);
		ts.add(66);
		ts.add(43);
		ts.add(65);
		ts.add(45);
		ts.add(97);
		ts.add(66);
		
	    Stream<Integer>  stream=ts.stream();
//	    stream.forEach(System.out::println);
	    stream.forEach(p->{
	    	System.out.println(p);
	    });
		
	}

}
 
class Mycomparator implements Comparator<Integer>

{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return -o1.compareTo(o2);
	}
	
	
	
}