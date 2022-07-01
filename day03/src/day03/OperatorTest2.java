package day03;

public class OperatorTest2 {
	public static void main(String[] args) {

		System.out.println("---int - ???");
		System.out.println(10 - 10); // int - int -> int
		System.out.println(10 - 3.14); // int - double -> double
		System.out.println(10 - 'a'); // int - char -> int
//		System.out.println(10 - "hello"); // int - String -> error
		
		
		System.out.println("---double - ???")
		System.out.println(3.14 - 10); // double - int -> double
		System.out.println(3.14 - 0.14); // double - double -> double
//		System.out.println(3.14 - 'a') //double - char -> double;
		System.out.println(3.14 - "hello") //double - String -> error
		;
		
		System.out.println("---char -???");
		System.out.println('a' -'a'); //char - char -> int
//		System.out.println('a' - "abc"); //char - String -> error
		
		
		System.out.println("---String - ???");
//		System.out.println("abc" - "ab"); //String은 뺏셈 연산이 불가능하다.

	}
}
