package day10;

class Cars{
	
	public Cars(int speed,String name, String color, int price) {
		//기본 생성자
		this.speed = speed;
		this.name = name;
		this.color = color;
		this.price = price;
		
	}
	
	public Cars() {
		
	}
	
	
	
	static int wheel = 4; //클래스 변수, 스태틱 변수, 스태틱 멤버, 스태틱 멤버 변수 *하나의 저장공간 공유
	// ->  이변수는 수정이 가능함
	
	int speed = 0; //인스턴스 변수, 인스턴스 멤버, 인스턴스 멤버 변수 *저장 공간이 따로
	//-> 인스턴스 변수는 객체가 생성될때 메모리에 등록된다.
	//->^인스턴스 변수는 원래의 클래스 안에 메모리 등록이 안되어있다.
	String name; //차 이름 - 인스턴스 변수
	String color;//차량 색깔- 인스턴스 변수
	int price; //차량 가격
	
	public void setVariable(int speed,String name, String color, int price) {
		//멤버 변수를 초기화 해주는 메서드
		//매개변수 초기화 해줄 값들을 받아와야한다.
		
		this.speed = speed;
		this.name = name;
		this.color = color;
		this.price = price;
			
	}
	
	public void engineOn() {
		System.out.println("시동을 켭니다~ 부르릉");
	}
	
	public void go() {
		System.out.println("앞으로 갑니다");
	}
	
	public void show() {
		System.out.println("차주 이름: " +this.name);
		System.out.println("차량 색깔: " +this.color);
		System.out.println("차량 가격: " +this.price);
		System.out.println("바퀴 갯수: " +this.wheel);
	}
	
//	public static void method1() {
//		System.out.println(this.color);
//	}
	
	
	
} 



public class ClassTest {
	public static void main(String[] args) {
		
		System.out.println(Cars.wheel);
//		System.out.println(Cars.speed); -> 객체 생성 전이기 때문에 인스턴스 변수 사용 불가
		
		Cars myCar = new Cars();
		
		
		System.out.println(myCar.speed);
		System.out.println(myCar.wheel);
		//인스턴스로 클래스 변수에 접근은 가능하나
		//자바에서는 추천하지 않는다. 왜? 잘못 건드려서 클래스 변수 값이 변경될 수 있으니까. *하나의 저장공간 공유

//		System.out.println(Cars.speed); ^그래서 불러올 수가 없다.
		
		
		System.out.println("---------------");
		Cars momCar = new Cars();
		momCar.speed = 100;
		momCar.wheel = 6;
		
		System.out.println(momCar.speed);
		System.out.println(momCar.wheel);
		
		System.out.println(myCar.wheel);
		System.out.println(myCar.speed);
		
		myCar.name = "너";
		myCar.color ="black";
		
		myCar.show();
		
		myCar.price = 100;
		myCar.name = "김철수";
		
		myCar.setVariable(100, "김철수", "빨강", 100);
		
		
		
	}
}
