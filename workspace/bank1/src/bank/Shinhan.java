package bank;

public class Shinhan extends Bank{
	
	@Override
	public void deposit(int money) {
		// 신한 입금시 50퍼 수수료 그래서 입력한 money를 누적연산자로 0.5를 곱한다.
		// 실수 자동형변환
		money *= 0.5;
		// 부모 메소드 사용함
		super.deposit(money);
	}

}
