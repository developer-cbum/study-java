package arrayTest;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
//		�����
//		1~10���� �迭�� ��� ���
		
		// 10ĭ¥�� arData[] �ڷ��� int �迭�� �����, �ݺ������� ���� ��� ����ߴ�.
		int arData[] = new int[10];
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = i + 1;
			System.out.println(arData[i]);
		}
		
		System.out.println("===================");
		
//		10~1���� �� ¦���� �迭�� ��� ���
		
		// �ڷ��� int �� 5ĭ¥�� �迭�� ����� 10 - i*2�� ���� �迭�� ��Ƽ� ����ߴ�.
		int arData2[] = new int [5];
		
		for (int i = 0; i < arData2.length; i++) {
			arData2[i] = 10 - i*2;
			System.out.println(arData2[i]);
		}
		
		System.out.println("===================");
		
//		1~100���� �迭�� ���� �� Ȧ���� ���
		
		// 1~100 ���� �迭�� ���, ���ǽ����� ������ 1�� ��� ���.
		int arData3[] = new int [100];
		
		for (int i = 0; i < arData3.length; i++) {
			
			if(i%2 == 1) {
				arData3[i] = i;
				System.out.println(arData3[i]);
			}
	
		}
		
		System.out.println("===================");
		
//		�ǹ�
//		1~100���� �迭�� ���� �� ¦���� �� ���
		int total = 0;
		
		for (int i = 0; i < arData3.length; i++) {
			if(i%2 == 0) {
				arData3[i] = i+2;
				total += arData3[i];
			}
		}
		System.out.println(total);
		
		System.out.println("===================");
		
//		A~F���� �迭�� ��� ���
		
		int arData4[] = new int[6];
		
		for (int i = 0; i < arData4.length; i++) {
			arData4[i] = i +65;
			System.out.println((char)arData4[i]);
		}
		
		System.out.println("===================");
		
//		A~F���� �� C�����ϰ� �迭�� ���� �� ���
			
		for (int i = 0; i < arData4.length; i++) {
			if(i == 2){continue;}
			arData4[i] = i +65;
			System.out.println((char)arData4[i]);
		}
		
		System.out.println("===================");
		
//		���
//		5���� ������ �Է¹ް� �迭�� ���� �� �ִ밪�� �ּҰ� ���
		
//		Scanner sc = new Scanner(System.in);
//		
//		String max = "�ִ밪 = ", min = "�ּҰ� = ";
//		
//		int arNum[] = new int [5];
//		
//		System.out.println("5���� ������ �Է��Ͻÿ�.");
//		
//		
//
//		for (int i = 0; i < arNum.length; i++) {
//			arNum[i] = sc.nextInt();
//			}
		
		
		
		
		
//		���̾�
//		����ڰ� �Է��� ������ ������ŭ �迭�� ���� �� ������ �Է¹ް� ��� ���ϱ�
		
//		int total2 = 0;
//		int[] arData5 = null;
//		String message = "����� �迭�� ������ �Է��Ͻÿ�.", 
//				message2 = "�ȿ� ���� ������ �Է��Ͻÿ�.", 
//				result = "�Է��Ͻ� ������ ��� = ";
//		
//		System.out.println(message);
//		
//		arData5 = new int[sc.nextInt()];
//		
//		
//		System.out.println(message2);
//		
//		for (int i = 0; i < arData5.length; i++) {
//			arData5[i] = sc.nextInt();
//		}
//		
//		
//		
//		for (int i = 0; i < arData5.length; i++) {
//			total2 += arData[i];
//		}
//		System.out.println(result + (double)total2/arData5.length);
//
	}

}
		
		
		
		






















