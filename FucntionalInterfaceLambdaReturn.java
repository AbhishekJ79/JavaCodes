package java8;

public class FucntionalInterfaceLambdaReturn {

	
	interface subtraction{
		
		public int sub(int a, int b);
	}
	
	public static void main(String[] args) {

      subtraction i=(a,b)-> {return a-b;};
      //or  
      //subtraction i=(a,b)->  a-b; 
      i.sub(10, 5);

	}

}
