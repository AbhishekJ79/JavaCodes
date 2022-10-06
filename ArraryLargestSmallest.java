package javaBasicsProg;

import java.util.Arrays;



public class ArraryLargestSmallest {

	public static void main(String[] args) {
	int[] arr= {11,45,42,6,1,90};
	int largest=arr[0];
	int smallest =arr[0];
	for(int i=1;i<=arr.length-1;i++)
	{
		if(arr[i]>largest)
		{
			largest=arr[i];
		}
		else if(arr[i]<smallest)
		{
			smallest=arr[i];
			
		}
		
	}
	System.out.println(largest +" "+smallest);
	
	int small=Arrays.stream(arr).min().getAsInt();
	int larg=Arrays.stream(arr).max().getAsInt();
	System.out.println(larg+" "+small);
	Arrays.stream(arr).filter(ele->ele%2==0).forEach(System.out::println);
	
	int arr1[]= new int[arr.length];
	int j=0, count=0;
	for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i]%2==0)
		{
			arr1[j]=arr[i];
			j++;
			
		}
	}
	for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i]%2!=0)
		{
			arr[j]=arr[i];
		//	j++;
		}
		
	}
	for(int i=0;i<=arr1.length-1;i++)
	{
		System.out.println(arr1[i]);
	}
	
	
	}

}
