package inputTask;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] args) {
		// 사용자가 입력한 정수 또는 실수의 값이
		// 정수인지 실수인지 확인 후 출력하는 로직을 구현하세요.
		//      출력 예시)
		//      10 -> 정수
		//      10.5 -> 실수
		//      10.0 -> 실수
		Scanner sc = new Scanner(System.in);
		String message = "숫자를 입력하세요.";
		
		System.out.println(message);
		String data = sc.next();
		System.out.println(data.indexOf(".") > 0 ? data + " -> 실수" : data + " -> 정수");
	}
}
