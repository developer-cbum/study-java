package arrayTest;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
//		브론즈
//		1~10까지 배열에 담고 출력
		
		// 10칸짜리 arData[] 자료형 int 배열을 만들고, 반복문으로 값을 담고 출력했다.
		int arData[] = new int[10];
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = i + 1;
			System.out.println(arData[i]);
		}
		
		System.out.println("===================");
		
//		10~1까지 중 짝수만 배열에 담고 출력
		
		// 자료형 int 에 5칸짜리 배열을 만들고 10 - i*2한 값을 배열에 담아서 출력했다.
		int arData2[] = new int [5];
		
		for (int i = 0; i < arData2.length; i++) {
			arData2[i] = 10 - i*2;
			System.out.println(arData2[i]);
		}
		
		System.out.println("===================");
		
//		1~100까지 배열에 담은 후 홀수만 출력
		
		// 1~100 까지 배열에 담고, 조건식으로 나머지 1일 경우 출력.
		int arData3[] = new int [100];
		
		for (int i = 0; i < arData3.length; i++) {
			
			if(i%2 == 1) {
				arData3[i] = i;
				System.out.println(arData3[i]);
			}
	
		}
		
		System.out.println("===================");
		
//		실버
//		1~100까지 배열에 담은 후 짝수의 합 출력
		int total = 0;
		
		for (int i = 0; i < arData3.length; i++) {
			if(i%2 == 0) {
				arData3[i] = i+2;
				total += arData3[i];
			}
		}
		System.out.println(total);
		
		System.out.println("===================");
		
//		A~F까지 배열에 담고 출력
		
		int arData4[] = new int[6];
		
		for (int i = 0; i < arData4.length; i++) {
			arData4[i] = i +65;
			System.out.println((char)arData4[i]);
		}
		
		System.out.println("===================");
		
//		A~F까지 중 C제외하고 배열에 담은 후 출력
			
		for (int i = 0; i < arData4.length; i++) {
			if(i == 2){continue;}
			arData4[i] = i +65;
			System.out.println((char)arData4[i]);
		}
		
		System.out.println("===================");
		
//		골드
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		
//		Scanner sc = new Scanner(System.in);
//		
//		String max = "최대값 = ", min = "최소값 = ";
//		
//		int arNum[] = new int [5];
//		
//		System.out.println("5개의 정수를 입력하시오.");
//		
//		
//
//		for (int i = 0; i < arNum.length; i++) {
//			arNum[i] = sc.nextInt();
//			}
		
		
		
		
		
//		다이아
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		
//		int total2 = 0;
//		int[] arData5 = null;
//		String message = "만드실 배열에 개수를 입력하시오.", 
//				message2 = "안에 넣을 정수를 입력하시오.", 
//				result = "입력하신 정수의 평균 = ";
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
		
		
		
		























