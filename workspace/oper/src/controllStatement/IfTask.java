package controllStatement;

import java.util.Scanner;

public class IfTask {

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
	   
	   if(choice == 1) {
		   result = red;
		   
	   }else if(choice == 2) {
		   result = yellow;
		
	   }else if(choice == 3) {
		   result = black;
		   
	   }else if(choice == 4) {
		   result = white;
		   
	   }else {
		   result = error;
	   }

	   System.out.println(result);
	   
   
		
	}

}