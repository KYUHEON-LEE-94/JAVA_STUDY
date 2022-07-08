package day08;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		
//		int[] numbers = {1,2,3,4,5,6,7,8,9};
//		
//		for(int i =0; i<numbers.length; i++) {
//			System.out.print(numbers[i]);
//		}
//		
//		
//		System.out.println("\n------------");
//		
//		for(int number :numbers) {
//			number = 10;
//			System.out.println(number);
//		}//개별적으로 인덱스값에 접근하기가 힘들다.
		
		String[] names = new String[3];
		
		System.out.println(names[0]); //값이 비어있다면  null이다.
		System.out.println(names[1]);
		
		int[] numbers = new int[3];
		System.out.println(numbers[0]); //int타입에 아무것도 안들어갔다면 0 이 들어가있음
		
		
		
	}
}
