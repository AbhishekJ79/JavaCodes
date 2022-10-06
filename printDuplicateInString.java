package javaBasicsProg;

import java.util.ArrayList;
import java.util.HashSet;

public class printDuplicateInString {

	public static void main(String[] args) {
		String str="abhisfhdbab";
		int cnt=0;
		char[]ch=str.toCharArray();
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i+1;j<=str.length()-1;j++)
			{
				if(ch[i]==ch[j])
				{
					
					System.out.println(ch[j]+ " "+cnt);
					cnt++;
					break;
				}
			}
		}

		
	}

}

