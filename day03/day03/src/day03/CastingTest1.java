package day03;

import java.util.Scanner;

public class CastingTest1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//사용자에게 소문자를 입력받아서
		//대문자로 변경하여 출력하는 프로그램
		
		
		char so = sc.next().charAt(0);
		
		System.out.println((char)(so -32));
		
		
		//사용자에게 대문자를 입력 받아서
		//소문자로 변경하는 프로그램
		
        char dae = sc.next().charAt(0);
		
		System.out.println((char)(dae + 32));
		
		
		//에스키 코드 참고
		
	}
	
	
	
	

}
