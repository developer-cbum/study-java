package operTest;

public class Oper5 {

	public static void main(String[] args) {

		int data = 10;
//		data = data +1;
//		data += 1;
//		data++;
		// 후위형은 다음 줄 부터 적용
//		System.out.println(data++);
		// 전위형은 반드시 그 줄부터 적용 될 때 사용
		System.out.println(++data);
		System.out.println(data);
		
		
	}

}
