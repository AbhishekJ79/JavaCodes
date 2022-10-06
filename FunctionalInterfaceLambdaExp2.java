package java8;

public class FunctionalInterfaceLambdaExp2 {

	interface addition{
		
		public void sum(int a,int b);
	}
	
	
	public static void main(String[] args) {
		
		addition i=(a,b)-> System.out.println(a+b);
		i.sum(10, 12);

	}

}
