package javaBasicsProg;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {

int []arr= {10,3,54,244,22};


    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++)
    {
    	System.out.println(arr[i]);
    }
	
	System.out.println("Smallest: "+arr[0]);
	int largest=arr.length-1;
	System.out.println("Largest: "+arr[largest]);

	
	}
}


