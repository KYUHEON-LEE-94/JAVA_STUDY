package day09;

import java.util.Iterator;
import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//선생님의 리뷰//
		
		
		//학생 성적 입출력 프로그램
				//학생 4명, 과목 3개
				//국어, 영어, 수학
				
				/*{
				 *  {100,100,100}, -학생 1의 정보
				 * {100,100,100}, -학생 2의 정보
				 * {80,40,20}, -학생 3의 정보
				 * {100,100,100}, -학생 4의 정보
				 * 
				 * 
				 * 
				 * }
				 */
				
				//학생 성적입력하기(한번에 전부다 입력하기)
				//학생 성적 평균 보기(몇번 학생의 평균을 보시겠습니까?)
		
		
		System.out.println("학생 성적 입출력 프로그램");
		int[][] scores = new int[4][3];
		String[] subject = {"국어","영어","수학"};
		
		// 선언부 끝
		
		
		while(true) {
			System.out.println("1.학생 성적 보기");
			System.out.println("2.학생 평균 점수 보기");
			System.out.println("3. 종료하기");
			
			System.out.println("메뉴 선택>>");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				//1번메뉴
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i+1)+"학생 성적 입력");
					
					for (int j = 0; j < scores[i].length; j++) {
						System.out.println(subject[i]+"점수 입력>>");
						scores[i][j] = sc.nextInt();
					}
					
				}//1번메뉴 for문 끝
				
				
			}else if(choice == 2) {
				//2번메뉴
				System.out.println("몇번 학생 성적을 보시겠습니까?");
				int studentNum = sc.nextInt();
				
				int total = 0;
				for (int i = 0; i < scores[studentNum-1].length; i++) {
					total += scores[studentNum-1][i];
				}
				
				System.err.println(studentNum+"번쨰 학생의 평균점수는"+total/3.0+"입니다.");
				
			}else if(choice == 3) {
				//3번메뉴
				System.out.println("프로그램 종료");
				break;
				
			}else {
				//잘못 입력했을 경우
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		
	}
}
