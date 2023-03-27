package ch02;

public class MyHouse {

	public static void main(String[] args) {
		Mixer mixer = new Mixer();
		Adapter adapterMixer = new Adapter(mixer);
		connect(adapterMixer);
		adapterMixer.connect();
		
		Toaster toaster = new Toaster();
		toaster.connect();
	}
	
	public static void connect(IElectronic220v iElectronic220v) {
		iElectronic220v.connect();
	}

}
