package java8;

public class FunctionalInterfaceLambdaExp1 {
	
    @FunctionalInterface
	interface functional
	{
		public void m1();   // only 1 abstract method allowed 
		
	}
	
	
	public static void main(String[] args) {
		
		functional i=()-> System.out.println("hello M1");
		i.m1();

	}

}
