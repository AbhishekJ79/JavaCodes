package java8;

import java.util.Arrays;
import java.util.List;



public class Stream_Distinct_Count_Limit {

	public static void main(String[] args) {

         Integer arr[]= {12,34,24,22,44,12,34};
         List<Integer>ls=Arrays.asList(arr);
         
         
		List<String> ls1= Arrays.asList("Abhishek","jadhav","rinkuu","deore","Abhishek");
		
		//duplicate remove -distinct()
		ls1.stream().distinct().forEach(System.out::println);
		
		//count 
		long cnt=ls.stream().distinct().count();
		System.out.println(cnt);
		
		//limit - give the limited elements 
		ls1.stream().limit(3).forEach(str->System.out.println(str));

	}

}
