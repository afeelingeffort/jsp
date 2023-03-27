package ex01;

public class MainTest {

	// main 함수
	public static void main(String[] args) {
		IMulNumber iMulNumber = (a, b)->{return a * b;};
		int result = iMulNumber.multipleNum(3, 3);
		System.out.println(result);
		
		new Thread(()->{
			while(true) {
				
				IMulNumber iMulNumber2 = (a, b)->{return a * b;};
				System.out.println(iMulNumber2.multipleNum(3, 3));
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		
		new Thread(()->{
			
			while(true) {
				IAddPrint iAddPrint = ()->{System.out.println("ㅇ");};
				iAddPrint.addPrint();
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		IAddPrint iAddPrint = ()->{System.out.println("ㅇ");};
		iAddPrint.addPrint();
	} // end of main

}

interface IAddPrint{
	void addPrint();
}
