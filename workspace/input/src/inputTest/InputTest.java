package inputTest;

// CTRL + SHIFT + O 단축키
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 초기값 : 아직 어떤 값을 넣을 지 모를 때 넣는 값
		// 정수 : 0
		// 실수 : 0.0
		// 문자 : ' ' 안에 공백
		// 문자열 : null
		
		String name = null;
		//String firstName = null , lastName = null;
		
		
		
		// sc.next()도 값으로 생각 할 줄 알아야한다.
		System.out.print("이름 : ");
//		lastName = sc.next();
//		firstName = sc.next();
//		System.out.println(lastName + firstName + "님");
		name = sc.nextLine();
		System.out.println(name + "님");
		
	
		
		
	}

}
