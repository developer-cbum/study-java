package staticTest;

class Data {
	
	
	// ��ü�� ���� -> ��ü ���� , �ν��Ͻ� ����
	int data = 10;
	
	// Ŭ���� ����
	//��� ��ü�� �����ؾ� �� �� statiac �ʵ带 �����Ѵ�.
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
//		// ��ü�� ���� x Ŭ������ ����.
//		System.out.println(Data.data_s);
		
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		
//		
//		// static �����Ϸ��� ���� ���� �޸𸮿� �Ҵ� , ������ ���� �ʴ´�.
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
//		// �������� ���ο� �ּҰ��� ������ �� ���� ���� ������ �� ����. �޸� ����
//		data = new Data();
//		
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
	}

}