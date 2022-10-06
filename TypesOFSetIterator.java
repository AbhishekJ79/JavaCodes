package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class TypesOFSetIterator {

	public static void main(String[] args) {

		HashSet<Integer> hs= new HashSet<>();
		hs.add(23);
		hs.add(43);
		hs.add(67);
		hs.add(23);
		
		System.out.println(hs);
		
		//using enhasnsed for loop 
		for(int i: hs)
		{
			System.out.println(i);
		}
		
		// 1st using iterator
		Iterator<Integer>it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
 
		
		//2nd using lambda for each 
		hs.forEach(System.out::println);
		
		// 3rd using for each 2nd
		
		hs.forEach(ele->System.out.println(ele));

	}

}
