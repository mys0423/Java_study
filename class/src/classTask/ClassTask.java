package classTask;

// 1. 스포츠(Sports) 추상화
// 2. 농구(BasketBall), 야구(BaseBall), 축구(Soccer) 객체 
// 3. 기본 생성자, 초기화 생성자 생성 후 초기화
class Sports{
	int number;
	String name;

//	기본 생성자
	public Sports() {;}
	
//	초기화 생성자 Shift + Alt + S -> O
	public Sports(int number, String name) {
		this.number = number;
		this.name = name;
	}
}

public class ClassTask {
	public static void main(String[] args) {
		Sports basketball = new Sports(5, "농구");
		Sports baseball = new Sports(9, "야구");
		Sports soccer = new Sports(11, "축구");
		
		System.out.println(soccer.name);
		System.out.println(basketball.number);
		System.out.println(baseball);
	}
}