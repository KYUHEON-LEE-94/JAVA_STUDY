package day05;

import java.util.Scanner;

public class Review_day04_homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1. 사용자에게 문자를 입력받아서
//		소문자라면 대문자로 변경해서 출력하고
//		대문자라면  소문자로 변경해서 출력
//		알파벳이 아니라면 그대로 출력
	
//	System.out.println("한자리 문자를 입력해주세요");
//	char word = sc.next().charAt(0);
//	
//	if(word>=97 && word<=122) {
//	System.out.println((char)(word -32));
//	}else if (word <97 && word>=65){
//		
//		System.out.println((char)(word + 32));
//	}else {
//		
//		System.out.println(word+"");
//	}

//		-> 정답 일치 / 아스키 문자를 숫자고 적용(나)했지만, 선생님은 Char 타입 그대로 적용해서 한 점이 다름
		
	//사용자에게 대문자를 입력 받아서
	//소문자로 변경하는 프로그램
	
	
//	2.윤년 계산시
//		사용자에게 년도를 입력받아서
//		윤년인지 아닌지 출력하시오
//		4의 배수 ->> 윤년
//		4의 배수가 아니라면 평년
//		4의 배수이면서 100의 배수이면ㄴ ->> 평년
//		4의 배수이면서 100의 배수이면서 400의 배수면 -->윤년
	
//	System.out.println("년도를 입력해주세요");
//	int year = sc.nextInt();
//	
//	if (year%4 == 0 && year%100 == 0 && year%400 == 0) {
//		System.out.println("윤년");
//	}else if(year%4 == 0 && year%100 == 0) {
//		System.out.println("평년");
//	}else if(year%4 == 0) {
//		System.out.println("윤년");
//	}else {
//		System.out.println("평년");
//	}
//	
//	--> 실행은 되나, 조건식 검사 회수가 늘어나기 때문에, else if 사용보다는 아래의 답안과 같이 연산 회수를 줄이는 방법을 선택
	
//	---------------선생님 답------------------------
	
//	System.out.println("년도 입력>>");
//	int year = sc.nextInt();
//	
//	System.out.println("----윤년 판단---");
//	if(year%4 == 0) {
//		if(year%100 ==0) {
//			System.out.println("윤년");
//			if(year%400 == 0) {
//				System.out.println("평년");
//			}else {
//				System.out.println("윤년");
//			}
//		}
//		
//	}else {
//		System.out.println("평년");
//	}
	
		
//	---------------------------------------------

//	--------삼항 연산로 할경우------------------------
	
//	String res = year%4 == 0? year%100 == 0? year%400 == 0? "윤년":"평년":"윤년":"평년";
	
//	->가독성이 좋지 않음..
//	---------------------------------------------
	
	
	
//	3.사용자에게 시간(시간, 분)을 입력받아서
//	입력 받은시간에 추가로 분을  입력받아서
//	더한 시간을 출력
	
//	입력시간은 24시간 형식 13시
//	출력 시간은 12시간 형식:오후 1시
//	예시) 시간 입력: 10시
//		분 입력:50분
//		
//		추가 분 입력: 40
//		시간: 오전 11시 30분
	
//	System.out.println("시 를 입력해주세요");
//	int time = sc.nextInt();
//	System.out.println("분을 입력해주세요");
//	int muniute = sc.nextInt();
//	System.out.println("더하기 윈하는 분을 입력");
//	int plus = sc.nextInt();
//	
//	int totalM = muniute + plus;
//	int aft = time - 12;
//	
//	if(totalM  >= 60 && time >= 12) {
//		System.out.printf("오후 %d시 %d분입니다.",aft+1,totalM-60);
//	}else if(time == 12) {
//		System.out.printf("오후 %d시 %d분입니다.",time, totalM);
//	}
//	else if(time > 12){
//		if(totalM < 60) {
//			System.out.printf("오후 %d시 %d분입니다.",aft, totalM);
//		}
//	}else if(time <= 12) {
//		if(totalM >= 60) {
//			System.out.printf(" %d시 %d분입니다.",time+1,totalM-60);
//		}
//	}else if(time <= 12){
//		if(totalM < 60) {
//			System.out.printf("%d시 %d분입니다.",time, totalM);
//			}
//	}
	
	
//	---------------선생님 답------------------------
	int hour = sc.nextInt();
    int min = sc.nextInt();
    
    int admin = sc.nextInt();
    int sumMin = min + admin;
    
    if( sumMin >= 60) {
       hour = hour + (sumMin/60); // 시간에 추가 
       min = sumMin % 60; // 분에 
       
    }
    
    String day = "오전";
    if(hour > 12) {//오전 오후 구분하기
       hour = hour % 12;
       day = "오후";
    }
    
    
    System.out.println("시간 : "+ day+ hour +"시" + sumMin + "분");
    
//    ->조건식에 해당하지 않는 값은 그대로 if문을  통과하기 때문에 따로 정의할 필요가 없다는 것을 깨달음
//    ->if문 안에서 정의된 변수값을 다시  재정의 함으로써 변경된 변수값을 저장하여 활용할 수 있음
//    ->즉, 원하는 조건 값에 따른 변수값에 변화를 주는 것으로 간단하게 조건식을 만들어서 실행할 수 있다.
//	---------------------------------------------
	
	}
}
