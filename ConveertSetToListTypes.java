package Collections;

//import java.util.Set;
import java.util.*;

import java.util.stream.Collectors;

public class ConveertSetToListTypes {

	public static void main(String[] args) {

		
		Set<Integer> s= Set.of(10,23,43,24,34);
		//or
		Set<Integer> hs= new HashSet<>();
		hs.add(1);
		hs.add(8);
		hs.add(4);
		hs.add(22);
		
		// 1st add element in list 
		ArrayList<Integer> ls= new ArrayList<>();
		for(int i:s)
		{
			ls.add(i);
		}
       System.out.println(ls);
       
       // 2nd stream - using stream convert to list 
       List<Integer>ls2= hs.stream().collect(Collectors.toList());
        
       
       // convert list to Array s
		Integer[]a= new Integer[ls.size()];
		a=ls.toArray(a);
		
		Arrays.sort(a);
		for(int i:a)
		{
		System.out.println(i);
		}
	}

}
