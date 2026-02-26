package objectTest;

public class ObjectTest {
//	1.private
	private String name;
	
//	2. 기본 생성자
	public ObjectTest() {;}

//	3. 초기화 생성자
	public ObjectTest(String name) {
		super();
		this.name = name;
	}	
	
//	4. getter
//	5. setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ObjectTest [name=" + name + "]";
	}
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		System.out.println(ot);
		System.out.println(ot.toString());
		
		User user1 = new User(1L, "홍길동");
		
		if(user1.equals(new User(1L, "홍길동")) ) {
			System.out.println("책 대여 완료!");
		}else {
			System.out.println("도난 신고");
		}
	}


}
