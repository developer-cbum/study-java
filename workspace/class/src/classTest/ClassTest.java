package classTest;

class A {
	
	
	// �ʵ�, ���������� �ڵ����� �ʱ�ȭ �ȴ�. (Ŭ������ �ʵ带 ����������� �Ѵ�.)
	int data;
	
	// �⺻������
	A() {
	}
	
	
	A(String name){
		System.out.println(name);
	}
	
	A(int data){
		// this ������ �ּҰ�!
		System.out.println(this);
		this.data = data;
	}
	
	void printData() {
		System.out.println(data);
	}
	
	
}

public class ClassTest {

	public static void main(String[] args) {
		
		A a = new A(10);
		A b = new A(20);
		
		System.out.println(a);
		System.out.println(b);
		
		//a.data = 10;
		a.printData();
		b.printData();

	}

}