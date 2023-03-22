package ch01;

public class MainTest2 {

	// main 함수
	public static void main(String[] args) {

		// 문자열 데이터 타입에서 기본 데이터 타입으로 변환하는 방법을 알아야 한다.
		// 래퍼 클래스란 개념을 알고 있으면 된다.
		// 래퍼클래스.parse데이터타입();

		String str = "-128";
		String str2 = "10.5";
		String str3 = "true";
		String str4 = "3";

		byte b = Byte.parseByte(str); // -128 ~ 127
		System.out.println("byte b : " + b);

		int i = Integer.parseInt(str);
		double d = Double.parseDouble(str2);
		boolean bool = Boolean.parseBoolean(str3);
		float f = Float.parseFloat(str4);
		long l = Long.parseLong(str4);

		System.out.println(i);
		System.out.println(d);
		System.out.println(!bool);
		System.out.println(f);
		System.out.println(l);

	} // end of main

}
