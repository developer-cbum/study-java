package bank;

import java.util.Random;
import java.util.Scanner;


public class ATM {
	public static void main(String[] args) {
		// 계좌 알려줄 때 사용 할 배열
		String[] bankNames = {"신한은행", "국민은행", "카카오뱅크"};
		// 3개 은행 100명이 최대인 베이스 선언
		Bank[][] arrBank = new Bank[3][100];
		// 은행별 고객수 담기
		int[] arCount = new int[3];
		// 유지보수 때문에 계좌번호 6자리에서 변경 될 때 수정하기 쉽게 선언부에서 선언해준다.
		final int ACCOUNT_LENGTH = 6;

		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
		String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		// money 사용할려고 선언
		int money = 0;
		
		// 인덱스 행 번호로 사용할 것이기 때문에 i로 선언
		// choice는 은행 고르고 다음 메뉴에서 사용.
		int i = 0, choice = 0;
		
		
		// 계좌 선언 연결로 사용할 것이라 초기값 "" // 비밀번호, 핸드폰 번호도 선언해놓는다.
		String account = "" , password = null, phoneNumber = null;
		// Bank user라는 변수명으로 초기값 넣어서 선언해놓는다.
		Bank user = null;
		
		
		while(true) {
			System.out.println(message);
			i = sc.nextInt();
			
			// 나가기 break;
			if(i == 4) {break;}
			
			// 인덱스 방은 0부터 시작하기 때문에 아래 소스코드에서 계속 -1 해주는 것 보다
			// 사용자가 입력한 1, 2, 3에 -1을 하여 그 은행 인덱스 방으로 하기 편하게 해준다.
			// 그래서 i 라는 변수명으로 하여 다른 개발자가 보기 편하게도 해준다.
			i--;
			
			while(true) {
				// 매반복마다 선언.
				// 은행 선택 규칙성을 위해 은행을 배열에 담는다.
				Bank[] banks = {new Shinhan(), new Kookmin(), new KaKao()};
				
				System.out.println(menu);
				choice = sc.nextInt();
				
				// 은행선택으로 돌아가기 break;
				if(choice == 6) {break;}
				
				switch(choice) {
				case 1: // 계좌개설
					
					// 고객수가 100명이 넘으면 계좌개설 안된다.
					if(arCount[i] == 100) {System.out.println("더 이상 계좌를 개설할 수 없는 은행입니다."); break;}
					
					// 선택한 은행 user에 담기
					user = banks[i];
					
					// 계좌를 생성할 때 마다 기본 값을 초기화 시켜줘야 한다.
					// 안그러면, 계속 기존 계좌에 누적연산되어 버린다.
					account = "";
					
					// 언제 중복이 안될지 모르닌깐 while 반복문 사용
					while(true) {
					// 이미 위에서 i 사용하여 j 로 사용
					// 계좌 개설 앞자리 0부터 만들어지는 경우
//					for (int j = 0; j < ACCOUNT_LENGTH; j++) {
//						account += random.nextInt(10);
//					}
					
					// 앞자리가 1부터 시작하는 계좌 생성 방법 뒤에 ""  붙여서 문자열로 형변환 해준다
					//account = random.nextInt(900000) + 100000 + "";
					// 이것도 가능
					account += random.nextInt(900000) + 100000;
					// 계좌에 각각 은행별로 앞에 숫자로 은행번호 붙여주기 
					account = i + 1 + account;
					
					
					// 계좌 중복 검사
					if(Bank.checkAccount(arrBank, arCount, account) == null) {
						break;
					}
					
					}
					
					// 고객이 어디 은행을 선택할지 몰라서 배열에 은행 3개를 담아서 규칙성을 부여해서
					// 선택이 가능하고 그 은행에 접근 할 수 있도록 한 것이다.
					user.setAccount(account);
					
					System.out.print("예금주: ");
					user.setName(sc.next());
					
					while(true) {
						System.out.print("비밀번호[4자리] : ");
						password = sc.next();
						
						if(password.length() == 4) {break;}
						
					}
					
					user.setPassword(password);
					while(true) {
					System.out.println("핸드폰 번호['-' 제외]");
					phoneNumber = sc.next();
					// replaceAll은 작업만 해주고 그 값은 phoneNumber에 담아줘야한다.
					phoneNumber = phoneNumber.replaceAll("-", "");
					// 폰번호 길이 11 과 중복확인 둘다 만족했으면 멈춰주고 유저에 저장.
					if(phoneNumber.length() == 11 && 
							(Bank.checkPhoneNumber(arrBank, arCount, phoneNumber) == null)) {break;}
					
					}
					
					user.setPhoneNumber(phoneNumber);
					
					// 위에서 i를 은행 인덱스 방번호로 선언했기 때문에
					// i에 유저 은행이 담기고 j에는 새로 만든 고객의 방번호에 정보가 담긴다.
					arrBank[i][arCount[i]] = user;
					// 신규고객이 생겼으니 그 은행 고객수를 늘려준다.
					arCount[i]++;
					
					// 계좌 번호 알려주기
					System.out.println(bankNames[i] + "이용해주셔서 감사합니다." );
					System.out.println("계좌번호는 " + account + "입니다");
					
					break;
				case 2: // 입금하기
					
					// 로그인을 위한 입력받기
					System.out.print("계좌번호 : ");
					account = sc.next();
					System.out.println("비밀번호 : ");
					password = sc.next();
					
					// 계좌개설 할 때 말고는 만들어논 user 사용
					user = Bank.login(arrBank, arCount, account, password);
				
					
					if(user != null) {
						// -48한 이유 charAt(0) = '0' 문자열이라 아스키코드 48을 뺴야 정수 0 으로 바뀐다.
						if(user.getAccount().charAt(0) - 48 == i + 1) {
							System.out.print("입금액 : ");
							money = sc.nextInt();
							if(money <= 0) {
								System.out.println("다시 입력해주세요.");
								break;
						}
							// 어차피 신한이면 다운캐스팅 필요 없이 재정의 된 메소드 사용된다.
							user.deposit(money);
						}else {
							System.out.println("개설한 은행에서만 사용 가능.");
						}
							
						}
						
//						
//						// 은행 선별 사용법
//						boolean flag = false;
//						
//						
//						// 고객의 은행이 무슨 은행인지, banks[i] = 지금 선택한 은행이 무슨 은행인지
//						if(banks[i] instanceof Shinhan) {
//							if(i == 0) {
//									flag = true;
//							}
//						}else if (user instanceof Kookmin) {
//									flag = true;
//							}else {
//							if(i == 2) {
//								flag = true;
//							}
//							}
//						if(flag) {
//									
//								System.out.print("입금액 : ");
//								money = sc.nextInt();
//								if(money <= 0) {
//									System.out.println("다시 입력해주세요.");
//									break;
//							}
//								// 어차피 신한이면 다운캐스팅 필요 없이 재정의 된 메소드 사용된다.
//								user.deposit(money);
//							}else {
//								System.out.println("개설한 은행에서만 사용 가능.");
//							}
						

					break;
				case 3: // 출금하기
					
					// 로그인을 위한 입력받기
					System.out.print("계좌번호 : ");
					account = sc.next();
					System.out.println("비밀번호 : ");
					password = sc.next();
					
					// 계좌개설 할 때 말고는 만들어논 user 사용
					user = Bank.login(arrBank, arCount, account, password);
					
					if(user != null) {
						System.out.print("출금액 : ");
						money = sc.nextInt();
						// 돈 검사 할때 삼항연산자 사용하여 국민이면 1.5배 보다 돈이 적은지를 확인하고 아니면
						// 입력한 만큼 돈이 부족한지 검사하는 것이다.
						// 연산자 우선 순위로 인해 관계 보다 삼항이 아래기 때문에 소괄호로 묶어준다.
						if(user.getMoney() < (user instanceof Kookmin ? money * 1.5 : money)) {
							System.out.println("잔액부족");
							break;
						}else if(money <= 0) {
							System.out.println("다시 입력해주세요.");
							break;
						}
						
						user.withdraw(money);
						
					}
							
					break;
				case 4: // 잔액조회
					
					// 로그인을 위한 입력받기
					System.out.print("계좌번호 : ");
					account = sc.next();
					System.out.println("비밀번호 : ");
					password = sc.next();
					
					user = Bank.login(arrBank, arCount, account, password);
					
					if(user != null) {
						// 카카오 뱅크면 재정의 된 값으로 해서 굳이 다운캐스팅 안해도 된다.
						System.out.println("현재 잔액: " + user.showBalance() + "원");

					}
					
					break;
				case 5: // 계좌번호 찾기
					System.out.print("핸드폰 번호 : ");
					phoneNumber = sc.next();
					
					user = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);
					
					if (user != null) {
						System.out.print("비밀번호 : ");
						password = sc.next();
						
						if(user.getPassword().equals(password)) {
							
							// 다시 초기화
							account = "";
							
							// 언제 중복이 안될지 모르닌깐 while 반복문 사용
							while(true) {
							// 이미 위에서 i 사용하여 j 로 사용
							// 계좌 개설 앞자리 0부터 만들어지는 경우
//							for (int j = 0; j < ACCOUNT_LENGTH; j++) {
//								account += random.nextInt(10);
//							}
							
							// 앞자리가 1부터 시작하는 계좌 생성 방법 뒤에 ""  붙여서 문자열로 형변환 해준다
							//account = random.nextInt(900000) + 100000 + "";
							// 이것도 가능
							account += random.nextInt(900000) + 100000;
							account = i + 1 + account;
							
							// 계좌 중복 검사
							if(Bank.checkAccount(arrBank, arCount, account) == null) {
								break;
							}
							
							}
							
							// 고객이 어디 은행을 선택할지 몰라서 배열에 은행 3개를 담아서 규칙성을 부여해서
							// 선택이 가능하고 그 은행에 접근 할 수 있도록 한 것이다.
							user.setAccount(account);
							System.out.println("다시는 잃어버리지 마세요.");
							System.out.println("너의 계좌번호 : " + account);
							
							
							
						}
						
					}
					
					break;
				
				}
				
			}
			
		}
		
		
	}
}
