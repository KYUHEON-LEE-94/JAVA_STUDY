package day04;

import java.util.Scanner;

public class SwitchTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		사용자에게 월을  입력받아서
//		해당 월의 마지막 일을 출력하시오
//		2월은 28일이 마지막 입니다.
//		6월은 30일이 마지막입니다.
		
	System.out.println("월을 입력해주세요");
	int month = sc.nextInt();
		
		switch(month) {
		case 2:
			System.out.println("28일이 마지막 입니다.");
			break;
		case 6:
			System.out.println("30일이 마지막입니다");
			break;		
		case 1:
		case 3:
		case 4:
		case 5:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("31일이 마지막입니다.");
			break;	
		default:
			System.out.println("없는값입니다.");
		}
		
	}
	
}
