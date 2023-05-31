package bank;

public class Kookmin extends Bank {
	
	@Override
	public void withdraw(int money) {
		// 수수료 포함 가격 계산
		// 잔액부족 관련은 화면에서 구현.
		money *=1.5;
		super.withdraw(money);
	}

}
