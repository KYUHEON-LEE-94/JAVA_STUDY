package day03;

import java.util.*;

public class OperatorTest6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(true? "값1":"값2");
		
		System.out.println("나이입력:");
		int age = sc.nextInt();
		
		System.out.println(age > 20? "성인입니다":"미성년자입니다.");
	}

}
