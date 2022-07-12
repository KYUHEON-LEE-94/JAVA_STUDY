package day10;

public class ClassTest2 {
	
	//instance Variable:iv
	//class Variable:cv
	//instance method:im
	//class method:cm
	
	
	int iv = 4; //인스턴스 변수
	static int cv = 10; //클래스 변수
	
	static void cm() {} //클래스 메서드
	void im() {} //인스턴스 메서드
	
	static void cmIm() {
//		System.out.println(iv);
//		im();
		//클래서 메서드에서 인스턴스 멤버 호출한 경우
		//불가능
	}
	
	void imCm() {
		System.out.println(cv);
		cm();
		//인스턴스 메서드에서 클래스 멤버 호출한 겨웅
		//가능
		
		//인스턴스 메서드에서 인스턴스 멤버 접근
		System.out.println(iv);
		im();
	}
	
}
