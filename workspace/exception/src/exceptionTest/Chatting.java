package exceptionTest;

import java.util.Scanner;

public class Chatting {
	
	public static void main(String[] args) {
		
		
//		System.out.println("��              ��".replaceAll(" ", ""));
//		System.out.println("    ��     ��    ".trim().replace(" ", ""));
		
		
		Scanner sc = new Scanner(System.in);
		String message = null, answer = "";
		
		System.out.println("�޼���: ");
		message = sc.nextLine();
		
		if(message.equals("�ٺ�")) {
			//���ܹ߻�.
			// ���� ���� ���� �޼���..
			// RuntimeException �� ��ӹ����� ��������
				try {
					throw new BadWordException("��Ӿ�� ����� �� �����ϴ�");
				} catch (BadWordException e) {
					for (int i = 0; i < message.length(); i++) {
						answer += "*";
					}
					System.out.println(answer);
				}
		}
		
		
	}

}