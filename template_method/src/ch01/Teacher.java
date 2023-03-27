package ch01;

abstract class Teacher {
	
	public void start_class() {
		inside();
		attendance();
		outside();
		teach();
	}

	private void inside() {
		System.out.println("선생님이 강의실로 들어온다.");
	}

	private void attendance() {
		System.out.println("선생님이 출석을 부른다.");
	}


	private void outside() {
		System.out.println("선생님이 강의실을 나간다.");
	}
	
	abstract void teach();
}

class Korean_Teacher extends Teacher{

	@Override
	void teach() {
		System.out.println("국어를 수업합니다.");
	}
	
}

class Math_Teacher extends Teacher{
	
	public void teach() {
		System.out.println("수학을 수업합니다.");
	}
}

class English_Teacher extends Teacher{
	
	public void teach() {
		System.out.println("영어를 수업합니다.");
	}
}