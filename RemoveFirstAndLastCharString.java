package javaBasicsProg;

public class RemoveFirstAndLastCharString {

	public static void main(String[] args) {


		String str="Abhishek";
		String temp="";
		String str1=str.substring(1, str.length()-1);
		System.out.println(str1);

        //OR
		 for(int i=1;i<str.length()-1;i++)
		 {
			 temp=temp+str.charAt(i);
		 }
		 System.out.println(temp);
	}

}
