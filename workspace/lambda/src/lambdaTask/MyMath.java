package lambdaTask;

import java.util.Scanner;

public class MyMath {
	
	static Calc calculrator(String oper) {
		
		// �ٸ� ���
	     // return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;
		
		Calc calc = null;
		
		// swtich �� �ڷ��� int, char, String�� �� �� �ִ�.
		switch(oper) {
			
		// + �϶� -�϶� ���ٽ����� �������� ���� ���� calc�� ����ش�.
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
		
		
		// split �޼ҵ� ���ڿ� ù��°�� �������� ���� �迭�� ���ڿ��� ����.
		for (int i = 0; i < 4; i++) {
			System.out.println("-A-B-C".split("\\-")[i]);
		}
		
		
		OperCheck operCheck = expression -> {
			
			String oper1 = "";
			
			// �ݺ����� ���� �� ���� ��ŭ �ݺ����� ������.
			for (int i = 0; i < expression.length(); i++) {
				// ���� ���� ���ڸ� ������� ������ oper2�� ����ش�.
				char oper2 = expression.charAt(i);
				// ���� ���� ���� ���ڰ� + �� - �� ���ڿ��� oper1�� �����Ͽ� ��ƶ�
				if(oper2 == '+' || oper2 == '-') {
					oper1 += oper2; 
				}
			}
			// �����ڸ� ���� ���ڿ��� split �޼ҵ�� �迭�� ���� ����ش�.
			return oper1.split("");
		};
		
		
		// ����Ǯ��
		Scanner sc = new Scanner(System.in);
		
		// String�� ���� ���
		String msg = "���ϴ� ����, �������� �Է��ϼ���";
		// String�� ���� ���
		String example = "ex) 9+8+5";
		
		// �����ڸ� ���� �迭 ����
		String[] opers = null;
		// �����ڸ� ������ ���ڸ� ���� �迭 ����
		String[] nums = null;
		// �Է¹��� ���� ���� String ����
		String expression = null;
		// ����� �� �ʿ��� ���� ����
		int number1, number2= 0;
		
		// ���� ���
		System.out.println(msg);
		System.out.println(example);
		
		// �Է¹��� ���� String ������ ���
		expression = sc.next();
		
		// ���� ���� operCheck���� ������ getOpers�� ����Ͽ� �迭�� +, - ������� ���
		opers = operCheck.getOpers(expression);
		
		// �Է¹��� �Ŀ� split �޼ҵ带 ����Ͽ� ���ڵ� �迭�� ������� ���.
		nums = expression.split("\\+|\\-");
		
		// ù��° ������ �������� �ƴ��� Ȯ���Ͽ� ó���ϱ�
		
		number1 = Integer.parseInt(nums[0].equals("")? opers[0] + nums[1] : nums[0]);
		
	
		// �ݺ����� ���� ���� �� ��� ���ֱ�.
		for (int i = 0; i < opers.length; i++) {
			
			// �ε��� 0��° ���̰� number1�� ������ �ǳʶپ��.
			if(i == 0 && number1 < 0) {continue;}
			
			// ���ڸ� ���� �迭�� ���� �ڷ������� ����ȯ�ؼ� number2�� ����ֱ�.
			number2 = Integer.parseInt(nums[i+1]);
			// �Ʒ� �� �ؼ��� (((7+5)+5)+5) �� �� ������ number1 �� ��� �ݺ����� ��� ����ؼ� ������ �����ڸ� ���� ����� ������.
			number1 = calculrator(opers[i]).calc(number1, number2);
			
		} 
		
		// ��� ��� ���
		System.out.println(number1);
		
	}
		
		


}