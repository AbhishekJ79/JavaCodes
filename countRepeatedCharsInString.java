package javaBasicsProg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class countRepeatedCharsInString {

	public static void main(String[] args) {
	String str="aBahiisskierak";
		HashMap<Character,Integer> hm= new HashMap<>();
		for(int i=0; i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		
		System.out.println(hm);
		
		// repeated chars only
		Set<Character>s=hm.keySet();
		for(char c: s) {
			if(hm.get(c)>1)
			{
				System.out.println(c +" repeates:- "+hm.get(c));
			}
		}
		
		  
		
		

}
}
