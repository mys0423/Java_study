package abstractTest;

public abstract class Electronics {
//	상수
	final int DATA_TEST = 10;
	
//	추상 메서드
	public abstract void on();
	public abstract void off();
	
//	일반 메서드
	public void test() {
		System.out.println("일반 메서드");
	}
}
