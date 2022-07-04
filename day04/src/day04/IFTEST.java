package day04;

import java.util.Scanner;

public class IFTEST {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장1");
		System.out.println("문장2");
		
		int score = sc.nextInt();
		
//		if(score >= 90) {
//			System.out.println("A");
//			System.out.println("if문 안쪽문장 1");
//			System.out.println("if문 안쪽문장 2");
//			System.out.println("if문 안쪽문장 3");
//		}else if(score<90 && score >= 80) {
//			System.out.println("B");
//			System.out.println("else문 안쪽1");
//			System.out.println("else문 안쪽2");
//			System.out.println("else문 안쪽3");
//		}else {
//			System.out.println("버러지");
//		}
//		
//		System.out.println("문장 3");
//		System.out.println("문장 4");
//	}
	
		if(score >= 100) {
			System.out.println("A");
		
		}else if(score<90 && score >= 80) {
			System.out.println("B");
			System.out.println("else문 안쪽1");
			System.out.println("else문 안쪽2");
			System.out.println("else문 안쪽3");
		}else {
			System.out.println("버러지");
		}
		
		System.out.println("문장 3");
		System.out.println("문장 4");
	}
	
	
}
