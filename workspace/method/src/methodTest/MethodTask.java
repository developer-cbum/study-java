package methodTest;

public class MethodTask {
	
	void numPrint() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}
	
	void hongPrint(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("ȫ�浿");
		}
	}
	
	void namePrint(String name, int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(name);
		}
	}
	
	int subtract(int num1, int num2, int num3) {
		
		return num1 - num2 - num3;
	}
	
	
	int[] divide(int num1, int num2) {
		
		int[] result = null;
		
		if(num2 != 0) {
			result = new int[2];
			result[0] = num1 / num2;
			result[1] = num1 % num2;
		}
		
		return result;

	}
	
	void numPlus (int num) {
		
		int result = 0;
		
		for (int i = 0; i < num; i++) {
			result += i+1;
		}
		
		System.out.println(result);
	}
	
	void change(int num) {
		if(num%2 == 0) {
			System.out.println(num + 1);
		}else {
			System.out.println(num + 1);
		}
	}
	
	
	void charChange (String word) {
		

	}
	
	void eaString(String message) {
		System.out.println(message.length() + "��");
	}
	
	
	// 5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
	
	int[] getMaxAndMin (int[] arData) {
		
		int[] result = new int[2];
		
		result[0] = arData[0];
		result[1] = arData[0];
		
		for (int i = 0; i < result.length; i++) {
			if(result[0] < arData[i]) {result[0] = arData[i];}
			else if(result[0] > arData[i]) {result[1] = arData[i];}
		}
		
		return result;
	}
	
	
	

	public static void main(String[] args) {

		MethodTask mt = new MethodTask();
		
		// 1~10���� println()���� ����ϴ� �޼ҵ�
			mt.numPrint();
		
		// "ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
			mt.hongPrint(10);
			
		// �̸��� n�� println()���� ����ϴ� �޼ҵ�
			mt.namePrint("������", 2);
			
		// �� ������ �������ִ� �޼ҵ�
			mt.subtract(1, 2, 3);
			
		// �� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
			
			
			
			
		// 1 ~ n ������ ���� �����ִ� �޼ҵ�
			mt.numPlus(4);
			
		// Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
			mt.change(4);
			
		// ���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
		
			
			
		// ���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
			mt.eaString("������");
			
			
		// 5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
		// �ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
		// 5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
			

			
			
		// 5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ� (void)
		// indexof() �����
		
		
	}

}