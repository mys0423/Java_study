package classTask;

import java.util.Scanner;

// 슈퍼카(SuperCar) 클래스 생성
// 브랜드, 색상, 가격, 엔진(boolean), 비밀번호, 비밀번호의 오류횟수, 엔진을 킴, 엔진을 끔
class SuperCar {
	String brand;
	String color;
	int price;
	boolean engine;
	String password;
	int errorCount;
	
	public SuperCar() {;}
	
	public SuperCar(String brand, String color, int price, String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	}
	
	void passwordCheck(String pw) {
		if(this.password.equals(pw)) {
			this.errorCount = 0;
			this.engine = true;
			System.out.println("엔진 킴! 고고씽!");
		}else {
			this.errorCount += 1;
			this.engine = false;
			System.out.printf("비밀번호 오류, 비밀번호가 %d회 틀렸습니다.", this.errorCount);
			if(this.errorCount >= 3) {
				System.out.println("차량 잠금, 경찰 출동 얌전히 기다리십시오. 곧 잡으러 갑니다.");
			}
		}
	}	
}

public class ClassTask2 {
   public static void main(String[] args) {
//   1. 슈퍼차 객체화
//   2. 비밀번호를 입력, 비밀번호가 일치한다면 엔진의 시동 여부를 제어(킴 or 끔)
//   3. 비밀번호 3회 오류시 경찰 출동
	   SuperCar temerario = new SuperCar("Lamborghini", "blue", 473_000_000, "1234");
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("비밀번호를 입력하세요: ");
	   String input = sc.next();
	   
	   while(temerario.errorCount < 3) {
		   temerario.passwordCheck(input);
		   if(temerario.engine) {
			   break;
		   }
	   }
   }

}