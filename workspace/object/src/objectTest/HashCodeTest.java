package objectTest;

import java.util.Random;

public class HashCodeTest {

	public static void main(String[] args) {
		
		String data1 = "ABC";
		String data2 = new String("ABC");
		
		
		// Object의 hashCode를 String 클래스에서 재정의 값의 대한 주소값 
		// 주소값이 아님.
		// String 클래스는 값이 같으면 hashCode가 같게 재정의 되었다.
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
		

//		Random random = new Random();
//		
//		System.out.println(random.hashCode());
	}

}
