package javaBasicsProg;


class m1{
	
	int a=10;
	public void test1()
	{
		System.out.println("test1");
	}

}
class m2 extends m1{
	 
	 public void test2()
	 
	 { 
		 super.test1();
		 System.out.println(super.a);
		 System.out.println("test2");
	 }
	
}
public class Super {
	public static void main(String[] args) {
		
		m2 obj= new m2();
		obj.test2();
		
	}
	}

