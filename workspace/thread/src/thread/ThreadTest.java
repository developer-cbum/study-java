package thread;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		// default�� ����
		
//		Thread1 thread1 = new Thread1("��");
//		Thread1 thread2 = new Thread1("��");
		
		// �����층 ������ ��Ƽ �� �ٲ���ִ� �۾�
		// start�޼ҵ� �ȿ� run�� �ִ�
		// start�� ��� default�� ��Ƽ�� �ٲ�.
//		thread1.start();
//		thread2.start();
		
		// run�� �ٷ� ���� �ȉ�.
//		thread1.run();
//		thread2.run();
		
		
		// ���Եȴٸ� Runnable�� ���Եȴ� �ǹ�����.
		//  Runnable ��� �ڿ� �ϳ��� �����Ѵ�.
		// Thread�� ���� ��üȭ ���Ѿ� �Ѵ�.
//		Runnable mineral = new Thread2();
		//���ٽ�
		Runnable mineral = () -> {
			for (int i = 0; i < 10; i++) {
				// ������� �̸��� �ִµ� �� �̸��� �������ش�.
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(1000);} catch (InterruptedException e) {;}
			}
		};
		

		Thread t1 = new Thread(mineral, "?");
		Thread t2 = new Thread(mineral, "!");
		
//		������ �̸� �� �� �ִ�.
//		t1.setName(null);
		
		t1.start();
		
		
		
		// join�� ����� �����尡 ������ ���� ������ �����尡 ����ȴ�.
		// ��, �̹� join()���� start()�� ������� ���� �� ����.
//		try {t1.join();} catch (InterruptedException e) {;}
		
		t2.start();
		
		try {t1.join();} catch (InterruptedException e) {;}
		
		
		// �����嵵 �켱������ �ִ� ������, �׶� �׶� �ٸ��� ���� �� �� �ִ�.
	     System.out.println("���ξ����� ����");
		
	     
	     
		
	}

}