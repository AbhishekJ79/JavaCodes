package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrarListToArray {

	public static void main(String[] args) {
		
		List<Integer> listData= List.of(10,12,343,2,77);
		//OR
		ArrayList<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(49);
		list.add(25);
		list.add(98);
		list.add(32);
		System.out.println(list);
		
	//	Object []arr=list.toArray();  // return object of arry
		
		 Integer[] arr = new Integer[list.size()]; 
	        arr = list.toArray(arr);
		
	        
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				Arrays.sort(arr);
				System.out.println(arr[i]);
			}
		}
		
	}

}
