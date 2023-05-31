package classTest;

class A {
	
	
	// 필드, 전역변수는 자동으로 초기화 된다. (클래스에 필드를 전역변수라고 한다.)
	int data;
	
	// 기본생성자
	A() {
	}
	
	
	A(String name){
		System.out.println(name);
	}
	
	A(int data){
		// this 접근한 주소값!
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
