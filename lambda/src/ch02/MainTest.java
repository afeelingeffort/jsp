package ch02;

public class MainTest {

	// main 함수
	public static void main(String[] args) {

		// 익명 구현 클래스
		IMaxNumber maxInt = new IMaxNumber() {

			@Override
			public int getMax(int a, int b) {
				
				if (a > b) {
					return a;
				}
				return b;
				
			}
		};

		IMaxNumber lambdaMaxInt = (a, b) -> {return a > b ? a : b;};
		System.out.println(lambdaMaxInt.getMax(50, 100));

	} // end of main

} // end of class

class MaxNumber implements IMaxNumber{

	@Override
	public int getMax(int a, int b) {
		
		return 0;
	}
	
	
}