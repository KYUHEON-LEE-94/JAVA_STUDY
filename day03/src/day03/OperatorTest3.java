package day03;

public class OperatorTest3 {
	public static void main(String[] args) {

		System.out.println("---int * ???");
		System.out.println(10 * 10); // int * int -> int
		System.out.println(10 * 3.1); //int * double -> double	
		System.out.println(10 * 'a'); // int * char -> int
//		System.out.println(10 * "hello"); // int * String -> error
		
		System.out.println("--- dobule * ???"); // 
		System.out.println(3.14 * 10.2); // dobule * dobule = dobule
		System.out.println(3.14 * 'a'); // dobule * char = int
//		System.out.println(3/14 * "hello"); //dobule * String = error
		
		System.out.println("---char * ???"); 
		System.out.println('a' * 'a'); // char * char = int
//		System.out.println('a' * "hello"); //char * String = error
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

	}
}
