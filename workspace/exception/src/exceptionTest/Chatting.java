package exceptionTest;

import java.util.Scanner;

public class Chatting {
	
	public static void main(String[] args) {
		
		
//		System.out.println("안              녕".replaceAll(" ", ""));
//		System.out.println("    안     녕    ".trim().replace(" ", ""));
		
		
		Scanner sc = new Scanner(System.in);
		String message = null, answer = "";
		
		System.out.println("메세지: ");
		message = sc.nextLine();
		
		if(message.equals("바보")) {
			//예외발생.
			// 직접 만든 오류 메세지..
			// RuntimeException 를 상속받으면 강제종료
				try {
					throw new BadWordException("비속어는 사용할 수 없습니다");
				} catch (BadWordException e) {
					for (int i = 0; i < message.length(); i++) {
						answer += "*";
					}
					System.out.println(answer);
				}
		}
		
		
	}

}
