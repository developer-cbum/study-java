package inputTest;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {

		// 사용자에게 3개의 정수 입력 받아 뺄셈 하기
		
		// 입력 클래스 선언
		Scanner sc = new Scanner(System.in);
		
		// 출력 메소드 변수 선언 , 마지막 결과값 변수 선언
		String question = "3개의 정수를 입력하시오", example = "예) 1 3 5", format ="%d - %d - %d = %d";
		// 정수 변수 선언
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		
		// 문제 출력
		System.out.println(question);
		System.out.println(example);
		
		// 입력 받은 값
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
				
		// 결과값 담기
		result = num1 - num2 - num3;
		
		// 결과 출력
		System.out.printf(format, num1, num2, num3, result);
		
		
		
		
		
		
	}

}
