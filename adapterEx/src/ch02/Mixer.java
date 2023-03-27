package ch02;

public class Mixer implements IElectronic110v{

	@Override
	public void connect() {
		System.out.println("믹서기 110V ON");
	}

}
