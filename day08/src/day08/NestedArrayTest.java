package day08;

public class NestedArrayTest {
		public static void main(String[] args) {
			int[][] numbers = {{1,2},{10,20},{100,200,300,400}};
			
			int[][] arr = new  int[3][2];
			
		
			for(int i = 0; i<numbers.length; i++) {
				
				for(int j = 0; j<numbers[i].length; j++) {
					System.out.println(numbers[i][j]);
				}
			}

}
}