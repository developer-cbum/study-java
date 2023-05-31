package staticTest;

class Data {
	
	
	// 객체로 접근 -> 객체 변수 , 인스턴스 변수
	int data = 10;
	
	// 클래스 변수
	//모든 객체가 공유해야 할 때 statiac 필드를 선언한다.
	static int data_s = 10;
	
	void increase() {
		System.out.println(++data);
	}
	
	void increase_s() {
		System.out.println(++data_s);
	}
}

public class StaticTest {
	
	public static void main(String[] args) {
		
		Data data1 = new Data();
		Data data2 = new Data();
		
		Data.data_s = 20;
		System.out.println(Data.data_s);
		
		data1.data = 20;
		System.out.println(data2.data);
		
		
//		Data data = new Data();
//		
//		System.out.println(data.data);
//		
//		// 객체로 접근 x 클래스에 접근.
//		System.out.println(Data.data_s);
		
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		
//		
//		// static 컴파일러가 가장 먼저 메모리에 할당 , 영향을 받지 않는다.
//		data = new Data();
//		
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
		
		
		
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
//		
//		// 전역변수 새로운 주소값을 만났을 때 이전 값을 유지할 수 없음. 메모리 해제
//		data = new Data();
//		
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
	}

}
