package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Filter_2 {

	public static void main(String[] args) {

		List<String> ls1= Arrays.asList("ABhishe","","rinkuu","");
		
		// filter empty strings
		ls1.stream().filter(str->!str.isEmpty()).forEach(System.out::println);

		
		
		List<Integer> ls2= Arrays.asList(12,53,66,45,12,53);
		
	    ls2.stream().distinct().forEach(System.out::println);
		
	}

}
