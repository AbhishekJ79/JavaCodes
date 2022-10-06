package javaBasicsProg;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateStringCollection {

	public static void main(String[] args) {

    String str="Abhissshekk";
    HashSet<Character>s=new HashSet<Character>();
    
    for(int i=0;i<str.length();i++)
    {
    	s.add(str.charAt(i));
    }
    System.out.println(s);
    
    String str1=s.toString();
    

	}

}
