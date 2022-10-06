package javaBasicsProg;

import java.util.HashSet;

public class removeDuplicateInArray {

	public static void main(String[] args) {


		int []arr= {10,23,3,43,242,2,3,10};
		
		HashSet<Integer> hs= new HashSet<>();
		
		for(int i=0; i<arr.length;i++)
		{
			hs.add(arr[i]);
		}

		System.out.println(hs);

	}

}
