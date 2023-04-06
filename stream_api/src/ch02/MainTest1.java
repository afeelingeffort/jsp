package ch02;

import java.util.ArrayList;
import java.util.List;

public class MainTest1 {

	// main 함수
	public static void main(String[] args) {

		// 자료구조 스트림 API 사용해보기
		List<String> sList = new ArrayList<>();
		sList.add("홍길동");
		sList.add("이순신");
		sList.add("티모");
		
		long count = sList.stream().count();
		System.out.print(count);
		System.out.println();
		System.out.println("---------------------");
		
		sList.stream().map(s -> s.length()).forEach(s -> System.out.print(s + " "));
		System.out.println();
		System.out.println("---------------------");
		
		sList.stream().sorted().forEach(s -> System.out.println(s + " "));
		System.out.println();
		System.out.println("---------------------");
		
	} // end of main

} // end of class
