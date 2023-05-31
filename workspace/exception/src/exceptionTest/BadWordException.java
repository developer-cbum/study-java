package exceptionTest;

// Exception 상속 : 컴파일러가 체크(컴파일 오류) 빨간줄로 알려줌.
// RuntimeException 상속 : 일부러 강제종료하려고 사용한 것!!. 컴파일러가 체크하지 않음(빌드 또는 런타임 오류) 강제종료 해야한다!
public class BadWordException extends /* RuntimeException */ Exception {
	// 메세지를 담는 생성자.
	public BadWordException(String message) {
		super(message);
	}
}
