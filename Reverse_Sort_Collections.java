package Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Reverse_Sort_Collections {

	public static void main(String[] args) {


		List<Integer> ls= Arrays.asList(11,34,242,33,51,44);
		
		//loop
		for(int i=ls.size()-1;i>=0;i--)
		{
			System.out.println(ls.get(i));
		}
		//collections
		Collections.reverse(ls);
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
	}

}
