package ch02;

// @FunctionalInterface : 인터페이스의 추상메서드가 반드시 하나여야 한다.
@FunctionalInterface
public interface IMaxNumber {
	int getMax(int a, int b);
//	int getMax(int a, int b, int c);
}
