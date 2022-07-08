package day08;

import java.util.Arrays;
import java.util.Scanner;



public class ArrayTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//1.사용자에게 입력받을 정수의 개수를 입력받는다.
		
		//2. 사용자에게 해당 개수만큼 정수를 입력받는다.
		
		//3. 사용자가 입력한 정수중 최대값 출력하기
		
		//4.사용자가 입력한 정수중 최소값 출력하기
		
//		System.out.println("원하는 정수의 개수를 입력해주세요");
//		int number = sc.nextInt();
//		
//		int[] array = new int[number];
//		
//		
//		for(int i =0; i<array.length; i++) {
//			System.out.println((i+1)+"번째 번호 입력>>");
//			array[i] = sc.nextInt();
//		}
//		
//		int max = array[0];
//		
//		for(int i =0; i<array.length; i++) {
//			if(array[i] >max) {
//				max = array[i];
//				
//			}
//		}
//		System.out.println(max+"최대값");
//		
//		int min = array[0];
//		
//		for(int i =0; i<array.length; i++) {
//			if(array[i] <min) {
//				min = array[i];
//				System.out.println(min+"최소값");
//			}
//		}
//		System.out.println(min+"최소값");
				
		
		
		//-------------------------------------------
			
				char[] alpahbets = {'a','D','*','x'};
//				
//				//해당 배열에 소문자는 대문자로, 대문자는 소문자로
//				//그 외의 문자는 그대로 담아서
//				//배열의 모양대로 출력
//				
				char [] Trans = new char[alpahbets.length];
				
				for(int i =0; i<alpahbets.length; i++) {
					if(alpahbets[i]>=97 && alpahbets[i]<=122 ) {
						Trans[i] = (char)(alpahbets[i] -32);
					}else if(alpahbets[i]<91 && alpahbets[i]>64 ) {
						Trans[i] = (char)(alpahbets[i] +32);
					}else {
						Trans[i] = alpahbets[i];
					}
						
					}
				String ar = Arrays.toString(Trans);
				System.out.println(ar);
//		
				
				
				
				
				
				
				
				
				
				
				
		}
		
		
}

