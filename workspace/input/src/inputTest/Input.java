package inputTest;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		// 3���� ������ �ѹ��� �Է¹��� �� ���� ���
		// nextInt() : �Է¹��� ����
		
		// �Է�Ŭ���� ����
		Scanner sc = new Scanner(System.in);
		
		// ����� �޼��� ������ ���
		String question = "3���� ������ �Է��Ͻÿ�" , example = "ex) 1 3 5", format = "%d + %d + %d = %d";
		// 3���� ������ ���� ���� 3�� ����
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		
		// �޼��� ���
		System.out.println(question);
		System.out.println(example);
		// �Է¹��� 3���� ������ �� ������ ����
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		// �� ������ ���� ����� ������ ����
		result = num1 + num2 + num3;
		
		// ����� ���
		System.out.printf(format, num1, num2, num3, result);
		
		
	}

}