package arrayListTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTest {

	
	public static void main(String[] args) {
		// <?> : ���׸�(�̸��� ����)
		// ��üȭ �� Ÿ���� �����ϴ� ���
		// ������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
		// ���� �ٿ� ĳ������ �ʿ䰡 ������, ������ Ÿ�Կ� ������ �� �� �ֱ� ������ Object�� �ƴ� ���׸����� �����Ѵ�.
		
		// capacity(�뷮) : �̸� Ȯ���� ���� ����, ���� �޸��� �Ѱ踦 Ȯ���� �� �ִ�.
		// �뷮�� ������ �ִ� ���� �ƴϴ�!
		ArrayList<Integer> datas = new ArrayList<>();
		
		
		datas.add(40);
		System.out.println(datas.size());
		datas.add(50);
		System.out.println(datas.size());
		datas.add(90);
		datas.add(70);
		datas.add(10);
		datas.add(80);
		datas.add(20);
		datas.add(30);
		datas.add(100);
		
		System.out.println(datas.size());
		System.out.println(datas);	
		

		// List���� toString�� �������ؼ� �ݺ��� ���� �ʾƵ� �����ؼ� ��µȴ�.
		
		// ����
		Collections.sort(datas);
		System.out.println(datas);
		// ���������س��� �������� �ݴ�� �ٲ㼭 ���
		Collections.reverse(datas);
		System.out.println(datas);
		
		//�����Ҷ����� �ٲ� ���°�
		Collections.shuffle(datas);
		System.out.println(datas);
		
		
		// �߰�(����) 60�� �׻� 30�ڿ� ���Եȴ�.
		if(datas.contains(30)) {
			datas.add(datas.indexOf(30) + 1, 60);			
		}
		System.out.println(datas);
		
		
		// ���� 10 -> 1�� ����
		if(datas.contains(10)){
			System.out.println(datas.set(datas.indexOf(10), 1) + "�� 1�� ����");
			System.out.println(datas);
		}
		



//		// ����(������ ����) 20�� ����

//		datas.removeIf(n -> (n == 20));
//		System.out.println(datas);
		
		if(datas.remove(Integer.valueOf(20))) {
			System.out.println("��������");
			System.out.println(datas);
		}
		
		
		// ����(�ε����� ����) �׻� 50�� ����
		
		if(datas.contains(50)) {
		System.out.println(datas.remove(datas.indexOf(50)) + "����");	
			System.out.println(datas);	
		}
		
			
		
	}

}