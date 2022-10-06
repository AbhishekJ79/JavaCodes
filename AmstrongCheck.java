package javaBasicsProg;

import java.util.Scanner;

public class AmstrongCheck {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println(num);
        
        int temp=num,rev=0,rem=0;
        
        while(temp>0)
        {
        	rev=temp%10;
        	rem=rem+(rev*rev*rev);
        	temp=temp/10;
        }
        if(rem==num)
        {
        	System.out.println("Amtrong");
        }
        else
        {
        	System.out.println("not amstroing");
        }

	}

}
