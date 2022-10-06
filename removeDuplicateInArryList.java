package javaBasicsProg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicateInArryList {

	public static void main(String[] args) {
	//	List<Integer> listData= List.of(10,12,343,2,77);
		
ArrayList<Integer> list= new ArrayList<>();
		list.add(12);
		list.add(2);
		list.add(12);
		list.add(1);
		list.add(124);
		list.add(1);
		list.add(12);
	//	System.out.println(list);
		
		
	// remove duplicate from array list	using Array List only
		ArrayList<Integer> newlist= new ArrayList<>();
		for(int i:list)
		{
			if(!newlist.contains(i))
			{
				newlist.add(i);
			}
		}
		System.out.println(newlist);
		
		//using stream	
	 List<Integer> newList= list.stream().distinct().collect(Collectors.toList());
	 System.out.println(newList);
			
		//remove duplicate using set
		HashSet<Integer> set= new HashSet<>();	
		for(int i:list)
		{
			set.add(i);
		}
		System.out.println(set);
      
	}

	
}
