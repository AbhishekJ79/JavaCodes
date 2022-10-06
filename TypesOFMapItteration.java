package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TypesOFMapItteration {

	public static void main(String[] args) {

     HashMap<String,Integer> map= new HashMap<>();
     
     map.put("Abhi", 231);
     map.put("Abfhi", 233);
     map.put("Afbhi", 233);
     map.put("adfs ", 23);
     
 
 // keySet
     Set<String> keys = map.keySet(); // The set of keys in the map.

     Iterator<String> keyIter = keys.iterator();
     while(keyIter.hasNext())
     {
    	 String key=keyIter.next();
    	 int value= map.get(key);
    	 int nextValue = map.get(key);

         if (value==nextValue) {
             map.remove(key);
             
     }
         System.out.println(map);
         
         ///
     for(String s: map.keySet())
     {
    	 System.out.println(s +" "+map.get(s));
     }
     
     //  entry set 
     for (Entry<String, Integer> entry : map.entrySet()) 
         System.out.println("Key = " + entry.getKey() +
                          ", Value = " + entry.getValue());
     
     
     // Lambda expression
     map.forEach((k,v)-> System.out.println(k+ " "+v));
	}
	
	
	  
	  

}
}
