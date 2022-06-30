package day02;

public class OperatorTest {
	public static void main(String[] args) {
		System.out.println("---int + ??");
		System.out.println(10 + 10); //int + int -->int
		System.out.println(10 + 3.14); //int + double --> dobule
		System.out.println(10 + 'a');  // int + char(아스키 코드로 변환됨) -->int
		System.out.println(10 + "안녕"); // int + String --> String(연결)
		
		System.out.println("----double + ???");
		System.out.println(3.14 + 2.2141245);  //dobule + dobule --> dobule
		System.out.println(3.7 + 0.3); // 결과가 정수더라도 double 타입
		System.out.println(3.1 + 'a'); //double + char(아스키 코드로 변환됨) -->double
		System.out.println(3.14 +"hello"); // double + String --> String(연결)

		System.out.println("---char + ???");
		System.out.println('a'  +'b'); //char(아스키 코드로 변환됨)  +char(아스키 코드로 변환됨)  -->int
		System.out.println('a' +"hello"); //char + String --> String(연결)
		
		System.out.println(7 + 'a' + "" + 50);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
