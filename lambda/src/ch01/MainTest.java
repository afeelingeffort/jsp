package ch01;

/*
 * 람다식 (Lamda Expression)
 * 
 * 함수형 프로그래밍 방식
 * : 자바 8부터 함수형 프로그래밍 방식을 지원하고 이를 람다식이라고 한다.
 * 
 * 함수형 프로그래밍이란 (FP : Functional Programming)
 * 함수를 기반으로 하는 프로그래밍 입력 방식이고 매개변수로 전달 받는 입력 외에
 * 외부 자료(데이터)를 사용하지 않아 여러 자료가 동시에 수행되는 병렬처리 가능한 코딩 방식
 * 
 * 순수 함수를 구현하고 호출함으로써 외부 자료에 부수적인 영향(side effect)를 주지 않도록 구현하는 방식
 * 
 * 익명 함수 --> 컴파일러가 타입 추론이 가능하기 때문에 코드를 줄여서 사용할 수 있는 개념으로 발전됨.
 * 
 * 람다식 : () -> {System.out.println("람다식");};
 * (x) -> {System.out.println(x + "<<<");}; 
 * x -> {}; - 매개변수가 하나면 ()를 생략할 수 있다.
 * x -> System.out.println(); - 구현부가 한 줄이라면 {}를 생략할 수 있다.
 * 
 * !!! 람다식을 사용하기 위해서는 반드시 선행되어야 할 부분은 
 * 인터페이스가 먼저 만들어져 있어야 한다. !!!
 * 
 * */

// 추상메서드에 반환타입이 있는 경우 구현부에 return
// 추상메서드가 void인 경우 return X
public class MainTest {

	// main 함수
	public static void main(String[] args) {

		// int add(int x, int y);
		
		// 1. 인터페이스가 있고
		// 2. 어떻게 구현될지 식을 재정의 한다. (람다식으로)
		// 인터페이스명.추상메서드명(매개변수);
		IAdd iAdd = (x, y) -> {return x + y;};
		
		System.out.println(iAdd.cal(10, 10));
		System.out.println("--------------");
		
		//람다식 정의
		IPrint iPrint = (str, token) -> { System.out.println( str + ":" + token);};
		//람다식 활용
		iPrint.myPrint("람", "다");
		System.out.println("--------------");
		
		IPrint2 iPrint2 = () -> {return "람다"; };
		String tmp = iPrint2.print();
		System.out.println(tmp);
		
		// 람다식을 만들기 위해서 선행 조건 및 실행 순서
		// 1. 인터페이스가 있어야 한다.
		// 2. 인터페이스 안에는 반드시 하나의 추상 메서드만 존재해야 한다.
		// 3. 1, 2 조건을 만족한다면 우리가 필요한 식을 정의할 수 있다.
		// 4. 3번에서 람다식을 정의하였다면 식을 정의할 때 사용한 인터페이스 타입을
		//    이용하고 그 안에 추상 메서드 이름을 사용해서 호출해 사용할 수 있다.
		
//		new Thread(()->{}).start();
	} // end of main

} // end of class

// 람다 표현식 만들기 인터페이스 먼저 정의되어야 한다. !!!!!!!!!
// 주의점 2, 함수형 인터페이스라고 한다. (단, 인터페이스 안에 추상메서드는 반드시 한개이어야 한다.)
// !!! 단 하나의 추상메서드 !!! 
interface IPrint{
	void myPrint(String str, String token);
}

interface IPrint2{
	String print();
}