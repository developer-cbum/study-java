package thread;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		// default가 단일
		
//		Thread1 thread1 = new Thread1("★");
//		Thread1 thread2 = new Thread1("♥");
		
		// 스케쥴링 단일을 멀티 로 바뀌어주는 작업
		// start메소드 안에 run이 있다
		// start를 써야 default가 멀티로 바뀜.
//		thread1.start();
//		thread2.start();
		
		// run을 바로 쓰면 안됌.
//		thread1.run();
//		thread2.run();
		
		
		// 쓰게된다면 Runnable를 쓰게된다 실무에서.
		//  Runnable 방법 자원 하나로 공유한다.
		// Thread는 따로 객체화 시켜야 한다.
//		Runnable mineral = new Thread2();
		//람다식
		Runnable mineral = () -> {
			for (int i = 0; i < 10; i++) {
				// 쓰레드는 이름이 있는데 그 이름을 가져와준다.
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(1000);} catch (InterruptedException e) {;}
			}
		};
		

		Thread t1 = new Thread(mineral, "?");
		Thread t2 = new Thread(mineral, "!");
		
//		쓰레드 이름 줄 수 있다.
//		t1.setName(null);
		
		t1.start();
		
		
		
		// join을 사용한 쓰레드가 끝나고 나서 나머지 쓰레드가 실행된다.
		// 단, 이미 join()전에 start()된 쓰레드는 멈출 수 없다.
//		try {t1.join();} catch (InterruptedException e) {;}
		
		t2.start();
		
		try {t1.join();} catch (InterruptedException e) {;}
		
		
		// 쓰레드도 우선순위가 있다 하지만, 그때 그때 다르게 나올 수 도 있다.
	     System.out.println("메인쓰레드 종료");
		
	     
	     
		
	}

}
