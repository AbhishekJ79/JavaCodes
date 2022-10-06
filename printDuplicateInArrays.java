package javaBasicsProg;

import java.util.HashSet;

public class printDuplicateInArrays {

	public static void main(String[] args) {
		
		int arr1[]= {12,22,32,54,61};
		int arr2[]= {12,23,32,55,61};
		
		HashSet<Integer>Hs= new HashSet<>();
		
		for(int i=0;i<arr1.length;i++)
		{
			Hs.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(Hs.contains(arr2[i]))
			{
				System.out.println(arr2[i]);
			}
		}
		

	}

}
