package pratice4;

public class Main {

	public static void main(String[] args) {
		
//		id      atk   hp   ���ݴ��
//[1]   �Ƿη�   10   100   Ÿ��
//[2]   Ÿ��   15   80   �Ƿη�
//[1]�� [2]�� �����Ͻð� ������ ����� �� ���� 2�� �����ϸ� ��� �Ǵ��� ����
//attack()�޼ҵ带 Player�� �߰��� ����
//�����ϸ� ������ ü���� �� ���ݷ¸�ŭ ���ҵǵ��� ����

		Player[] player = {new Player("�Ƿη�", 10, 100, "Ÿ��"), new Player("Ÿ��", 15, 80, "�Ƿη�")};

		// �Ƿηΰ� Ÿ�� ����
		player[0].attack(player[0], player[1]);
		
		//Ÿ�� hp -10
		System.out.println(player[1]);
		
		// Ÿ�䰡 �Ƿη� ����
		player[1].attack(player[1], player[0]);
		
		// �Ƿη� hp -15
		System.out.println(player[0]);
		
		
	}

}