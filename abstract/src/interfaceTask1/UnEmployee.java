package interfaceTask1;

public class UnEmployee extends HumanActionAdapter {
	public UnEmployee() {;}
	public UnEmployee(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("백수의 먹기");
	}
}
