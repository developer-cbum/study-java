package controllStatement;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {

		   
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
		   
		   switch(choice) {
		   case 1:
			   result = red;
			   break;
		   case 2:
			   result = yellow;
			   break;
		   case 3:
			   result = black;
			   break;
		   case 4:
			   result = white;
			   break;
		   default:
			   result = error;
			   break;
		   }
		   

		   System.out.println(result);
		   	
		
	}

}