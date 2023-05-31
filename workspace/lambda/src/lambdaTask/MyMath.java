package lambdaTask;

import java.util.Scanner;

public class MyMath {
	
	static Calc calculrator(String oper) {
		
		// 다른 방법
	     // return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;
		
		Calc calc = null;
		
		// swtich 는 자료형 int, char, String을 쓸 수 있다.
		switch(oper) {
			
		// + 일때 -일때 람다식으로 덧셈할지 뺄셈 할지 calc에 담아준다.
		case "+":
			calc = (n, m) -> n + m;
			break;
		case "-":
			calc = (n, m) -> n - m;
			break;
		}
		return calc;
	}
	
	
	public static void main(String[] args) {
		
		
		// split 메소드 문자열 첫번째에 구분점이 오면 배열에 빈문자열로 담긴다.
		for (int i = 0; i < 4; i++) {
			System.out.println("-A-B-C".split("\\-")[i]);
		}
		
		
		OperCheck operCheck = expression -> {
			
			String oper1 = "";
			
			// 반복문을 받은 식 길이 만큼 반복문을 돌린다.
			for (int i = 0; i < expression.length(); i++) {
				// 받은 식의 문자를 순서대로 문자형 oper2에 담아준다.
				char oper2 = expression.charAt(i);
				// 만약 받은 식의 문자가 + 나 - 면 빈문자열인 oper1에 연결하여 담아라
				if(oper2 == '+' || oper2 == '-') {
					oper1 += oper2; 
				}
			}
			// 연산자를 담은 문자열을 split 메소드로 배열에 각각 담아준다.
			return oper1.split("");
		};
		
		
		// 문제풀이
		Scanner sc = new Scanner(System.in);
		
		// String에 문제 담기
		String msg = "원하는 덧셈, 뺄셈식을 입력하세요";
		// String에 예시 담기
		String example = "ex) 9+8+5";
		
		// 연산자를 담을 배열 선언
		String[] opers = null;
		// 연산자를 제외한 숫자를 담을 배열 선언
		String[] nums = null;
		// 입력받을 식을 담을 String 선언
		String expression = null;
		// 계산할 때 필요한 정수 선언
		int number1, number2= 0;
		
		// 문제 출력
		System.out.println(msg);
		System.out.println(example);
		
		// 입력받은 식을 String 변수에 담기
		expression = sc.next();
		
		// 담은 식을 operCheck에서 구현한 getOpers를 사용하여 배열에 +, - 순서대로 담기
		opers = operCheck.getOpers(expression);
		
		// 입력받은 식에 split 메소드를 사용하여 숫자들 배열에 순서대로 담기.
		nums = expression.split("\\+|\\-");
		
		// 첫번째 정수가 음수인지 아닌지 확인하여 처리하기
		
		number1 = Integer.parseInt(nums[0].equals("")? opers[0] + nums[1] : nums[0]);
		
	
		// 반복문을 통해 받은 식 계산 해주기.
		for (int i = 0; i < opers.length; i++) {
			
			// 인덱스 0번째 방이고 number1이 음수면 건너뛰어라.
			if(i == 0 && number1 < 0) {continue;}
			
			// 문자를 담을 배열은 정수 자료형으로 형변환해서 number2에 담아주기.
			number2 = Integer.parseInt(nums[i+1]);
			// 아래 식 해석은 (((7+5)+5)+5) 면 이 순서로 number1 에 계속 반복으로 담아 계산해서 마지막 연산자를 만나 계산이 끝난다.
			number1 = calculrator(opers[i]).calc(number1, number2);
			
		} 
		
		// 계산 결과 출력
		System.out.println(number1);
		
	}
		
		


}
