package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Filter_1 {

	public static void main(String[] args) {


		List<Integer> ls= Arrays.asList(11,34,242,33,51,44);
	
		
		ArrayList<Integer> newList= new ArrayList<Integer>();
		
		// filter even numbers without stream 
		for(int i: ls)
		{
			if(i%2==0)
				newList.add(i);		
		}
	    System.out.println(newList);
		
	    
		// with streams filter 
		 ls.stream().filter(n->n%2==0).forEach(System.out::println);
		
		 
		 // with stream filter collector
		 List<Integer> list =ls.stream().filter(n->n%2==0).collect(Collectors.toList());
		 System.out.println(list);
	}
}


