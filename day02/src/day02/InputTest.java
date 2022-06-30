package day02;

import java.util.Scanner;
//Scanner는 데이터를 입력받는 기능을 제공하는 클래스
public class InputTest {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("사용자 님의 이름을 주세요");
		String name  = sc.next();
		
		System.out.print("나이 입력");
		int age = sc.nextInt();
		
		System.out.printf("%s님 환영합니다\n", name);
		System.out.printf("%s님의 등급은 vip입니다\n", name);
		System.out.printf("%s님의 나이는 %d입니다\n", name, age);
	}
}
