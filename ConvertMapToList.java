package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConvertMapToList {

	public static void main(String[] args) {

		  HashMap<String,Integer> map= new HashMap<>();
		     
		     map.put("Abhi", 23);
		     map.put("Abfhi", 233);
		     map.put("Afbhi", 293);
		     map.put("adfs ", 23);
		   
		     
		     List<String> ls= new ArrayList<String>(map.keySet());
		     for(String s: ls)
		     {
		    	 System.out.println(s);
		     }
		     List<Integer> ls1= new ArrayList<Integer>(map.values());
		     for(int i: ls1)
		     {
		    	 System.out.println(i);
		     }

	}

}
