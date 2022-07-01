package day03;

public class CastingTest {
	public static void main(String[] args) {
		System.out.println((int)3.14);
		System.out.println((double)97);
		System.out.println((char)97.0);
		System.out.println((int)'a');
//		System.out.println((String)97); //String 형변환 불가
		
		
		//int -> String
		System.out.println(Integer.toString(54) + 20);
	
		
		//String -> int
		System.out.println(Integer.parseInt("100") + 20);
		
		//double --> string
		System.out.println(Double.toString(3.14) + 10);
		
		//String -> double
		System.out.println(Double.parseDouble("3.14") + 10);
		
		//덧셈연산자를 활용하여 형변환
		//오토 캐스팅(auto casting) = 암묵적 형변환
		System.out.println(54 +"" + 20);
		System.out.println(10.2 +"" + 20);
		
	}
}
