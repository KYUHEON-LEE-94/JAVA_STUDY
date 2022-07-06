package day06;

public class ForTask {
	public static void main(String[] args) {
		//구구단 1단 부터 9단까지 출력하기
		// 4 X 1 = 4
		
		for(int i =1; i <10; i++) {
			System.out.println("------"+i+"단-----");
			for(int j =1; j<10; j++) {
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
	
	}
}
