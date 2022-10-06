package javaBasicsProg;

public class palindromStringCheck {

	public static void main(String[] args) {


		String str="man";
		String temp=str;
		String temp1="";
		for(int i=temp.length()-1;i>=0;i--)
		{
			temp1=temp1+temp.charAt(i);
		}
		System.out.println(temp1);
		
		if(temp1.equals(str))
		{
			System.out.println("pali");
		}
		else
		{
			System.out.println("not plai");
		}
	}

}
