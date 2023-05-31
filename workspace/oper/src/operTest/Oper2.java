package operTest;

import java.util.Scanner;

public class Oper2 {

	public static void main(String[] args) {
		// 두 정수 대소비교
		Scanner sc = new Scanner(System.in);
		
		String massage = "두 정수를 입력하시오", result = null;
		int num = 0, num2 = 0;
		
		System.out.println(massage);
		num = sc.nextInt();
		num2 = sc.nextInt();
		
		// 삼항 연산자
		
		result = num > num2 ? "큰 값: " + num 
				: num == num2 ? "두 수는 같습니다." : "큰 값: " + num2;
		
		System.out.println(result);
		
		
	}

}
