package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		
		// LocalDate, LocalDateTime �ǹ����� ���� ���� ����.
		
//		LocalDate localDate = LocalDate.parse("2025-05-04");
		LocalDate localDate = LocalDate.parse("2025/05/04".replace("/","-"));
		System.out.println(localDate);
		
		
		
		// LocalDateTime�� ����Ͻú���
		LocalDateTime localDateTime = LocalDateTime.of(2010, 4, 5, 10, 0);
		String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� HH�� mm�� ss��"));
		System.out.println(format);
		
		// time ��Ű��
		// L LocalDate ����ϸ�.
		LocalDate localDate1 = LocalDate.of(2023, 2, 6);
		System.out.println(localDate1);
		
		String format1 = localDate.format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd��"));
		System.out.println(format1);
		
		
		System.out.println(localDate.getMonthValue());
		
		// �ǹ����� ����.!!
		// util ��Ű��
		// ������ SimpleDateFormat �������� ����.
//		SimpleDateFormat format = new SimpleDateFormat("yyyy�� MM�� dd�� HH:mm:ss");
		
		// Ķ������ �ֽ� �޷¿� �°� new�� ������� �ʴ´�.
//		Calendar calendar = Calendar.getInstance();
//		System.out.println(format.format(calendar.getTime()));	
		
		// Date
		Date date = new Date();	
		
		
		//date �Ⱦ��°�
		// 1��~12���� 0��~11���� �ٲ� �Ⱦ�.
//		System.out.println(date.getMonth());
		
//		// ���ϴ� ���Ŀ� �°� �� �����ϴ� �� ����
//		System.out.println(date);
//		System.out.println(format.format(date));
//		try {
//			date = format.parse("2024�� 06�� 12�� 10:00:11");
//			System.out.println(date);
//		} catch (ParseException e) {;}
		
		
		  LocalTime now = LocalTime.now();
		  System.out.println(now);
		  
		  // ���� �����ϱ�
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH��mm��ss��");
	 
	        // ���� �����ϱ�
	        String formatedNow = now.format(formatter);
	 
	        // ���� ����� ���� �ð� ���
	        System.out.println(formatedNow);  // 06�� 20�� 57��


	}

}