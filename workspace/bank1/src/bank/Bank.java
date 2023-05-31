package bank;

public class Bank {
	
	private String name;
	private String account;
	private String phoneNumber;
	private String password;
	// 자식에게서는 접근할 수 있게 허락
	// 메소드 재정의 할 때도 편함
	protected int money;

	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAccount() {
		return account;
	}




	public void setAccount(String account) {
		this.account = account;
	}




	public String getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public int getMoney() {
		return money;
	}




	public void setMoney(int money) {
		this.money = money;
	}




	public Bank() {;}
	
	


//	*static
//	계좌번호 중복검사
	
	// 메소드는 저장공간이다. final을 붙혀서 재정의를 못하도록 붙어준다. 
	// 계좌번호 중복검사 메소드 선언
	// 타입을 Bank 모든 은행에 부모 클래스로 받는다
	public final static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
		// Bank 초기화 해준다.
		Bank bank = null;
		// arrBank 행까지는 반복문으로 출력해야 어떤 은행인지 알 수 있음. 3행
		for (int i = 0; i < arrBank.length; i++) {
			// j를 밖에 선언하여 j for문 밖에서도 사용 가능하게 한다.
			int j = 0;
			// 그다음 2차원 열은 그 은행에 고객수를 담아놓은 arCount[i] 값 만큼 이중 for문 작성
			for (j = 0; j < arCount[i]; j++) {
				// arrBank[i][j] =  i = 은행, j = 고객에 담긴 계좌가 메소드 매개변수인 account랑 같으면
				if(arrBank[i][j].getAccount().equals(account)) {
					// 은행에 그 값을 담아라
					bank = arrBank[i][j];
					// j for문 break;
					break;
				}
				
			}
			// j 가 != arCount[i] 의 뜻은 안 j for문이 arCount[i]와 j가 같아지기전에 반복문이 종료된 것이니
			// 밖에 i 반복문도 break 해야 하기 때문에 조건식에 break 코드 사용.
			if(j != arCount[i]) {
				break;
			}
		}
		return bank;
		
	}

//	핸드폰번호 중복검사
	
	// 메소드는 저장공간이다. final을 붙혀서 재정의를 못하도록 붙어준다. 
	// 타입을 Bank 모든 은행에 부모 클래스로 받는다
	public final static Bank checkPhoneNumber(Bank[][] arrBank, int[] arCount, String phoneNumber) {
		// Bank 초기화 해준다.
		// 존재하지 않으면 null 로 리턴
		Bank bank = null;
		// arrBank 행까지는 반복문으로 출력해야 어떤 은행인지 알 수 있음. 3행
		for (int i = 0; i < arrBank.length; i++) {
			// j를 밖에 선언하여 j for문 밖에서도 사용 가능하게 한다.
			int j = 0;
			// 그다음 2차원 열은 그 은행에 고객수를 담아놓은 arCount[i] 값 만큼 이중 for문 작성
			for (j = 0; j < arCount[i]; j++) {
				// arrBank[i][j] =  i = 은행, j = 고객에 담긴 핸드폰 번호가 메소드 매개변수인 phoneNumber랑 같으면
				if(arrBank[i][j].getPhoneNumber().equals(phoneNumber)) {
					// 은행에 그 값을 담아라
					bank = arrBank[i][j];
					// j for문 break;
					break;
				}
				
			}
			// j 가 != arCount[i] 의 뜻은 안 j for문이 arCount[i]와 j가 같아지기전에 반복문이 종료된 것이니
			// 밖에 i 반복문도 break 해야 하기 때문에 조건식에 break 코드 사용.
			if(j != arCount[i]) {
				break;
			}
		}
		return bank;
		
	}

	
//	로그인 메소드 선언
	
	// 만약 위에 핸드폰, 계좌 중복검사 리턴 타입을 boolean으로 하였으면 소스코드를 또 새로 써야한다.
	// 하지만, Bank로 받아서 위에 중복검사 메소드를 사용할 수 있다.
	public static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
		Bank user = Bank.checkAccount(arrBank, arCount, account);
		// 계좌가 있다면, user 계좌 값이 null이 아니라면.
		if(user != null) {
			// 또 패스워드가 똑같다면
			if(user.password.equals(password)) {
				// user를 리턴
				return user;
			}
		}
		// 계좌가 없다면 null 리턴
		return null;
	}
	
	
	
	
//	*일반
//	입금
	// 매개변수 입금할 돈을 받을 수 있게 int money 사용
	// 필드 머니에 누적연산자로 입력한 money 만큼 더해준다.
	public void deposit(int money) {
		this.money += money;
	}

//	출금
	public void withdraw(int money) {
		this.money -= money;
	}


//	잔액조회
	
	// 유지보수 때문에 만들어 놈
	// 리턴타입 int 하고 필드에 money를 리턴해준다.
	public int showBalance() {
		return money;
	}
	

}
