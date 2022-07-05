package day05;

public class NestedForTest {
	public static void main(String[] args) {
		
		for(int i =0; i<4; i++) {
			System.out.println("바깥쪽 for문"+i +";");
			for(int j =0; j<4; j++) {
				System.out.println("안쪽 for문"+i+ ";" +j);
			}
			System.out.println("------");
		}
	}
}
