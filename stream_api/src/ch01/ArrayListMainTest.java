package ch01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListMainTest {

	// main 함수
	public static void main(String[] args) {

		// 자료 구조라면 스트림을 생성할 수 있다 !!
		// 스트림은 최종연산만 할 수도 있고
		// 스트림은 중간연산 + 최종연산을 할 수도 있다.
		// 최종연산 : sum(), count(), forEach();

		// 중간연산 : map, filter, sorted는 중간연산이다. map -> 데이터형 바꿈.

		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");

		// 자료 -> 스트림 생성
		Stream<String> stream = sList.stream();

		// 최종연산
		// 최종연산과 중간연산의 구현은 람다식을 활용한다.
		// 코드의 양을 줄일 수 있고 가독성을 높일 수 있다.
		stream.forEach(s -> {System.out.print(s + " ");});
		System.out.println();
		System.out.println("---------------------");
		
		// 중간연산 + 최종연산 - 중간 연산은 최종 연산이 호출되어야 진행된다.
		sList.stream().sorted().forEach(s -> {System.out.print(s + " ");});
		System.out.println();
		System.out.println("---------------------");
		
		// 중간연산(람다 활용) + 최종연산 : map
		// 자료구조 (Tomas Edward Jack) 값을 map으로 바꿈 -> 최종연산
		sList.stream().map( s -> s.length() )
		.forEach(s -> System.out.print(s + " : 글자 개수 확인 " + "\n"));
		
		// 중간연산(filter) + 최종연산(forEach)
		sList.stream().filter(s -> s.length() >=5 ).forEach(s -> System.out.print(s));
		
	} // end of main

} // end of class
