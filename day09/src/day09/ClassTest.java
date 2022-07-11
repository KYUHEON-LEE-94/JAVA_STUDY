package day09;

public class ClassTest {
	public static void main(String[] args) {
		
		Student hong = new Student("홍길동",70,20,30);
		
//		hong.name = "홍길동";
//		System.out.println(hong.name);
//		hong.eng = 70;
//		hong.kor = 100;
//		hong.math = 100;
		
		hong.show();
		
		hong.setVariable("홍길동", 60, 100, 100);
		
		hong.show();
		
		Student kim = new Student();
		kim.show();
	
	}
}


