package day06;

import java.util.Scanner;

public class Fibonacii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//반복문을 사용하여 피보나치 수열 구현
		//사용자에게  정수를 입력받아서 해당 항까지의 피보나치 수열 출력하기
		
		//0 1 1 2 3 5 8 13 21...
		// >>6
		//0 1 1 2 3 5
		
//		int input = sc.nextInt();
//		int f1,f2, f3;
//		f1 = 0;
//		f2 = 1;
//		
//		if(input ==1) {
//			System.out.println("1");
//		}
//		
//		if(input>=2) {
//			System.out.println("0, 1");
//		}
//		
//		
//		for(int i =0; i<=input; i++) {
//			f3 = f1 + f2;
//			System.out.println(" " + f3);
//			f1 = f2;
//			f2 = f3;
//		}
		
		int input = sc.nextInt();
		
		int f1,f2;
		f1 = 1;
		f2 = 0;
		
		if(input == 1) {
			System.out.println("1");
		}
		
		if(2 >= input ) {
			System.out.println("0, 1");
		}
		
		
		
		

		int j =  0;
		
		  if(input>=3) {
			  System.out.println("0, 1");
			  
			  for(int i =1; i<= input; i++) {
					while(j <= i/4) {
					f2 = f1 + f2;                               
					System.out.println(" " + f2);
					f1 = f2 +f1;                         
					System.out.println(" " +f1);
					j++;
					}	
					
					
					
				}
		  }                     
			
			
//			f2 = f1 + f2;                               
//			System.out.println(" " + f2);
//			f1 = f2 +f1;                         
//			System.out.println(" " +f1);
//			
//			
//			f2 = f1+f2;    
//			System.out.println(" " +f2);
//			f1 = f2 +f1;                         
//			System.out.println(" " +f1);
		
		
	
		
	}
}
