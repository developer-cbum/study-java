package inheritanceTest;

class A {
	String name = "A";
	int data = 10;
	
	public A() {System.out.println("부모 생성자");}
	
	void printName() {
		System.out.println(name);
	}
}

class B extends A {
	
	public B() {
		super(); // 부모 생성자 , 항상 맨위
		this.data = 20;
		System.out.println("자식 생성자");
		}
	
	void printData() {
		System.out.println(data);
	}
	
}



//  클래스 커서 누른 상태에서 alt + shift + r = 클래스이름 바꾸기 그리고 엔터
public class inheritanceTest1 {

	public static void main(String[] args) {
		B b = new B();
		b.printName();
//		b.data = 20;
		b.printData();
	}
	
	
}
