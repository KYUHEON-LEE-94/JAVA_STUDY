package day03;

public class OperatorTest4 {
	public static void main(String[] args) {

		System.out.println("---int /???"); 
		System.out.println(10 / 4); // int/ int = int(몫연산 실행)
		System.out.println(10 / 3.14); // int / double = double
		System.out.println(97 / 'a'); // int / char = int
//		System.out.println(100 / "hello"); // int / String = Error

		System.out.println("---double / ???"); 
		System.out.println(3.14 / 2); // double / int = double
		System.out.println(3.14 / 3.14); // double / double = double
		System.out.println(3.14 / 'a'); // double / char = double
		
		System.out.println("---char / ???"); 
		System.out.println('a'/ 3); // char / int = int(몫연산 실행)
		System.out.println('a' / 3.14); // char / double = double
		System.out.println('a' / 'B'); // char/ char = int(몫연산 실행)
		
		//char --> int
		System.out.println(10 / 0); // Error 발생 error 명:java.lang.ArithmeticException:
				//-> 수학적 요류
		
		System.out.println(10 % 3.14); // int % double -> double
		System.out.println(); //
		System.out.println(); //
		System.out.println(); //
		System.out.println(); //
		System.out.println(); //
		System.out.println(); //
		System.out.println(); //
		System.out.println(); //
		

	}
}
