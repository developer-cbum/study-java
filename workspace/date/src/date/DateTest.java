package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		
		// LocalDate, LocalDateTime 실무에서 많이 쓴다 연습.
		
//		LocalDate localDate = LocalDate.parse("2025-05-04");
		LocalDate localDate = LocalDate.parse("2025/05/04".replace("/","-"));
		System.out.println(localDate);
		
		
		
		// LocalDateTime은 년월일시분초
		LocalDateTime localDateTime = LocalDateTime.of(2010, 4, 5, 10, 0);
		String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
		System.out.println(format);
		
		// time 패키지
		// L LocalDate 년월일만.
		LocalDate localDate1 = LocalDate.of(2023, 2, 6);
		System.out.println(localDate1);
		
		String format1 = localDate.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
		System.out.println(format1);
		
		
		System.out.println(localDate.getMonthValue());
		
		// 실무에서 쓴다.!!
		// util 패키지
		// 형식은 SimpleDateFormat 참고에서 쓴다.
//		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		
		// 캘린더는 최신 달력에 맞게 new를 사용하지 않는다.
//		Calendar calendar = Calendar.getInstance();
//		System.out.println(format.format(calendar.getTime()));	
		
		// Date
		Date date = new Date();	
		
		
		//date 안쓰는거
		// 1월~12월을 0월~11월로 바뀜 안씀.
//		System.out.println(date.getMonth());
		
//		// 원하는 형식에 맞게 끔 수정하는 걸 연습
//		System.out.println(date);
//		System.out.println(format.format(date));
//		try {
//			date = format.parse("2024년 06월 12일 10:00:11");
//			System.out.println(date);
//		} catch (ParseException e) {;}
		
		
		  LocalTime now = LocalTime.now();
		  System.out.println(now);
		  
		  // 포맷 정의하기
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시mm분ss초");
	 
	        // 포맷 적용하기
	        String formatedNow = now.format(formatter);
	 
	        // 포맷 적용된 현재 시간 출력
	        System.out.println(formatedNow);  // 06시 20분 57초


	}

}
