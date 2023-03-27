package ch02;

public class Adapter implements IElectronic220v{

	IElectronic110v iElectronic110v;

	public Adapter(IElectronic110v iElectronic110v) {
		this.iElectronic110v = iElectronic110v;
	}
	
	@Override
	public void connect() {
		iElectronic110v.connect();
	}
	
}
