package javaBasicsProg;

import java.util.Scanner;

public class segrrigate1And0 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		int a=sc.nextInt();
//		int b=sc.nextInt();
		int cnt=0;
		int arr[]= {1,0,1,0,1,0};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				cnt++;
		}
		for(int i=0;i<cnt;i++)
		{
			arr[i]=0;
		}
		for(int i=cnt;i<arr.length;i++)
		{
			arr[i]=1;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
