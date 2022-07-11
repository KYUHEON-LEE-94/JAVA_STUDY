package day09;

import java.util.Scanner;

public class MethodTask {
	

	
	public static int add(int a, int b) {
		
		return a+b;
	}
	//메서드는 같은 이름으로 몇개를 만들어도 에러가 발생하지 않음, 
	//그렇기 떄문에 아래와 같이 여러개의 매개변수를 받는 다양한 메서드를 만들어놓을 수 있음
	
	public static int add(int a, int b, int c) {
		
		return a+b+c;
	}

	public static int add(int a, int b, int c, int d) {
	
	return a+b+c+d;
	}
	
	
	public static String add(int a, String b) {
		
		return a+b;
		}
//	-----------------------------------------------------//
	


	
	
	
	public static void what(int age) {
		if(age> 19) {
			System.out.println("성인입니다.");
		}System.out.println("미성년자입니다.");
		
		
	}
	
	
public static void array(int[] ar) {
		
		int[] array = {1,2,3,4,5};
		
		System.out.print("{");
		
		for(int i=0; i<array.length; i++) {
			System.out.print(" "+array[i]+",");
			if(i == array.length-1) {
				System.out.print(" "+array[i]+" ");
				
			}else {
				System.out.print(" "+array[i]+",");
			}
			
	}System.out.println("}");
}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1.사용자에게 정수를 입력받아서
		//두 정수를 합한다음 반환 시켜주는 메소드 만들기
		
		System.out.println("정수1을 입력해주세요");
		int num1 = sc.nextInt();
		System.out.println("정수2을 입력해주세요");
		int num2 = sc.nextInt();
		

		System.out.println(MethodTask.add(num1, num2));
		
		
		//2.사용자에게 나이를 입력받아 미성년자인지 판별하는 메소드  만들기
		
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		MethodTask.what(age);
		
		//3.배열을 배열 모양대로 출력해주는 메소드 만들기
		//{1,2,3,4,5}
		
		int[] array = {1,3,4,5,};
		
		MethodTask.array(array);
		
	}

}
