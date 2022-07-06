package day06;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		
		//랜덤한 정수를 가져오는 메소드
		//Random 클래스 안에 있는 nextInt();
		
		Random r = new Random();
		
		System.out.println(r.nextInt(2)); //(num)안에 숫자를 넣으면 범위를 지정할 수 있음 -> 0 ~ num-1
											//(num1, num2) -> num1~num2 -1까지 랜덤하게 변수를 받아온다.
											//안넣으면 int타입 전 범위에서 랜덤하게 점수를 받아옴
											
		
	
	
	}
}
