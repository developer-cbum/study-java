package inputTest;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		// 3개의 정수를 한번에 입력받은 후 덧셈 출력
		// nextInt() : 입력받은 정수
		
		// 입력클래스 선언
		Scanner sc = new Scanner(System.in);
		
		// 출력할 메세지 변수에 담기
		String question = "3개의 정수를 입력하시오" , example = "ex) 1 3 5", format = "%d + %d + %d = %d";
		// 3개의 정수를 담을 변수 3개 선언
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		
		// 메세지 출력
		System.out.println(question);
		System.out.println(example);
		// 입력받은 3개의 정수를 각 변수에 대입
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		// 각 변수를 더한 결과를 변수에 대입
		result = num1 + num2 + num3;
		
		// 결과값 출력
		System.out.printf(format, num1, num2, num3, result);
		
		
	}

}
