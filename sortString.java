package javaBasicsProg;

import java.util.Arrays;
import java.util.Scanner;

public class sortString {

	public static void main(String[] args) {
      
		String str="abhodgzib";

		char[]ch=str.toCharArray();
		
	//	Arrays.sort(ch);
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp =ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
	
	

}
