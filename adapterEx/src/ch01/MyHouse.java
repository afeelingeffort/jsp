package ch01;

public class MyHouse {

	// main 함수
	public static void main(String[] args) {
		AirConditional airConditional = new AirConditional();
		Cleaner cleaner = new Cleaner();
		HairDryer hairDryer = new HairDryer();
		WashingMachine washingMachine = new WashingMachine();
		
		// 인터페이스와 다형성
		connect(airConditional);
		connect(cleaner);

		// 철물점에서 어댑터 준비
		TencoAdapter adapterHairDryer = new TencoAdapter(hairDryer);
		connect(adapterHairDryer);
		
		TencoAdapter adapterWashingMachine = new TencoAdapter(washingMachine);
		connect(adapterWashingMachine);

	} // end of main

	// MyHouse static
	// 전기 콘센트
	public static void connect(IElectronic220v iElectronic220v) {
		iElectronic220v.connect();
	}

} // end of class
