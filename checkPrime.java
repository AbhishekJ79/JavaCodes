package javaBasicsProg;

public class checkPrime {

	public static void main(String[] args) {
		
		int num=5,cnt=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				cnt++;
				break;
			}
		}
		if(cnt==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
