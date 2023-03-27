package ch01;

public class MainTest {

	public static void main(String[] args) {
		Korean_Teacher kr = new Korean_Teacher();
		Math_Teacher mt = new Math_Teacher();
		English_Teacher en = new English_Teacher();
		
		kr.start_class();
		System.out.println("--------------");
		mt.start_class();
		System.out.println("--------------");
		en.start_class();
	}

}
