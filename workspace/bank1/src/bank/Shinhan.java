package bank;

public class Shinhan extends Bank{
	
	@Override
	public void deposit(int money) {
		// ���� �Աݽ� 50�� ������ �׷��� �Է��� money�� ���������ڷ� 0.5�� ���Ѵ�.
		// �Ǽ� �ڵ�����ȯ
		money *= 0.5;
		// �θ� �޼ҵ� �����
		super.deposit(money);
	}

}