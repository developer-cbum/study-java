package abstractTest;

public class WashingMachine extends Electronics {

	@Override
	public void on() {
		System.out.println("�߻�޼ҵ� ����");
	}

	@Override
	public void off() {
		System.out.println("�߻�޼ҵ� ����");		
	}
	
	@Override
	public void printProduct() {
		super.printProduct();
	}

}