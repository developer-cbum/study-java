package synchronizedTest;

public class CU {

	public static void main(String[] args) {
	
		ATM atm = new ATM();
		
		// 2���� �����尡 ���� �ڿ� ����
		// �ڿ��� �����ϸ� �ӵ��� �ʹ� ���� ������ �����.
		// ����ȭ : ��Ƽ�� ���Ϸ� �ٲپ��ִ� �۾�
		Thread mom = new Thread(atm, "����");
		Thread son = new Thread(atm, "�Ƶ�");
		
		
		mom.start();
		son.start();

	}

}