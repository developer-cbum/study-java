package controllStatement;

import java.util.Scanner;


public class IfTest {

	public static void main(String[] args) {

		// 두 정수 대소비교
		Scanner sc = new Scanner(System.in);
		
		String massage = "두 정수를 입력하시오", result = null;
		int num = 0, num2 = 0;
		
		System.out.println(massage);
		num = sc.nextInt();
		num2 = sc.nextInt();
		
		// println은 개별처리말고 일괄처리로 한번만 사용할 수 있도록
		if(num > num2) {
			result= "큰 값: " + num;
		}else if(num != num2) {
			result= "큰 값: " + num2;
		}else {
			result= "두 수는 같습니다";
		}
		
		System.out.println(result);
		
		
	}

}
