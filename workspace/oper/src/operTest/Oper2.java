package operTest;

import java.util.Scanner;

public class Oper2 {

	public static void main(String[] args) {
		// �� ���� ��Һ�
		Scanner sc = new Scanner(System.in);
		
		String massage = "�� ������ �Է��Ͻÿ�", result = null;
		int num = 0, num2 = 0;
		
		System.out.println(massage);
		num = sc.nextInt();
		num2 = sc.nextInt();
		
		// ���� ������
		
		result = num > num2 ? "ū ��: " + num 
				: num == num2 ? "�� ���� �����ϴ�." : "ū ��: " + num2;
		
		System.out.println(result);
		
		
	}

}