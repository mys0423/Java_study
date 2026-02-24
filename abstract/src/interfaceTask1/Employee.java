package interfaceTask1;

public class Employee extends HumanActionAdapter {
	public Employee() {;}
	public Employee(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eat() {
		System.out.println("회사원의 먹기");
	}
	
	@Override
	public void goCompany() {
		System.out.println("회사가기");
	}
}
