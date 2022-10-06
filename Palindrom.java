package javaBasicsProg;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {


		Scanner scan= new Scanner(System.in);
         int num=scan.nextInt();
         System.out.println(num);
         
         int temp=num;
         int rev=0,rem=0;
         while(temp>0)
         {
        	 rev=temp%10;
        	 rem=rem*10+rev;
        	 temp=temp/10;
         }
         if(rem==num)
         {
        	 System.out.println("palindrom");
         }
         else
         {
        	 System.out.println("not palindrom");
         }
	}

}
