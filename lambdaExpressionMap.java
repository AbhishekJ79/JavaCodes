package javaBasicsProg;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class lambdaExpressionMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String,String> map=new LinkedHashMap<>();
		Scanner scan=new Scanner(System.in);
		  int n=scan.nextInt();
		  for(int i=0;i<n;i++)
		  {
			  String a=scan.nextLine();
			  String b=scan.nextLine();
			  map.put(a,b);
		  }
		  
		  
		  
		  map.forEach((a, b) -> System.out.println((a + ":" + b)));
	}

}
