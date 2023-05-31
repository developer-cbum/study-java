package bank;

public class KaKao extends Bank{
	
	@Override
	public int showBalance() {
		// money를 protected로 하여 자식클래스에서 접근 가능.
		this.money /= 2;
		return super.showBalance();
	}
		


}
