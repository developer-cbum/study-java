package methodTest;

public class MethodTask {
	
	void numPrint() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}
	
	void hongPrint(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("홍길동");
		}
	}
	
	void namePrint(String name, int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(name);
		}
	}
	
	int subtract(int num1, int num2, int num3) {
		
		return num1 - num2 - num3;
	}
	
	
	int[] divide(int num1, int num2) {
		
		int[] result = null;
		
		if(num2 != 0) {
			result = new int[2];
			result[0] = num1 / num2;
			result[1] = num1 % num2;
		}
		
		return result;

	}
	
	void numPlus (int num) {
		
		int result = 0;
		
		for (int i = 0; i < num; i++) {
			result += i+1;
		}
		
		System.out.println(result);
	}
	
	void change(int num) {
		if(num%2 == 0) {
			System.out.println(num + 1);
		}else {
			System.out.println(num + 1);
		}
	}
	
	
	void charChange (String word) {
		

	}
	
	void eaString(String message) {
		System.out.println(message.length() + "개");
	}
	
	
	// 5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	
	int[] getMaxAndMin (int[] arData) {
		
		int[] result = new int[2];
		
		result[0] = arData[0];
		result[1] = arData[0];
		
		for (int i = 0; i < result.length; i++) {
			if(result[0] < arData[i]) {result[0] = arData[i];}
			else if(result[0] > arData[i]) {result[1] = arData[i];}
		}
		
		return result;
	}
	
	
	

	public static void main(String[] args) {

		MethodTask mt = new MethodTask();
		
		// 1~10까지 println()으로 출력하는 메소드
			mt.numPrint();
		
		// "홍길동"을 n번 println()으로 출력하는 메소드
			mt.hongPrint(10);
			
		// 이름을 n번 println()으로 출력하는 메소드
			mt.namePrint("이종문", 2);
			
		// 세 정수를 뺄셈해주는 메소드
			mt.subtract(1, 2, 3);
			
		// 두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
			
			
			
			
		// 1 ~ n 까지의 합을 구해주는 메소드
			mt.numPlus(4);
			
		// 홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
			mt.change(4);
			
		// 문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
		
			
			
		// 문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
			mt.eaString("이종문");
			
			
		// 5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
		// 한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
		// 5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
			

			
			
		// 5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드 (void)
		// indexof() 만들기
		
		
	}

}
