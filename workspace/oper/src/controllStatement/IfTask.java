package controllStatement;

import java.util.Scanner;

public class IfTask {

	public static void main(String[] args) {

	   
	   Scanner sc = new Scanner(System.in);
	   
	   String massage = "당신이 좋아하는 색을 선택하세요", question = "1. 빨간색, 2. 노란색, 3. 검은색, 4. 흰색";
	   int choice = 0;
	   String result = null,
			   red = "빨간색 : 불같고 열정적이고 적극적이다.", 
			   yellow = "노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.",
			   black = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다.", 
			   white ="천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.",
			   error ="잘못입력하였습니다.";
	   
	   
	   System.out.println(massage);
	   System.out.println(question);
	   
	   choice = sc.nextInt();
	   
	   if(choice == 1) {
		   result = red;
		   
	   }else if(choice == 2) {
		   result = yellow;
		
	   }else if(choice == 3) {
		   result = black;
		   
	   }else if(choice == 4) {
		   result = white;
		   
	   }else {
		   result = error;
	   }

	   System.out.println(result);
	   
   
		
	}

}
