package javaBasicsProg;

public class CountDuplicateCharString {

	public static void main(String[] args) {


		String str="abhiishek";
		int cnt=0;
		for( int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='i')
			{
				cnt++;
				
			}
			
			
		}
		System.out.println(cnt);
		
		

	}

}
