package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertMapToSet {

	public static void main(String[] args) {

	     HashMap<String,Integer> map= new HashMap<>();
	     
	     map.put("Abhi", 23);
	     map.put("Abfhi", 233);
	     map.put("Afbhi", 293);
	     map.put("adfs ", 23);
	     
	     //map.keyset
	     Set<String>s=new HashSet<String>(map.keySet());
	     System.out.println(s);
	     
	     //map.values
	     Set<Integer>s1=new HashSet<Integer>(map.values());
	     System.out.println(s1);
	     
	     //using stream map.values
	     Set<Integer>s2=map.values().stream().collect(Collectors.toSet());
	     System.out.println(s2);
	     
	     //using stream map.keySet
	     Set<String>s3=map.keySet().stream().collect(Collectors.toSet());
	     System.out.println(s2);
	     
	    

	}

}
