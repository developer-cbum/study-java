package operTest;

import java.util.Iterator;

public class Oper6 {

	public static void main(String[] args) {

		// 1 ~ 10까지 중 8까지만 출력
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
			if(i ==7) {
				break;
			}
		}

		// 1 ~ 10까지 중 4를 제외하고 출력
		// continue는 밑에 코드가 있을때 사용 코드쓰고 맨 밑에 continue하면 의미가 없다.
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i + 1);
		}
		
		
		
	}

}
