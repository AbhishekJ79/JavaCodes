package javaBasicsProg;

import java.util.HashMap;
import java.util.Set;

public class CountRepeatedWOrdsInString {

	public static void main(String[] args) {

		String str="Abhishek is boy and Abhishek is ";
		String[]words=str.split(" ");
		
		HashMap<String,Integer>hm= new HashMap<>();
		
		for(int i=0;i<=words.length-1;i++)
		{
			String word=words[i];
			if(hm.containsKey(word))
			{
				hm.put(word, hm.get(word)+1);
			}
			else
			hm.put(word,1);
		}
		System.out.println(hm);
		
		Set<String>s=hm.keySet();
		for(String st: s)
		{
			if(hm.get(st)>1)
			{
				System.out.println(st +" : "+hm.get(st));
			}
		}

	}

}
