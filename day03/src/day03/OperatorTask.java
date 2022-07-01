package day03;

import java.util.Scanner;

public class OperatorTask {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		
		//1.사용자에게 두 자릿수 정수를 입력 받고
		//십의 자리와 일의 자리를 출력하는 프로그램 만들기
		
		//입력
		//정수 입력: 95
		//출력 십의자리:9
		//일의 자리 5
		
//		System.out.print("두자리 숫자를 입력해주세요");
//		int number = sc.nextInt();
//		
//		System.out.println("십의 자리:" + number/10);
//		System.out.print("일의 자리:" + number%10);
		
		
		//2.코인 노래발 프로그램, 노래 한곡당 300원
		// 사용자에게 금액을 입력받고, 부를 수 있는 노래 곡수와 잔돈 출력하기
		//금액 입력: 1000
		// 3곡을 부를수 있으며, 잔돈 100원이 반환되었습니다.
		
//		System.out.print("금액 입력");
//		int money = sc.nextInt();
//		
//		
//		System.out.println("부를 수 있느 곡수:"+money/300+ "\t잔액:"+money%300 );
		
		
		
		//3. 사용자에게 국어, 영어, 수학 점수를 입력 받아서 평균을 구하여라
		// 입력
		//국어 점수
		//수학 점수
		//영어 점수
		//당신의 평균은 90.xx 입니다.
		
		System.out.print("국어 점수를 입력해주세요");
		double language = sc.nextDouble();
		
		System.out.print("수학 점수를 입력해주세요");
		double math = sc.nextDouble();
		
		System.out.print("영어 점수를 입력해주세요");
		double Eng = sc.nextDouble();
		
		double average = (language + math + Eng) / 3.0;
		System.out.printf("당신의 평균은 %s 입니다" , average);
	}
}
