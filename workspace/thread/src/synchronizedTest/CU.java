package synchronizedTest;

public class CU {

	public static void main(String[] args) {
	
		ATM atm = new ATM();
		
		// 2개의 쓰레드가 동일 자원 접근
		// 자원을 공유하면 속도가 너무 빨라서 문제가 생긴다.
		// 동기화 : 멀티를 단일로 바꾸어주는 작업
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		
		
		mom.start();
		son.start();

	}

}
