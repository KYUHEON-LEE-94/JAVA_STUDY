package day03;

public class OperatorTest5 {
	public static void main(String[] args) {


		// 논리 연산자는 boolean 타입의 자료를 연산할 때 사용
		//&&

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(10>5 && 6>5);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(!(10 >=10) || "안녕".equals("안녕") && 10 != 10);
//		False || True && False --> False
		
		sys
	}
}