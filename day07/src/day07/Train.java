package day07;

import java.util.Arrays;

public class Train {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6};
		              //0 1 2 3 4 5
		System.out.print("{ ");
//		for(int i =0; i< array.length; i++) {
//			if(i ==array.length-1) {
//				System.out.print(" "+array[i]+" ");
//			}else {
//				System.out.print(" "+array[i]+",");
//			}
//			
//		}System.out.print("} ");
		
		
		
		for(int i=0; i<array.length-1; i++) {
		System.out.print(" "+array[i]+", ");
	}
		System.out.print(" "+array[array.length-1]+" } ");
	//array.length는 배열의 끝값까지 전부 출력하겠다!
   //array.length-1은 배열의 끝에서 2번째 값을 출력하겠다
  // i < array.length-1은 배열의 끝에서 3번째 값을 출력하겠다가 됨	
		
		
	String ar = Arrays.toString(array);
	
	System.out.println(ar);
	}
}
            