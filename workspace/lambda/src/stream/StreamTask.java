package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;


public class StreamTask {
	
	public int change(int number) {
		return 10-number;
	}
	
	public boolean checkFirst(String temp) {
		return (int)temp.charAt(0) >= 65;
	}
	
	   public static int changeToInteger(int c) {
		      return c - 48;
		   }
	
	
   public static void main(String[] args) {
	   
	   ArrayList<Integer> datas = new ArrayList<Integer>();
	   ArrayList<Integer> datas1 = new ArrayList<Integer>();
	   String data = "ABCDEF";
	   ArrayList<Integer> datas3 = new ArrayList<Integer>();
	   ArrayList<Integer> datas4 = new ArrayList<Integer>();
	   ArrayList<Character> datas5 = new ArrayList<Character>(Arrays.asList('A','B','C','D','E','F'));
	   ArrayList<Character> datas51 = new ArrayList<Character>();
	   ArrayList<String> datas6 = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
	   ArrayList<String> datas7 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
	   ArrayList<String> datas8 = new ArrayList<String>(Arrays.asList("1024"));
	   ArrayList<Integer> datas9 = new ArrayList<Integer>();
	   ArrayList<Integer> datas10 = new ArrayList<Integer>(Arrays.asList(1024));
	   ArrayList<String> datas11 = new ArrayList<String>();
	   
//      10~1까지 ArrayList에 담고 출력
	   StreamTask streamTask = new StreamTask();
	   IntStream.range(0, 10).map(streamTask :: change).forEach(datas :: add);
	   System.out.println(datas);
	   
//      1~10까지 ArrayList에 담고 출력
	   IntStream.range(1, 11).forEach(datas1 :: add);
	   System.out.println(datas1);
	   
//      ABCDEF를 각 문자별로 출력
	   data.chars().forEach(c -> System.out.println((char)c));
	  
//      1~100까지 중 홀수만 ArrayList에 담고 출력
	   
	   IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 1).forEach(datas3 :: add);
	   System.out.println(datas3);
	   
//      1~100까지 중 짝수만 ArrayList에 담고 출력
	   
	   IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).forEach(datas4 :: add);
	   System.out.println(datas4);
	   
//      A~F까지 중 D제외하고 ArrayList에 담고 출력
	   
//	   datas5.stream().filter(n -> n != (char)68).forEach(System.out::println);
	   datas5.stream().filter(n -> n != (char)68).forEach(datas51 :: add);
	   System.out.println(datas51);
	   
//      5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase() 사용
	   
//	   datas6.stream().map(n -> n.toLowerCase()).forEach(System.out::println);
	   datas6.stream().map(String :: toLowerCase).forEach(System.out::println);
	   
//      Apple, banana, Melon 중 첫 번째 문자가 대문자인 문자열 출력
//	   datas7.stream().filter(n -> ((int)n.charAt(0)) < 97).forEach(System.out::println);
	   datas7.stream().filter(n -> (n.charAt(0)) <= 'Z')
	   .filter(n -> (n.charAt(0)) >= 'A').forEach(System.out::println);
	   
//     한글을 정수로 변경
//     String hangle = "공일이삼사오육칠팔구";
//     String input = "일공이사";
//     input.chars().map(hangle::indexOf).forEach(System.out::print);
     
     
//     정수를 한글로 변경 "1024" -> '1' - 48 = 1
//     String hangle = "공일이삼사오육칠팔구";
//     String input = "1024";
//     input.chars().map(StreamTask::changeToInteger).forEach(i -> System.out.print(hangle.charAt(i)));


   }
}