package ch01;

public class WashingMachine implements IElectronic110v{

	@Override
	public void connect() {
		System.out.println("세탁기 연결 110V ON");
	}

}
