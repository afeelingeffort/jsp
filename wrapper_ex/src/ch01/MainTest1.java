package ch01;

public class MainTest1 {

	// main 함수
	public static void main(String[] args) {

		// 래퍼 클래스
		Integer num = new Integer(20); // 박싱
		// int n = num; // 자동 언박싱(오토박싱) -- (언박싱)
		int n = num.intValue(); // 언박싱

		System.out.println("n : " + n);
		System.out.println("---------------------------");

		Integer num2 = 30; // 자동 박싱 - 기본 데이터 타입에서 래퍼로 감싸니까
		int result = num2; // 자동 언박싱
		System.out.println("result : " + result);

	} // end of main

} // end of class
