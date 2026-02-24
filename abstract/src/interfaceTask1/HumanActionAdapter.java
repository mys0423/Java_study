package interfaceTask1;

public class HumanActionAdapter extends Human implements HumanAction {
	public HumanActionAdapter() {;}
	public HumanActionAdapter(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eat() {;}
	
	@Override
	public void goCompany() {;}
	
	@Override
	public void goSchool() {;}
}
