package javaBasicsProg;

import java.util.HashMap;
import java.util.Set;

public class printDuplicateInArray {

	public static void main(String[] args) {


		int arr1[]= {12,22,22,32,54,54,61,22,12,12};
		
//		for(int i=0;i<=arr1.length-1;i++)
//		{
//			for(int j=i+1;j<=arr1.length-1;j++)
//			{
//				if(arr1[i]==arr1[j])
//					System.out.println(arr1[j]);
//				break;
//			}
//		}

		
		HashMap<Integer,Integer>hm= new HashMap<>();
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			 int ele=arr1[i];
			if(hm.containsKey(ele))
			{
				hm.put(ele, hm.get(ele)+1);
			}
			else
				hm.put(ele, 1);
		}
		System.out.println(hm);
		
		Set<Integer>s=hm.keySet();
		for(Integer i: s) {
			if(hm.get(i)>1)
			{
				System.out.println(i +" repeates:- "+hm.get(i));
			}
	}

}
}
