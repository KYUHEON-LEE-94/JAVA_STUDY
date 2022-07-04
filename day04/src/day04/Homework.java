package day04;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1. 사용자에게 문자를 입력받아서
//			소문자라면 대문자로 변경해서 출력하고
//			대문자라면  소문자로 변경해서 출력
//			알파벳이 아니라면 그대로 출력
		
		System.out.println("한자리 문자를 입력해주세요");
		char word = sc.next().charAt(0);
		
		if(word>=97 && word<=122) {
			
		System.out.println((char)(word -32));
		}else if (word <97 && word>=65){
			
			System.out.println((char)(word + 32));
		}else {
			
			System.out.println(word+"");
		}
		
		//사용자에게 대문자를 입력 받아서
		//소문자로 변경하는 프로그램
		
		
//		2.윤년 계산시
//			사용자에게 년도를 입력받아서
//			윤년인지 아닌지 출력하시오
//			4의 배수 ->> 윤년
//			4의 배수가 아니라면 평년
//			4의 배수이면서 100의 배수이면ㄴ ->> 평년
//			4의 배수이면서 100의 배수이면서 400의 배수면 -->윤년
		
		System.out.println("년도를 입력해주세요");
		int year = sc.nextInt();
		
		if (year%4 == 0 && year%100 == 0 && year%400 == 0) {
			System.out.println("윤년");
		}else if(year%4 == 0 && year%100 == 0) {
			System.out.println("평년");
		}else if(year%4 == 0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
		
		
//		3.사용자에게 시간(시간, 분)을 입력받아서
//		입력 받은시간에 추가로 분을  입력받아서
//		더한 시간을 출력
		
//		입력시간은 24시간 형식 13시
//		출력 시간은 12시간 형식:오후 1시
//		예시) 시간 입력: 10시
//			분 입력:50분
//			
//			추가 분 입력: 40
//			시간: 오전 11시 30분
		
		System.out.println("시 를 입력해주세요");
		int time = sc.nextInt();
		System.out.println("분을 입력해주세요");
		int muniute = sc.nextInt();
		System.out.println("더하기 윈하는 분을 입력");
		int plus = sc.nextInt();
		int totalM = muniute + plus;
		int aft = time - 12;
		
		if(totalM  >= 60 && time >= 12) {
			System.out.printf("오후 %d시 %d분입니다.",aft+1,totalM-60);
		}else if(time == 12) {
			System.out.printf("오후 %d시 %d분입니다.",time, totalM);
		}
		else if(time > 12){
			if(totalM < 60) {
				System.out.printf("오후 %d시 %d분입니다.",aft, totalM);
			}
		}else if(time <= 12) {
			if(totalM >= 60) {
				System.out.printf(" %d시 %d분입니다.",time+1,totalM);
			}
		}else if(time <= 12){
			if(totalM < 60) {
				System.out.printf("%d시 %d분입니다.",time, totalM);
				}
		}
	}
}

