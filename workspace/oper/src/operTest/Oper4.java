package operTest;

import java.util.Scanner;

public class Oper4 {
   public static void main(String[] args) {
//      �ɸ� �׽�Ʈ
//      
//      Q. ����� �����ϴ� ���� �����ϼ���.
//      1. ������
//      2. �����
//      3. ������
//      4. ���
//      
//      ������ : �Ұ��� �������̰� �������̴�.
//      ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
//      ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
//      ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
	   
	   Scanner sc = new Scanner(System.in);
	   
	   String massage = "����� �����ϴ� ���� �����ϼ���", question = "1. ������, 2. �����, 3. ������, 4. ���";
	   int choice = 0;
	   String result = null,
			   red = "������ : �Ұ��� �������̰� �������̴�.", 
			   yellow = "����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.",
			   black = "������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.", 
			   white ="õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.",
			   error ="�߸��Է��Ͽ����ϴ�.";
	   
	   
	   System.out.println(massage);
	   System.out.println(question);
	   
	   choice = sc.nextInt();
	   
	   result = choice == 1 ? red
			   : choice == 2 ? yellow 
					   : choice == 3 ? black 
							   : choice == 4 ? white
									   : error;
 	   
	   System.out.println(result);
	   
   }
}