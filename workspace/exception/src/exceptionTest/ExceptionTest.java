package exceptionTest;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int[] arData = new int[5];
		
		// shift home키는 앞으로 블록지정, end는 뒤로 블록지정
		// alt + shift + z
//		try {
//			arData[5] = 10;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// 오류 추적 // 오류 알려주기 빨간색 오류가 그대로 출력창에 나온다.
//			e.printStackTrace();
//			// 오류 메세지만 가져온다
//			System.out.println(e.getMessage());
//			System.out.println("칸을 넘어갔습니다.");
//		}
//		
		
		try{
			System.out.println(10 / 0);
		} catch (NumberFormatException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		
//		} catch (Exception e) {
//			System.out.println("알 수 없는 오류");
//		}
		} finally {
			// try문으로 열었으면 finally로 닫아라~ 혹시모르니..
			// 위에서 다른 오류를 못잡아서 강제종료가 되더라도 실행 되야하는 문장.
			System.out.println("반드시 실행되어야 하는 문장");
		}
		
	}

}
