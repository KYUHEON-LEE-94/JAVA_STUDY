package day07;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Random r = new Random();
		
		String myAccount ="";
		String pw = "";
		int wallet = 0;
		
		
		
		
//		int account1 = r.nextInt(10, 100);
//		int account2 = r.nextInt(1000, 10000);
//		int account3 = r.nextInt(1000, 10000);
//		System.out.printf("%02d-%04d-%04d",account1, account2, account3);
//		myAccount = account1 +"" + account1 + "" + account3;
		//-------<선언부>--------
		
		System.out.println("★☆★☆★☆ATM기기 시작★☆★☆★☆★☆");
		while(true) {
			System.out.println("--main  menu--");
			System.out.println("1.계좌개설하기");
			System.out.println("2.입금하기");
			System.out.println("3.출금하기");
			System.out.println("4.나가기");
			
			System.out.println("입력>>");
			int choice = Integer.parseInt(sc.nextLine());    //nextInt 사용하면 버퍼 계산때문에 힘들수도 있으니까 Line을 사용하고 형변환함
			
			if(choice ==1) {
				//계좌 개설
				
				//비밀번호를 설정(횟수 제한이 3번)
				for(int i = 0; i<3; i++) {
					System.out.println("설정할 비밀번호 입력>>");
					pw =sc.nextLine();
					System.out.println("비밀번호 확인>>");
					String ch_pw = sc.nextLine();
					
					if(pw.equals(ch_pw)){
						//비밀번호와 확인한 번호가 같은지
						//계좌를 개설해주고
						//반복을 종료
						myAccount = String.format("%02d-%04d-%04d", r.nextInt(100), r.nextInt(10000), r.nextInt(10000));
						
						System.out.println("발급 계좌: " +myAccount);
						System.out.println("비밀번호 설정이 완료되었습니다.");
						break;
						
					}
					
				if(i == 2) {
					//횟수제한을 초과했을떄
					System.out.println("횟수 제한을 초과하셨습니다.");
					break;
					
				}//횟수제한 초과 if문
				System.out.println("비밀번호가 일지하지 않습니다." + "남은 기회" + (3-i)+"회");
				
				
				}//바밀번호제한 for문
				
							
				
				
			}else if(choice ==2) {
				//입금
				if(myAccount.equals(""))//계좌발급이 안됬다는건 myAccount값에 아무것도 입력이 안됬다는 뜻이니까. 
					{
					continue;
				}
				
				System.out.println("입금할 계좌 입력>>");
				String inputAccount = sc.nextLine();
				
				if(inputAccount.equals(inputAccount)) {
					//비밀 번호를 입력 받아야한다.
					for(int i = 0; i<3; i++) {
						System.out.println("비밀번호 입력>>");
						String inputpw = sc.nextLine();
						
						if(pw.equals(inputpw)) {
							//설정한 비밀번호와 입력한 비밀번호가 일치한지
							//입금
							
							System.out.println("입금 금액 입력>>");
							int money = Integer.parseInt(sc.nextLine());
							wallet += money;
							System.out.println(money+"원이 정상 입금되었습니다.");
							System.out.println("현재 통장 잔액" +wallet);
							
							break;
						}
						if(i == 2) {
							//횟수제한을 초과했을떄
							System.out.println("비밀번호 오류 횟수 초과, 메인 메뉴로  이동합니다.");
							break;
							
						}//횟수제한 초과 if문
						System.out.println("비밀번호가 일지하지 않습니다." + "남은 기회" + (3-i)+"회");
						
					}
					
					
					
					
				}else {
					System.out.println("해당 계좌가 없습니다.");
					continue;
				}
				
				
			}else if(choice ==3) {
				//출금 메뉴
				
				if(myAccount.equals(""))
				{
				continue;
			}
			
			System.out.println("출금할 계좌 입력>>");
			String inputAccount = sc.nextLine();
			
			if(inputAccount.equals(inputAccount)) {
				//비밀 번호를 입력 받아야한다.
				for(int i = 0; i<3; i++) {
					System.out.println("비밀번호 입력>>");
					String inputpw = sc.nextLine();
					
					if(pw.equals(inputpw)) {
						//설정한 비밀번호와 입력한 비밀번호가 일치한지
						//입금
						
						System.out.println("출금 금액 입력>>");
						int money = Integer.parseInt(sc.nextLine());
						
						if(money > wallet) {
							System.out.println("잔액이 부족합니다.");
							break;
						}
											
						wallet -= money;
						System.out.println(money+"원이 정상 출금되었습니다.");
						System.out.println("현재 통장 잔액" +wallet);
						
						break;
					}
					if(i == 2) {
						//횟수제한을 초과했을떄
						System.out.println("비밀번호 오류 횟수 초과, 메인 메뉴로  이동합니다.");
						break;
						
					}//횟수제한 초과 if문
					System.out.println("비밀번호가 일지하지 않습니다." + "남은 기회" + (3-i)+"회");
					
				}
			}
				
				
			}else if(choice ==4) {
				//나가기
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				//1~4를 입력하지 않은 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			
			
			
		}//while문
		
	}//main 메소드
}//atm클래스
