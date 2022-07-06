package day06;

import java.util.Scanner;

public class WhileTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//반복을 통해서 반복 할때마다 입력받음
		//사용자에게 정수를 입력받아서
		//입력한 숫자가 2라면 반복 종료시키기
		
		
//		while(true) {
//			System.out.println("숫자 입력");
//			int number = sc.nextInt();
//			if( number == 2) {
//				break;
//			}
//		}
		
//		-----------------------
//		int num = 0;
//		while(num  != 2) {
//			System.out.println("숫자 입력");
//			num  = sc.nextInt();
//			if( num  == 2) {
//				break;
//			}
//		}
//		----------------------------
		
		int num;
		do {
			System.out.println("입력>>");
			num = sc.nextInt();
		}while(num !=2);
			System.out.println("반복 종료");
		
	}
}
