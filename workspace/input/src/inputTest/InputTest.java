package inputTest;

// CTRL + SHIFT + O ����Ű
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// �ʱⰪ : ���� � ���� ���� �� �� �� �ִ� ��
		// ���� : 0
		// �Ǽ� : 0.0
		// ���� : ' ' �ȿ� ����
		// ���ڿ� : null
		
		String name = null;
		//String firstName = null , lastName = null;
		
		
		
		// sc.next()�� ������ ���� �� �� �˾ƾ��Ѵ�.
		System.out.print("�̸� : ");
//		lastName = sc.next();
//		firstName = sc.next();
//		System.out.println(lastName + firstName + "��");
		name = sc.nextLine();
		System.out.println(name + "��");
		
	
		
		
	}

}