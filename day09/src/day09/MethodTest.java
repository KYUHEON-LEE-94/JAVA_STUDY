package day09;

import java.util.Scanner;

public class MethodTest {
	
	//이 메서드는 메모리에 저장만 시켜놓을뿐, 후에 main메서드에서 호출될때만 실행이됨.
	public static int add(int a, int b) {
		int num = a +b;
		System.out.println(num);
		//print는 사용자에게  알려주는거 //메소드에게 알려주지 않았음 -> return을 사용
		
		return num;
	}
	
	
	
	
	
	public static void main(String[] args) {	
//		int num = MethodTest.add(2,3);
//		System.out.println(num+3);
		
		
		MethodTest.printName(3,"안녕");
		
		Car Mycar = new Car(); //생성자
		Scanner sc = new Scanner(System.in);
		
		
		
		
	}
	
	
	
	
	public static void printName(int a, String name){
		
		for(int i = 0; i<a; i++){
			System.err.println(name);
		}
		
		
		
	}
}




class Car{
	
	public Car(){
		//생성자임
	}
	
	int price;
	String name;
	String color;
	
	public void engineOn() {
		
		
	}
	
	public void go() {
		
		
	}
	
	
}
