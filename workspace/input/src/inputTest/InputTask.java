package inputTest;

import java.util.Scanner;

public class InputTask {

	public static void main(String[] args) {

		// �� ������ �Է��� �� ���� ��� ���
		// ��, next()�� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);

//		String ans1 = null , ans2 = null;
//		String question = "�� ������ �Է��Ͻʽÿ�";
//		int result = 0;
//		
//		
//		System.out.println(question);
//		ans1 = sc.next();
//		ans2 = sc.next();
//		
//		result = Integer.parseInt(ans1) * Integer.parseInt(ans2);
//		
//		System.out.println("�� ������ ���� " + result + "�Դϴ�");
		
		// ����� ���
		
	      String message = "�� ������ �Է��ϼ���.", example = "��)1 3", format = "%d * %d = %d";
	      String data1 = null, data2 = null;
	      int number1 = 0, number2 = 0, result = 0;
	      
	      System.out.println(message);
	      System.out.println(example);
	      data1 = sc.next();
	      data2 = sc.next();
	      
	      number1 = Integer.parseInt(data1);
	      number2 = Integer.parseInt(data2);
	      
	      result = number1 * number2;
	      
	      System.out.printf(format, number1, number2, result);
	   }
	}