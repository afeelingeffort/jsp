package ch01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	// main 함수
	public static void main(String[] args) {

		// 1. 배열과 + Stream
		int[] arr = { 1, 2, 3, 4, 5 }; // 배열 선언과 동시에 초기화

		// 원래 for문 사용과 변수를 활용해서 연산처리 했음.
		int sumVal = Arrays.stream(arr).sum(); // sum 결과를 반환하는 최종 연산
		System.out.println("sumVal : " + sumVal);

		// 배열의 길이
		long count = Arrays.stream(arr).count();
		System.out.println("count : " + count);
		
	} // end of main

} // end of class
