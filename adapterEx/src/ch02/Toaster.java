package ch02;

public class Toaster implements IElectronic220v{

	@Override
	public void connect() {
		System.out.println("토스터 220V ON");
	}

}
