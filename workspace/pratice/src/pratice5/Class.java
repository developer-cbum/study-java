package pratice5;

import java.util.Arrays;

public class Class {
	
//	���� ����
//	���� �迭 numbers�� ���� num1, num2�� �Ű������� �־��� ��, 
//	numbers�� num1�� ° �ε������� num2��° �ε������� �ڸ� ���� 
//	�迭�� return �ϵ��� solution �Լ��� �ϼ��غ�����.
	
	public int[] cutArray(int[] numbers, int num1, int num2) {
		
//		return Arrays.copyOfRange(numbers, num1, num2 + 1);
		
		int[] answer = new int[num2 - num1 + 1];
		
		for (int i = num1; i < num2 + 1; i++) {
			answer[i-num1] = numbers[i];
			
		}
		return answer;
		
		
		
	}

}