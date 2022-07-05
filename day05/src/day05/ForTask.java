package day05;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ForTask {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		//1부터 100까지의 숫자를 짝수만 가로로 출력하기
		
		for(int i = 1; i<=50; i++) {
			System.out.println(i*2);
		}
		
//		----------or---------------
//		for(int i = 2; i<=101; i+=2) {
//			System.out.println(i+"");
//		}
//		
//		--------------------------
		
		//10 9 8 7 6 5 4 3 2 1 출력하기
		
		for(int i = 10; 0<i; i--) {
			System.out.println(i);
		}
		
		//사용자에게 숫자를 입력받아서
		//1부터 해당 숫자까지의 총합 구하기
		
		int number = sc.nextInt();
		
		int sum=0;
		for(int i =1; i<=number; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
}
