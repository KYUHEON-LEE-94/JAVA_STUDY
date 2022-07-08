package day08;

import java.util.Scanner;

public class ArrayTask {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//사용자에게 국어점수, 영어 점수, 수학점수를 입력받아서
	//총점과 평균을 출력하시오
	//당신의 총점은 270점
	//평균은 90.0점입니다.
	
	int[] array = new int[3];
	// = int[] scores = {0,0,0};
	
//	System.out.println("점수를 입력해주세요");
//	array[0] = sc.nextInt();
//	System.out.println("점수를 입력해주세요");
//	array[1] = sc.nextInt();
//	System.out.println("점수를 입력해주세요");
//	array[2] = sc.nextInt();
	 
	String[] subject = {"국어","수학","영어"};
	
	for(int i = 0; i<array.length; i++) {
		System.out.println(subject[i]+"점수 입력 >>");
		array[i] = sc.nextInt();
	}
	
	int total = 0;
	int avg = 0;
	for(int i = 0; i<array.length; i++) {
		total += array[i];
		
	}
	System.out.println(total+"이 총점입니다.");
	System.out.println(total/3 +"이 평균입니다.");
	
	
}
}
