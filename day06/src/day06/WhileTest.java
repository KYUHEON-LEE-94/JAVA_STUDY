package day06;

import java.util.Iterator;

public class WhileTest {
	public static void main(String[] args) {
		System.out.println("문장1");
//		
//		int i = 1;
//		while(i < 3) {
//			System.out.println("while문 안쪽문장" + i);
//			i++;
//		}
		
		
//		-----do while문----
		
		
//		do {System.out.println("while 안쪽문장 "+i);
//			i++;
//			
//			
//		}while(i <3);
//		System.out.println("while바깥 문장");
//		System.out.println("i: " +i);
		
		
		for(int  i =0; i < 5; i++) {
			
			
			if(i == 3) {
				break;
			}
			System.out.println("for문 이후 문장"+i);
			
		}
		
	}
}
