package synchronizedTest;

public class ATM implements Runnable {
	
	private int money;
	
	public ATM() {
		this.money = 10000;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			withdraw();
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		}
		
	}
	
	
	// 자원 공유 문제 발생 시 동기화를 사용하여, 멀티 환경에서 특정 부분을 단일 환경으로 바꿔줘야 한다.
	public synchronized void withdraw() {
		// 동기화 shift + alt + z 6번
		//synchronized (this) { // 자원을 구현한 객체(자원의 주인) : mutex 
							  // 다른 곳에서 쓰면 객체화 시킨 객체명을 mutex에 써야한다.
			this.money -= 1000;
			// 출력도 동기화 안에 넣어주면 된다.
			System.out.println(Thread.currentThread().getName() + "이(가) 1000원 출금");
			System.out.println("현재 잔액: " + this.money + "원");
		}
	}
	
	
