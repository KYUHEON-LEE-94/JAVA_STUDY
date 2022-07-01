package day03;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1.사용자에게 두 정수를 입력받아서 둘 중 더 큰수를 출력하는 프로그램
		System.out.println("비교를 원하는 값1을 입력해주세요");
		int number1 = sc.nextInt();
		System.out.println("비교를 원하는 값1을 입력해주세요");
		int number2 = sc.nextInt();
		System.out.println(number1 > number2? number1+"이 큽니다" : number2+"이(가) 작습니다." );
		
		//2. 사용자에게 두 정수를 입력 받아서 두 수의 차(큰수 - 작은수)를 츨력하는 프로그램
		
		System.out.println("비교를 원하는 값1을 입력해주세요");
		int number3 = sc.nextInt();
		System.out.println("비교를 원하는 값1을 입력해주세요");
		int number4 = sc.nextInt();
		
		System.out.println(number3 > number4? number3 - number4 : );
		
		//3. 나이가 10 이상 25 이하면 1000원, 나머지 나이는 무료인 놀이공원이 있다.
		//나이를 입력 받고 알맞은 금액을 출력하는 프로그램
		
		//4.사용자에게 키와 나이를 입력받아서 120cm 이상, 8살 이상이라면 탑승가능 아니라면 탑승 불가 출력하는 프로그램

		//5. 사용자에게 이름을 받고 이름 "관리자" 라면 관리자 모드로 전환합니다 출력하기, 아니라면 000님 환영합니다. 출력하기
//		.equals(); 사용
		
		//6.사용자에게 두 정수를 입력 받아서 더 큰수를 출력하는 프로그램, 같다면 "같다"라고 출력하기
		
	}
	


}

