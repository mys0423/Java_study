package operTask;

import java.util.Scanner;

public class OperTask02 {
	public static void main(String[] args) {
//		삼항 연산자
//		각각 사용자에게 동물을 입력 받고,
//		해당 동물에 해당되는 메세지를 출력하세요.
//		운명의 동물 찾기
//		사용자가 입력한 값에 따라 다른 결과를 출력하시오.
//		1. 고양이
//		고양이를 좋아하는 당신은 대훈이의 러버입니다.
//		2. 소
//		소를 좋아하는 당신은 세종이의 단짝입니다.
//		3. 강아지
//		강아지를 좋아하는 당신은 민균이의 짝사랑입니다.
//		4. 고라니
//		고라니를 좋아하는 당신은 미쳤습니다.
		String message = "동물을 입력하세요\n"
				+ "ex)\n"
				+ "고양이\n"
				+ "소\n"
				+ "강아지\n"
				+ "고라니",
				animal = null, result = "";
		Scanner sc = new Scanner(System.in);
		boolean isCat = false, isCow = false, isDog = false, isGorani = false;
		
		System.out.println(message);
		animal = sc.next();
		
		isCat = animal.equals("고양이");
		isCow = animal.equals("소");
		isDog = animal.equals("강아지");
		isGorani = animal.equals("고라니");
		
		result = isCat ? "고양이를 좋아하는 당신은 대훈이의 러버입니다."
				: isCow ? "소를 좋아하는 당신은 세종이의 단짝입니다."
						: isDog ? "강아지를 좋아하는 당신은 민균이의 짝사랑입니다."
								: isGorani ? "고라니를 좋아하는 당신은 미쳤습니다." 
										: "잘못 입력하셨습니다.";
		
		System.out.println(result);

	}
}












