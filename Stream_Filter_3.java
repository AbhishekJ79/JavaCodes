package java8;

import java.util.Arrays;
import java.util.List;

public class Stream_Filter_3 {

	public static void main(String[] args) {

		List<String> ls1= Arrays.asList("ABhishe","dadu","rinkuu","pratik");
		
		//filter data whoes length is 6>8
		
		ls1.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);

	}

}
