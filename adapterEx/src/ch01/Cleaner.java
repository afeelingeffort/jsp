package ch01;

public class Cleaner implements IElectronic220v{

	//전기를 연결하다.
	@Override
	public void connect() {
		System.out.println("청소기 연결 220V ON");
	}
	
	
}
