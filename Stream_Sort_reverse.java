package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream_Sort_reverse {

	public static void main(String[] args) {
		
		List<Integer> ls= Arrays.asList(11,34,242,33,51,44);
		
//		Integer arr[]= {19,23,4,14,1};
//		List<Integer> la=Arrays.asList(arr);
		
		// sort list - ascending order 
		ls.stream().sorted().forEach(System.out::println);
		
		//reverse order descding order
		ls.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		
		
	}

}
