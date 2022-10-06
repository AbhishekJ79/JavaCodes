package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListToSetTypes {

	public static void main(String[] args) {
	
		
		List<String> ls= List.of("Abhi","Shek","Jadhav","Shek");
		//or
		List<String> ls1= Arrays.asList("ram","sham","tom");
		
		
		HashSet<String>hs= new HashSet<>();
		
		//1st using for loop and add in set
		for(String s:ls)
		{
			hs.add(s);
		}
		System.out.println(hs);
		
		// 2nd -add all
		hs.addAll(ls1);
		System.out.println(hs);
 
		//using stream
		Set<String> s=ls1.stream().collect(Collectors.toSet());
		System.out.println(s);
	}

}
