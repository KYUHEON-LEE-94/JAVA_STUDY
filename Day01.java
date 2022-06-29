package day01;

public class Day01 {
	public static void main(String[]args){
		System.out.println("안녕\t하 \n 세요");
		/*
		 * 제어문자
＼: 컴퓨터에게 String 타입의 쌍따옴표임을 알려준다.
ex) System.out.println("친구가 \"밥먹으러 가자\"라고 말했다.");
＼t:tab
＼n: enter -> 줄바꿈
＼＼:역슬래쉬를 컴퓨터에게 알려줌
		 */
		System.out.print("오늘은 금요일입니다");
		System.out.printf("오늘은 %d 월 %d일 입니다.",6,29);
	}	
}

//static 은 이 함수가 정적 함수임을 의미합니다. 
//1. static 으로 함수 또는 클래스를 선언했을 경우에 해당 객체는 자바가 컴파일 되는 순간 정의가 됩니다.  
//2. 그리고 이후 static 이 아닌 객체가 정의가 되죠 -> 컴파일되는 순간 static을 정의하고 static이 아닌 객체가 호출 그러므로,
//3. static 객체에서 static 이 아닌 객체를 호출하는것은 불가능합니다.
//static 이 먼저 정의가 되기때문에 아직 정의되지 않은 객체는 호출할수 없기때문입니다.
// 순서를 생각해보면 금방 이해될 내용입니다.
