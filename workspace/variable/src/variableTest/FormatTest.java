package variableTest;

public class FormatTest {

	public static void main(String[] args) {
		
		// ���� ����
		// �ݵ�� ����ǥ �ȿ� �ۼ��Ѵ�.
		
		// %d : decimal 10���� ����
		// %o : octal 8���� ����
		// %x : hexadecimal 16���� ����
		// �����ڶ�� ������ 2���� 8���� 10���� 16���� ���
		// %f : float �Ǽ�
		// %c : character ����
		// %s : String ���ڿ�

		String name = "������";
		int age = 10;
		
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d��", age);
		
	}

}