package operTest;

import java.util.Scanner;

public class Oper4 {
   public static void main(String[] args) {
//      심리 테스트
//      
//      Q. 당신이 좋아하는 색을 선택하세요.
//      1. 빨간색
//      2. 노란색
//      3. 검은색
//      4. 흰색
//      
//      빨간색 : 불같고 열정적이고 적극적이다.
//      노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//      검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//      흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
	   
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
	   
	   result = choice == 1 ? red
			   : choice == 2 ? yellow 
					   : choice == 3 ? black 
							   : choice == 4 ? white
									   : error;
 	   
	   System.out.println(result);
	   
   }
}
