package abstractTest;

public class WashingMachine extends Electronics {
	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("음성 인식으로 끔");
	}
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("음성 인식으로 켬");
	}
}
