package bank;

public class KaKao extends Bank{
	
	@Override
	public int showBalance() {
		// money�� protected�� �Ͽ� �ڽ�Ŭ�������� ���� ����.
		this.money /= 2;
		return super.showBalance();
	}
		


}