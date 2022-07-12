package day10;


class human{
	
	String name;
	int height, age;
	
	static String legs = "이족보행";
	static int heart = 1;
	
	
	public human(String name, int height, int age) {
		this.name = name;
		this.height = height;
		this.age = age;
	}


	public human() {
		
	}

	
	public void breath() {
		System.out.println(name+"이 숨을 쉽니다.");
	}
	
	public void eat() {
		System.out.println(name+"이 밥을 먹습니다.");
	}
	
	public void study() {
		System.out.println(name+"이 공부를 합니다.");
	}
	
	public void show() {
		System.out.println(name);
		System.out.println("키: "+height);
		System.out.println("나이: "+age);
		System.out.println("이족보행: "+legs);
		System.out.println("심장개수(?): "+heart);
	}
	
}




public class ClassTask {
	
	
	public static void main(String[] args) {
		//huam 클래스
		//속성 값으로: 이름, 키, 나이, 이족보행, 심장 개수.
		//기능: 숨쉬기, 밥먹기, 공부하기
		
		//객체화를 해서 사용
		//값을 초기와를 미리해주는 경우: "김철수"인스턴스
		//값을 나중에 초기화 하는 경우: "본인이름" 인스턴스
		
		human kim = new human("김철수", 180, 20);
		kim.show();
		kim.eat();
		kim.breath();
		kim.study();
		
		
		human lee = new human();
		lee.name = "이규헌";
		lee.height = 200;
		lee.age = 22;
		lee.show();
		
	}
}
