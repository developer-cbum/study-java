package controllStatement;

import java.util.Scanner;

public class WhileTask {

	public static void main(String[] args) {

		   
		   Scanner sc = new Scanner(System.in);
		   
		   String massage = "����� �����ϴ� ���� �����ϼ���", question = " 1. ������\n 2. �����\n 3. ������\n 4. ���\n 5. ������";
		   int choice = 0;
		   String result = null,
				   red = "������ : �Ұ��� �������̰� �������̴�.", 
				   yellow = "����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.",
				   black = "������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.", 
				   white ="õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.",
				   error ="�߸��Է��Ͽ����ϴ�.",
				   goodBye = "�����մϴ�.";
		  boolean flag = false;
		   
//		   while(choice != 5) {
			while(true) {	   
			   System.out.println(massage);
			   System.out.println(question);
			   
			   choice = sc.nextInt();
//			   if(choice == 5) {break;}
			   
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
		       
//			   case 5:
//				   break;
				      
			   case 5:
				   result = goodBye;
				   flag = true;
				   break;
			   default:
				   result = error;
				   break;
			   }
			  
			   if(flag) {break;}
	
			   System.out.println(result);
		   	
		   }
	}

}