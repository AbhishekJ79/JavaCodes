package Collections;

import java.util.HashMap;
import java.util.TreeMap;

public class SortHashMapKey {

	public static void main(String[] args) {


		HashMap<Integer,String> map= new HashMap<>();
	     
	     map.put(23, "abh");
	     map.put(9, "a");
	     map.put(24, "as");
	     map.put(2,"xyz");
	     
        TreeMap<Integer, String> tm= new TreeMap<>();
        
        for(int i: map.keySet())
        {
        	tm.put(i, map.get(i));
        }
        
        System.out.println(tm);
        for(String s: map.values())
        {
        //	tm.put(s, map);
        }
	}

}
