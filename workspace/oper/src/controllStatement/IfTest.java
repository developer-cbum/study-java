package controllStatement;

import java.util.Scanner;


public class IfTest {

	public static void main(String[] args) {

		// �� ���� ��Һ�
		Scanner sc = new Scanner(System.in);
		
		String massage = "�� ������ �Է��Ͻÿ�", result = null;
		int num = 0, num2 = 0;
		
		System.out.println(massage);
		num = sc.nextInt();
		num2 = sc.nextInt();
		
		// println�� ����ó������ �ϰ�ó���� �ѹ��� ����� �� �ֵ���
		if(num > num2) {
			result= "ū ��: " + num;
		}else if(num != num2) {
			result= "ū ��: " + num2;
		}else {
			result= "�� ���� �����ϴ�";
		}
		
		System.out.println(result);
		
		
	}

}