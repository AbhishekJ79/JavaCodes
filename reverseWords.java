package javaBasicsProg;

public class reverseWords {

	public static void main(String[] args) {

    String str="pratiksha deore";
    String temp="";
      String[]words=str.split(" ");
      
      
      //reverse each letters in words 
      for(int i=0;i<=words.length-1;i++)
      {
    	  String word=words[i]; 
    	  String temp1="";
    	  
    	  for(int j=word.length()-1;j>=0;j--)
    	  {
    		  temp1=temp1+word.charAt(j);
    	  }
    	  temp=temp+temp1 + " ";
      }
      System.out.println(temp);
      
    
      
    //   reverse only words 
      for(int i=words.length-1;i>=0;i--)
      {
    	 temp= temp+ words[i]+ " ";
 
      }
      System.out.println(temp);
    

	}

}
