package abstractTest;

public class WashingMachine extends Electronics {

	@Override
	public void on() {
		System.out.println("추상메소드 구현");
	}

	@Override
	public void off() {
		System.out.println("추상메소드 구현");		
	}
	
	@Override
	public void printProduct() {
		super.printProduct();
	}

}
