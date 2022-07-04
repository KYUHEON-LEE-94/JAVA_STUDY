package day04;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.사용자에게 정수를 입력받아서 짝수라면 짝수입니다.
		//홀수라면 홀수입니다.
		//출력하기
		
		System.out.println("숫자를 입력해주세요");
		int num1 = sc.nextInt();
		
		if(num1 %2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
//		
		
		
		//2. 사용자에게 정수를 입력받아서,
		//3의 배수라면 3의 배수입니다.
		//4의 배수라면 4의 배수입니다.
		//3과 4의 배수를 동시에 만족시킨다면
		//3과 4의 배수입니다. 출력하기
		
		System.out.println("숫자를 입력해주세요");
		int num2 = sc.nextInt();
		
		if(num2%12 ==0) {
			System.out.println("3과 4의 배수입니다.");
		}
		else if(num2 %3 == 0) {
			System.out.println("3의 배수입니다..");
		}else if(num2 %4 == 0){
			System.out.println("4의 배수입니다.");
		}
		
//		선생님의 예시
		
		if(num2 %3 == 0) {
			if(num2%4 == 0) {
			System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3과4의 배수입니다.");
			}
		}else if(num2 %4 == 0){
			System.out.println("4의 배수입니다.");
		}
		
//		3.사용자에게 정수를 입력받아서
		/*학점을 출력하시오
		90이상 A
		80 이상 90 미만: B
		70 이상 80미만 C
		70미만 F
		출력 예시: 당신의 학점은 B입니다.*/
		
		System.out.println("학점을 입력해주세요");
		int score = sc.nextInt();
		
		if(score >=90) {
			System.out.println("A입니다.");
		}
		else if(score>=80 && score<90) {
			System.out.println("B입니다.");
		}else if(score>=70 && score<80){
			System.out.println("C입니다.");
		}else{
			System.out.println("F입니다.");
		}
		
	}
}
