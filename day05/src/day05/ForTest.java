package day05;

public class ForTest {
	public static void main(String[] args) {

		System.out.println("for문 위쪽 문장1");
		System.out.println("for문 위쪽 문장2");
		System.out.println();
		int i;
		for (i = 0; i < 5; i++) {
			System.out.println("for문 안쪽 문장" + i);
		}

		System.out.println(i);
		i = 100;
		
		System.out.println("for문 아래쪽 문장"+i);

		// i를 바깥에 선언하지않고,
		//	for의 조건식에만 선언하는 경우에는 해당 for문이 끝나고 쓸모없어지기 때문에,
		//	메모리에서 삭제됨

		//만약 for문 밖에서 사용하고 싶다면 for문 이전에 i를 선언해야함
		
	}
}
