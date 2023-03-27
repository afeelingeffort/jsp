package ch01;

// DBHelper 쓸 때 썼던 방식으로 하면 됨
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	public void say() {
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		Singleton.getInstance().say();
	}
}
