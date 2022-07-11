package day09;

public class Student {
	String name; //멤버, 멤버 변수
	int kor;
	int eng;
	int math;
	
	public Student(String name, int kor, int eng, int math) {
		//기본 생성자 -> 기능을 부여해줌 -> 초기화 생성자 ->기본 생성자가 사라짐
		this.name = name;
		this.eng = eng;
		this.kor = kor;
		this.math = math;
	}
	
	public Student() {
		// 새로운 기본 생성자를 만들어줄 수도 잇음
	}
	
	public void show() {//멤버, 멤버 함수 = 메소드
		
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
	}
	
	public void setVariable(String name, int kor, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.kor = kor;
		this.math = math;
		
	}
}
