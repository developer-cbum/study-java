package inheritanceTest;

class Human{
	
	String name;
	
	// 기본 생성자는 직접 선언한다. (없으면 상속 받는 클래스 오류 뜸.)
	public Human() {;}
	
	public Human(String name) {
		super();
		this.name = name;
	}
	
	
	
	void eat() {
		System.out.println("먹기");
	}
	void sleep() {
		System.out.println("자기");
	}
	
	void walk() {
		System.out.println("두 발로 걷기");
	}
	
	
}

class Monkey extends Human{
	
	// 메소드 이름 첫글자 쓰고 자동완성도 된다.
	// 단축키 alt + shift + s + v 오버라이딩
	@Override // 어노테이션
	void walk() {
		super.walk();
		System.out.println("네 발로 걷는다");
	}
	
}




public class inheritanceTest2 {
	
	public static void main(String[] args) {
		
		Human 이종문 = new Human();
		
		Monkey kingkong = new Monkey();
		
		kingkong.walk();
		이종문.walk();
		
	}

}
