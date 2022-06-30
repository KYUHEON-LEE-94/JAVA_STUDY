package day02;

import java.util.Scanner;

public class InputTest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용자 님의 이름을 주세요");
		String name  = sc.next();
		
		System.out.print("나이 입력");
		int age = sc.nextInt();
		
//		name: 이름 [enter] , age: 20 [enter]. // nextLine은 한줄 전부를 입력받기 때문에 이름 enter까지도 다 받아옴
//	   20 후의 enter값이 버퍼에 남아서 ment의 nextLine에서 버퍼가 실행되어버리기 때문에 종료됨
		sc.nextLine();
		//그래서 위의 코드를 작성하여 enter 버퍼를 없앰
		String ment = sc.nextLine();
		System.out.println(ment);
		

	}

}
