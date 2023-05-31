package thread;

public class Thread2 implements Runnable{
	
	
	
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			// 쓰레드는 이름이 있는데 그 이름을 가져와준다.
			System.out.println(Thread.currentThread().getName());
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
			
		}
	}

}
