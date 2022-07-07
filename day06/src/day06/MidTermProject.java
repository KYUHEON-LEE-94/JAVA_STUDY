package day06;

import java.util.Random;
import java.util.Scanner;

public class MidTermProject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("--계좌 발급--");
	boolean confirm = true;	
	
	int account , password;
	
	do {
		System.out.println("계좌 번호를 발급합니다.");
		account = r.nextInt(100000000, 1000000001);
		System.out.println(account);
		
		System.out.println("비밀번호를 입력해주세요");
		password = sc.nextInt();
		
		System.out.println("비밀번호를 재확인해주세요");
		int check = sc.nextInt();
		
		int j =0;
		
		if(password == check) {
			System.out.println("비밀번호 설정 성공");
			confirm = false;	
		}else if(password != check) {
			for( j = 0; j<=2; j++) {
				System.out.println("틀렸습니다. 다시 입력해주세요");
				check = sc.nextInt();
				
			  if(password == check) {
					System.out.println("비밀번호 설정 성공");
					confirm = false;	
					break;
				}
			}System.out.println("비밀 번호 확인후에 다시 절차 진행해주세요");
		}			    
	}while(confirm);
	
	//2.입금하기
			System.out.println("--입금 절차--");
			
			int wallet ;
			wallet = 0;
			
			System.out.println("계좌번호를 입력해주세요");
			int account_2 = sc.nextInt();
			System.out.println("비밀 번호를 입력해주세요");
			int check_2  = sc.nextInt();
			
			if(password != check_2 || account_2 != account ) {
					for(int i = 1; i<=3; i++) {
						System.out.println("틀렸습니다. 다시 입력해주세요");
						System.out.println("계좌번호");
						account_2 = sc.nextInt();
						System.out.println("비밀번호");
						check_2  = sc.nextInt();
					}	
			}else if (password == check_2 && account_2 == account) {
				System.out.println("원하시는 입금 금액을 넣어주세요");
				int money = sc.nextInt();
				System.out.println(money+"원 입금 성공");
				
				wallet += money;
			}
			
			//3.출금하기
			System.out.println("--출금 절차--");
			System.out.println("계좌번호를 입력해주세요");
			int account_3 = sc.nextInt();
			System.out.println("비밀 번호를 입력해주세요");
			int check_3  = sc.nextInt();
			
			if(password != check_3 || account_3 != account ) {

					for(int i = 1; i<=3; i++) {
						System.out.println("틀렸습니다. 다시 입력해주세요");
						System.out.println("계좌번호");
						account_3 = sc.nextInt();
						System.out.println("비밀번호");
						check_3  = sc.nextInt();
					}	
			}else if (password == check_2 && account_3 == account) {
				System.out.println("원하시는 출금 금액을 넣어주세요");
				int money = sc.nextInt();
				System.out.println(money+"원 출금성공 성공");
				wallet -= money;
			}
		
		
	}
	
}
