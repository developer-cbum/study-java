package castingTest;

class Car {
	
	void engineStart() {
		System.out.println("열쇠로 시동 켬");
	}
	
}

class SuperCar extends Car {

	@Override
	void engineStart() {
		System.out.println("음성으로 시동 켬");
	}
	
	void openRoof() {
		System.out.println("지붕 열기");
	}
	
	
}


public class CastingTest {
	public static void main(String[] args) {
		
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
		// up casting
		Car noOptionFerrari = new SuperCar();
		// 재정의 값을 나옴! 그 값으로 채워져서
		noOptionFerrari.engineStart();
		
		// down casting
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
		
		fullOptionFerrari.openRoof();
		
		// 오류
		// SuperCar brokenFerrari = (SuperCar) new Car();
		
		// 타입검사
		// instanceof : 조건식
		// 객체 instanceof 타입 : 참 또는 거짓
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(ferrari instanceof Car);
		System.out.println(ferrari instanceof SuperCar);
		System.out.println(noOptionFerrari instanceof Car);
		System.out.println(noOptionFerrari instanceof SuperCar);
		System.out.println(fullOptionFerrari instanceof Car);
		System.out.println(fullOptionFerrari instanceof SuperCar);
		
		
		
		
		
		
		
	}
	
	
}
