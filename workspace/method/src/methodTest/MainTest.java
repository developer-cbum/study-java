package methodTest;

public class MainTest {
// 실행 프로그램을 만들어주는 메소드
	public static void main(String[] args) {
		// 외부에서 입력받을 수 도 있다.
		if(args.length !=0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}else {
			System.out.println("None");
		}

		
		
	}

}
