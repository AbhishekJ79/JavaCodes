package javaBasicsProg;

public class fibonacci {

	public static void main(String[] args) {
	
		int x=0 ,y=1,fib=0;
		System.out.println(x);
		System.out.println(y);
		while(fib<=50)
		{
			fib=x+y;
			x=y;
			y=fib;
			if(fib<=50)
			{
				System.out.println(fib);
			}
		}

	}

}
