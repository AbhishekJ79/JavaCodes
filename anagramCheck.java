package javaBasicsProg;

import java.util.Arrays;

public class anagramCheck {

	public static void main(String[] args) {


		String str1="abhi";
		String str2="habi";
		
		if(str1.length()==str2.length())
		{
			char[]ch1=str1.toCharArray();
			char[]ch2=str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
			
			
		}

	}

}
