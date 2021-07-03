import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Count__StringObject 

{	public static void main(String[] args) {
	

	  ArrayList<String> list = new ArrayList<String>();
      list.add("A");
      list.add("B");
      list.add("CC");
      list.add("CC");
      list.add("CC");
      Set<String> st = new HashSet<String>(list);
      for(String s:st) {
    	  
    	  System.out.println(s +"    "+Collections.frequency(list, s));
      }
      
      String[] array={"Java","Python","PHP","C++"};  
      System.out.println("Printing Array: "+Arrays.toString(array));  
//      Map<String, Integer> hm = new HashMap<String, Integer>();
//      for (String i : list) {
//          Integer j = hm.get(i);
//          hm.put(i, (j == null) ? 1 : j + 1);
//      }
//
//      // displaying the occurrence of elements in the arraylist
//      for (Map.Entry<String, Integer> val : hm.entrySet()) {
//          System.out.println("Element " + val.getKey() + " "
//                             + "occurs"
//                             + ": " + val.getValue() + " times");
      }
  }

