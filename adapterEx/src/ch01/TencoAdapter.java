package ch01;

/*
 * 
 * 어댑터 패턴 설정
 * 인터페이스로 선언하면 코드를 유연하게 설계 가능
 * 
 * */
//기존에 연결해야할 인터페이스를 구현하고
public class TencoAdapter implements IElectronic220v {

	// 변환해야 할 인터페이스를 선언해 생성자를 매개변수로 넣어서 연결하기
	IElectronic110v iElectronic110v;

	public TencoAdapter(IElectronic110v iElectronic110v) {
		this.iElectronic110v = iElectronic110v;
	}

	@Override
	public void connect() {
		iElectronic110v.connect();
	}

}
