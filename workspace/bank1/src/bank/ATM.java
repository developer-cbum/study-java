package bank;

import java.util.Random;
import java.util.Scanner;


public class ATM {
	public static void main(String[] args) {
		// ���� �˷��� �� ��� �� �迭
		String[] bankNames = {"��������", "��������", "īī����ũ"};
		// 3�� ���� 100���� �ִ��� ���̽� ����
		Bank[][] arrBank = new Bank[3][100];
		// ���ະ ������ ���
		int[] arCount = new int[3];
		// �������� ������ ���¹�ȣ 6�ڸ����� ���� �� �� �����ϱ� ���� ����ο��� �������ش�.
		final int ACCOUNT_LENGTH = 6;

		String message = "1. ��������\n2. ��������\n3. īī����ũ\n4. ������";
		String menu = "1. ���°���\n2. �Ա��ϱ�\n3. ����ϱ�\n4. �ܾ���ȸ\n5. ���¹�ȣ ã��\n6. ���� ���� �޴��� ���ư���";
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		// money ����ҷ��� ����
		int money = 0;
		
		// �ε��� �� ��ȣ�� ����� ���̱� ������ i�� ����
		// choice�� ���� ������ ���� �޴����� ���.
		int i = 0, choice = 0;
		
		
		// ���� ���� ����� ����� ���̶� �ʱⰪ "" // ��й�ȣ, �ڵ��� ��ȣ�� �����س��´�.
		String account = "" , password = null, phoneNumber = null;
		// Bank user��� ���������� �ʱⰪ �־ �����س��´�.
		Bank user = null;
		
		
		while(true) {
			System.out.println(message);
			i = sc.nextInt();
			
			// ������ break;
			if(i == 4) {break;}
			
			// �ε��� ���� 0���� �����ϱ� ������ �Ʒ� �ҽ��ڵ忡�� ��� -1 ���ִ� �� ����
			// ����ڰ� �Է��� 1, 2, 3�� -1�� �Ͽ� �� ���� �ε��� ������ �ϱ� ���ϰ� ���ش�.
			// �׷��� i ��� ���������� �Ͽ� �ٸ� �����ڰ� ���� ���ϰԵ� ���ش�.
			i--;
			
			while(true) {
				// �Źݺ����� ����.
				// ���� ���� ��Ģ���� ���� ������ �迭�� ��´�.
				Bank[] banks = {new Shinhan(), new Kookmin(), new KaKao()};
				
				System.out.println(menu);
				choice = sc.nextInt();
				
				// ���༱������ ���ư��� break;
				if(choice == 6) {break;}
				
				switch(choice) {
				case 1: // ���°���
					
					// �������� 100���� ������ ���°��� �ȵȴ�.
					if(arCount[i] == 100) {System.out.println("�� �̻� ���¸� ������ �� ���� �����Դϴ�."); break;}
					
					// ������ ���� user�� ���
					user = banks[i];
					
					// ���¸� ������ �� ���� �⺻ ���� �ʱ�ȭ ������� �Ѵ�.
					// �ȱ׷���, ��� ���� ���¿� ��������Ǿ� ������.
					account = "";
					
					// ���� �ߺ��� �ȵ��� �𸣴ѱ� while �ݺ��� ���
					while(true) {
					// �̹� ������ i ����Ͽ� j �� ���
					// ���� ���� ���ڸ� 0���� ��������� ���
//					for (int j = 0; j < ACCOUNT_LENGTH; j++) {
//						account += random.nextInt(10);
//					}
					
					// ���ڸ��� 1���� �����ϴ� ���� ���� ��� �ڿ� ""  �ٿ��� ���ڿ��� ����ȯ ���ش�
					//account = random.nextInt(900000) + 100000 + "";
					// �̰͵� ����
					account += random.nextInt(900000) + 100000;
					// ���¿� ���� ���ະ�� �տ� ���ڷ� �����ȣ �ٿ��ֱ� 
					account = i + 1 + account;
					
					
					// ���� �ߺ� �˻�
					if(Bank.checkAccount(arrBank, arCount, account) == null) {
						break;
					}
					
					}
					
					// ������ ��� ������ �������� ���� �迭�� ���� 3���� ��Ƽ� ��Ģ���� �ο��ؼ�
					// ������ �����ϰ� �� ���࿡ ���� �� �� �ֵ��� �� ���̴�.
					user.setAccount(account);
					
					System.out.print("������: ");
					user.setName(sc.next());
					
					while(true) {
						System.out.print("��й�ȣ[4�ڸ�] : ");
						password = sc.next();
						
						if(password.length() == 4) {break;}
						
					}
					
					user.setPassword(password);
					while(true) {
					System.out.println("�ڵ��� ��ȣ['-' ����]");
					phoneNumber = sc.next();
					// replaceAll�� �۾��� ���ְ� �� ���� phoneNumber�� �������Ѵ�.
					phoneNumber = phoneNumber.replaceAll("-", "");
					// ����ȣ ���� 11 �� �ߺ�Ȯ�� �Ѵ� ���������� �����ְ� ������ ����.
					if(phoneNumber.length() == 11 && 
							(Bank.checkPhoneNumber(arrBank, arCount, phoneNumber) == null)) {break;}
					
					}
					
					user.setPhoneNumber(phoneNumber);
					
					// ������ i�� ���� �ε��� ���ȣ�� �����߱� ������
					// i�� ���� ������ ���� j���� ���� ���� ������ ���ȣ�� ������ ����.
					arrBank[i][arCount[i]] = user;
					// �ű԰����� �������� �� ���� �������� �÷��ش�.
					arCount[i]++;
					
					// ���� ��ȣ �˷��ֱ�
					System.out.println(bankNames[i] + "�̿����ּż� �����մϴ�." );
					System.out.println("���¹�ȣ�� " + account + "�Դϴ�");
					
					break;
				case 2: // �Ա��ϱ�
					
					// �α����� ���� �Է¹ޱ�
					System.out.print("���¹�ȣ : ");
					account = sc.next();
					System.out.println("��й�ȣ : ");
					password = sc.next();
					
					// ���°��� �� �� ������ ������ user ���
					user = Bank.login(arrBank, arCount, account, password);
				
					
					if(user != null) {
						// -48�� ���� charAt(0) = '0' ���ڿ��̶� �ƽ�Ű�ڵ� 48�� ���� ���� 0 ���� �ٲ��.
						if(user.getAccount().charAt(0) - 48 == i + 1) {
							System.out.print("�Աݾ� : ");
							money = sc.nextInt();
							if(money <= 0) {
								System.out.println("�ٽ� �Է����ּ���.");
								break;
						}
							// ������ �����̸� �ٿ�ĳ���� �ʿ� ���� ������ �� �޼ҵ� ���ȴ�.
							user.deposit(money);
						}else {
							System.out.println("������ ���࿡���� ��� ����.");
						}
							
						}
						
//						
//						// ���� ���� ����
//						boolean flag = false;
//						
//						
//						// ������ ������ ���� ��������, banks[i] = ���� ������ ������ ���� ��������
//						if(banks[i] instanceof Shinhan) {
//							if(i == 0) {
//									flag = true;
//							}
//						}else if (user instanceof Kookmin) {
//									flag = true;
//							}else {
//							if(i == 2) {
//								flag = true;
//							}
//							}
//						if(flag) {
//									
//								System.out.print("�Աݾ� : ");
//								money = sc.nextInt();
//								if(money <= 0) {
//									System.out.println("�ٽ� �Է����ּ���.");
//									break;
//							}
//								// ������ �����̸� �ٿ�ĳ���� �ʿ� ���� ������ �� �޼ҵ� ���ȴ�.
//								user.deposit(money);
//							}else {
//								System.out.println("������ ���࿡���� ��� ����.");
//							}
						

					break;
				case 3: // ����ϱ�
					
					// �α����� ���� �Է¹ޱ�
					System.out.print("���¹�ȣ : ");
					account = sc.next();
					System.out.println("��й�ȣ : ");
					password = sc.next();
					
					// ���°��� �� �� ������ ������ user ���
					user = Bank.login(arrBank, arCount, account, password);
					
					if(user != null) {
						System.out.print("��ݾ� : ");
						money = sc.nextInt();
						// �� �˻� �Ҷ� ���׿����� ����Ͽ� �����̸� 1.5�� ���� ���� �������� Ȯ���ϰ� �ƴϸ�
						// �Է��� ��ŭ ���� �������� �˻��ϴ� ���̴�.
						// ������ �켱 ������ ���� ���� ���� ������ �Ʒ��� ������ �Ұ�ȣ�� �����ش�.
						if(user.getMoney() < (user instanceof Kookmin ? money * 1.5 : money)) {
							System.out.println("�ܾ׺���");
							break;
						}else if(money <= 0) {
							System.out.println("�ٽ� �Է����ּ���.");
							break;
						}
						
						user.withdraw(money);
						
					}
							
					break;
				case 4: // �ܾ���ȸ
					
					// �α����� ���� �Է¹ޱ�
					System.out.print("���¹�ȣ : ");
					account = sc.next();
					System.out.println("��й�ȣ : ");
					password = sc.next();
					
					user = Bank.login(arrBank, arCount, account, password);
					
					if(user != null) {
						// īī�� ��ũ�� ������ �� ������ �ؼ� ���� �ٿ�ĳ���� ���ص� �ȴ�.
						System.out.println("���� �ܾ�: " + user.showBalance() + "��");

					}
					
					break;
				case 5: // ���¹�ȣ ã��
					System.out.print("�ڵ��� ��ȣ : ");
					phoneNumber = sc.next();
					
					user = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);
					
					if (user != null) {
						System.out.print("��й�ȣ : ");
						password = sc.next();
						
						if(user.getPassword().equals(password)) {
							
							// �ٽ� �ʱ�ȭ
							account = "";
							
							// ���� �ߺ��� �ȵ��� �𸣴ѱ� while �ݺ��� ���
							while(true) {
							// �̹� ������ i ����Ͽ� j �� ���
							// ���� ���� ���ڸ� 0���� ��������� ���
//							for (int j = 0; j < ACCOUNT_LENGTH; j++) {
//								account += random.nextInt(10);
//							}
							
							// ���ڸ��� 1���� �����ϴ� ���� ���� ��� �ڿ� ""  �ٿ��� ���ڿ��� ����ȯ ���ش�
							//account = random.nextInt(900000) + 100000 + "";
							// �̰͵� ����
							account += random.nextInt(900000) + 100000;
							account = i + 1 + account;
							
							// ���� �ߺ� �˻�
							if(Bank.checkAccount(arrBank, arCount, account) == null) {
								break;
							}
							
							}
							
							// ������ ��� ������ �������� ���� �迭�� ���� 3���� ��Ƽ� ��Ģ���� �ο��ؼ�
							// ������ �����ϰ� �� ���࿡ ���� �� �� �ֵ��� �� ���̴�.
							user.setAccount(account);
							System.out.println("�ٽô� �Ҿ������ ������.");
							System.out.println("���� ���¹�ȣ : " + account);
							
							
							
						}
						
					}
					
					break;
				
				}
				
			}
			
		}
		
		
	}
}