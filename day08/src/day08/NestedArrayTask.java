package day08;

import java.util.Arrays;
import java.util.Scanner;





public class NestedArrayTask {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
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
		
		int[][] student = new int [4][3];
		
		String[] subject = {"국어","영어","수학"};
		
		
		for(int  i = 0; i<student.length; i++) {
			
			for(int  j = 0; j<student[i].length; j++) {
				System.out.println("학생"+(i+1)+"의 "+subject[j]+" 성적");
				student[i][j] = sc.nextInt();
			}
			
		}
		
		
		System.out.println("몇번 학생의 평균을 보시겠습니가? >>");
		
		int choice = sc.nextInt();
		
		
		int total = 0;
		
		
 
			for(int i = 0; i<3; i++) {
				
				if(true) {  //2번째 배열에서 i=2
					
				total += student[choice-1][i];
				
				}
			}
	
		
		System.out.println(total/3);
		
		
//	choice1을 선택한다 -> student 배열중 0번째 배열을 불러온다 ->
		
		
		

		
	}
}
