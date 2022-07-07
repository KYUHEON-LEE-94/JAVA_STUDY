package day06;

import java.util.Random;
import java.util.Scanner;

public class UpdownGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		
		//컴퓨터가 랜덤한 정수를 받아온 뒤, 사용자가 이 숫자를 맞추는 게임
		//랜덤한 숫자보다 사용자가 입력한 숫자가 크다면 down 출력
		//랜덤한 숫자보다 사용자가 입력한 숫자가 작다면 up 출력
		//숫자가 같다면
		//축하합니다 정답을 00회만에 맞추셨습니다.
		//프로그램 만들기
		
		int i, input;
		i = 0;
		int ran = r.nextInt(101);
		boolean check = true;
		
			while(check) {	
				System.out.println("숫자 입력 1~100사이");
				input = sc.nextInt();
				
				if(input> ran) {		
				System.out.println("down");
				
			}else if(ran > input) {		
				System.out.println("up");
				
			}else if(ran == input) {
				check = false;
				System.out.println(i+"회만에 맞추셨습니다.");
			}
				
				i++;
		}
//		-----------문제점: 계속 루프가 되지 않고, i값이 누적되지 않음--------------
		
		
	
}
}