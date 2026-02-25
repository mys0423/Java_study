package interfaceTask1;

public class Student extends HumanActionAdapter {
	public Student() {;}
	public Student(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eat() {
		System.out.println("학생의 먹기");
	}
	
	@Override
	public void goSchool() {
		System.out.println("등교하기");
	}
}
