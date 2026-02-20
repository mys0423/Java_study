package inheritanceTask;
//   상속 및 분리 실습
  
//   PersonTask
//   이름, 나이, 주소, 핸드폰
//   각 메서드 출력
//   work 일을 한다
//   sleep 잠을 잔다
//   eat 세 끼를 먹는다
class PersonTask {
	String name;
	int age;
	String address;
	String phone;
	
	public PersonTask() {;}
	public PersonTask(String name, int age, String address, String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
	void work() {
		System.out.println("일을 한다.");
	}
	
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	
	void eat() {
		System.out.println("세 끼를 먹는다.");
	}
}

//   StudentTask
//   인스타아이디
//   각 메서드 출력
//   work 아르바이트를 한다
//   sleep 수업 시간에 잠을 잔다
//   eat 아침을 거른다
class StudentTask extends PersonTask {
	String instarId;
	
	public StudentTask() {;}
	public StudentTask(String name, int age, String address, String phone, String instarId) {
		super(name, age, address, phone);
		this.instarId = instarId;
	}


	@Override
	void work() {
		System.out.println("아르바이트를 한다.");
	}
	
	@Override
	void sleep() {
		System.out.println("수업 시간에 잠을 잔다.");
	}
	
	@Override
	void eat() {
		System.out.println("아침을 거른다.");
	}
}

//   EmployeeTask
//   비상금
//   각 메서드 출력
//   work 하루 종일 일을 한다
//   sleep 잠을 설친다
//   eat 야식을 먹는다
class EmployeeTask extends PersonTask {
	int secretMoney;
	
	public EmployeeTask() {;}
	public EmployeeTask(String name, int age, String address, String phone, int secretMoney) {
		super(name, age, address, phone);
		this.secretMoney = secretMoney;
	}
	
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다.");
	}
	
	@Override
	void sleep() {
		System.out.println("잠을 설친다.");
	}
	
	@Override
	void eat() {
		System.out.println("야식을 먹는다.");
	}
}
//   InhertanceTask에서
//   사람, 학생, 직장인 객체화 후 각 메서드 출력하기

public class InheritanceTask {
   public static void main(String[] args) {
      PersonTask person = new PersonTask("문윤성", 26, "남양주시", "010-2824-9278");
      StudentTask student = new StudentTask("김현태", 26, "대구", "010-1234-5678", "@1234");
      EmployeeTask employee = new EmployeeTask("안진호", 27, "광명시", "010-9876-5432", 100);
      
      person.work();
      student.work();
      employee.work();
   }
}
