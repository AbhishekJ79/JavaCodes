package Collections;

import java.util.Iterator;
import java.util.List;

public class TypesOFListIteration {

	public static void main(String[] args) {


		List<Integer> list= List.of(10,12,42,432,45);
		System.out.println(list);


		//for earch loop
		for(int i:list)
		{
			System.out.println(i);
		}
		
		// iterator
		Iterator<Integer>it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// lambda expression 1
		list.forEach(System.out::println);
		
		
		// lambda exp 2
		list.forEach(ele ->System.out.println(ele));
	}

}
