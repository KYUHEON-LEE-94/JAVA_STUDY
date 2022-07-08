package day08;

public class MethodTest {
	
	public static int method() {
		
		int num = 3;
		return num;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(MethodTest.method());
		
		System.out.println(add(1,2));
	
	}

public static int add(int a,int b) {
		
		int num = a+b;
		
		return num ;
		
	
	}
	
}
