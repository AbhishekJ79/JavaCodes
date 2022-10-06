package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Map_1 {

	public static void main(String[] args) {


		List<String> ls1= Arrays.asList("ABhishe","jadhav","rinkuu","deore");
		
		//convert to upper case
		ls1.stream().map(str->str.toUpperCase()).forEach(System.out::println);
		
	 List<String>newList=ls1.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
		
		
		// find the lengths of all elements .
		for(String s: ls1)
		{
			System.out.println(s.length());
		}
		
		//using stream map
		ls1.stream().map(str->str.length()).forEach(System.out::println);
	}

}
