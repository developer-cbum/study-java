package exceptionTest;

// Exception ��� : �����Ϸ��� üũ(������ ����) �����ٷ� �˷���.
// RuntimeException ��� : �Ϻη� ���������Ϸ��� ����� ��!!. �����Ϸ��� üũ���� ����(���� �Ǵ� ��Ÿ�� ����) �������� �ؾ��Ѵ�!
public class BadWordException extends /* RuntimeException */ Exception {
	// �޼����� ��� ������.
	public BadWordException(String message) {
		super(message);
	}
}