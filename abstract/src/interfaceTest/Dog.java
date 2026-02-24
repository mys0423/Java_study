package interfaceTest;

public class Dog implements Pet {
	@Override
	public void poop() {
		// TODO Auto-generated method stub
		System.out.println("배변 훈련");
	}
	
	@Override
	public void sitDown() {
		// TODO Auto-generated method stub
		System.out.println("앉아");
	}
	
	@Override
	public void waitNow() {
		// TODO Auto-generated method stub  
		System.out.println("기다려");
	}
}
