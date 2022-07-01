package day03;

public class RelationOper {
	public static void main(String[] args) {
		//비교가능한 타입
		// <, >, ==, !=
		
		System.out.println(10 < 5);
		System.out.println(10 > 6.5);
		System.out.println(10 < 'a');
		System.out.println('a' < 'b');
		
//		System.out.println(10 > true);
//		System.out.println(3.14 < "hello");
//		System.out.println("안녕" < "안녕하세요");
		
		//대소 비교가 가능한 타입: int, double, char
		
		System.out.println(10 == 4);
		System.out.println(3.14 == 3.14);
		System.out.println('a' == 'a');
		System.out.println('a' == 97);
		System.out.println("hello" == "hello");
//		System.out.println("hello" == 20);
		//String 타입은 String타입끼리만 비교가 가능하다.
		
		System.out.println("hello" != "abc");
		//String타입의 관계연산자를 통한 비교는 바람직하지 않다.
		
		System.out.println("안녕".equals("안녕"));
		//String 타입 비교는 .equals 메서드를 사용한다.
		
	}
}
