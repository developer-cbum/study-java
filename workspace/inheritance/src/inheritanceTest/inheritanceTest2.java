package inheritanceTest;

class Human{
	
	String name;
	
	// �⺻ �����ڴ� ���� �����Ѵ�. (������ ��� �޴� Ŭ���� ���� ��.)
	public Human() {;}
	
	public Human(String name) {
		super();
		this.name = name;
	}
	
	
	
	void eat() {
		System.out.println("�Ա�");
	}
	void sleep() {
		System.out.println("�ڱ�");
	}
	
	void walk() {
		System.out.println("�� �߷� �ȱ�");
	}
	
	
}

class Monkey extends Human{
	
	// �޼ҵ� �̸� ù���� ���� �ڵ��ϼ��� �ȴ�.
	// ����Ű alt + shift + s + v �������̵�
	@Override // ������̼�
	void walk() {
		super.walk();
		System.out.println("�� �߷� �ȴ´�");
	}
	
}




public class inheritanceTest2 {
	
	public static void main(String[] args) {
		
		Human ������ = new Human();
		
		Monkey kingkong = new Monkey();
		
		kingkong.walk();
		������.walk();
		
	}

}