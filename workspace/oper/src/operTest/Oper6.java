package operTest;

import java.util.Iterator;

public class Oper6 {

	public static void main(String[] args) {

		// 1 ~ 10���� �� 8������ ���
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
			if(i ==7) {
				break;
			}
		}

		// 1 ~ 10���� �� 4�� �����ϰ� ���
		// continue�� �ؿ� �ڵ尡 ������ ��� �ڵ徲�� �� �ؿ� continue�ϸ� �ǹ̰� ����.
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i + 1);
		}
		
		
		
	}

}