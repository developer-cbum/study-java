package exceptionTest;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int[] arData = new int[5];
		
		// shift homeŰ�� ������ ��������, end�� �ڷ� ��������
		// alt + shift + z
//		try {
//			arData[5] = 10;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// ���� ���� // ���� �˷��ֱ� ������ ������ �״�� ���â�� ���´�.
//			e.printStackTrace();
//			// ���� �޼����� �����´�
//			System.out.println(e.getMessage());
//			System.out.println("ĭ�� �Ѿ���ϴ�.");
//		}
//		
		
		try{
			System.out.println(10 / 0);
		} catch (NumberFormatException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		
//		} catch (Exception e) {
//			System.out.println("�� �� ���� ����");
//		}
		} finally {
			// try������ �������� finally�� �ݾƶ�~ Ȥ�ø𸣴�..
			// ������ �ٸ� ������ ����Ƽ� �������ᰡ �Ǵ��� ���� �Ǿ��ϴ� ����.
			System.out.println("�ݵ�� ����Ǿ�� �ϴ� ����");
		}
		
	}

}