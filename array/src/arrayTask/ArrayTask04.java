package arrayTask;

import java.util.Scanner;

public class ArrayTask04 {
	public static void main(String[] args) {
//      다이아
//      1. 계산기 만들기
//      사용자의 수식의 결과 값을 출력하는 계산기를 만드세요.
//      입력 예시1)
//      10 + 7 + 9
//      출력 예시1)
//      26
      
//      입력 예시2)
//      -7 + 8 + 11
//      출력 예시2)
//      12

//      힌트) 문자열의 메서드 .split()은 구분점으로 잘라 배열로 리턴하는 메서드이다.
//      자바에서는 구분점을 여러 개 전달할 수 있으며 여러개를 전달할 때에는 | 연산자를 이용한다
//      예를 들어 +, -를 구분점으로 자른다면 .split(\\+|\\-)로 전달해야한다.
//      \\는 제어문자가 아닌 문자열로 인식하기 위함이다.
     	System.out.println("다이아1");
     	Scanner sc = new Scanner(System.in);
     	String input = sc.nextLine().replace(" ", "");
     	String[] arr = input.split("\\+|\\-|\\*|\\/");
     	char[] fours = new char[arr.length - 1];
     	int result = Integer.parseInt(arr[0]);
     	int index = 0;
     	
     	for(int i = 0; i < input.length(); i++) {
     		char c = input.charAt(i);
     		if(c == '+' || c == '-' || c == '*' || c == '/') {
     			fours[index] = c;
     			index++;
     		}else if(i == 0) {
     			continue;
     		}
     	}
     	
     	for(int i = 0; i < fours.length; i++) {
     		int nextNum = Integer.parseInt(arr[i + 1]);
     		
     		if (fours[i] == '+') { result += nextNum; }
     	    else if (fours[i] == '-') { result -= nextNum; }
     	    else if (fours[i] == '*') { result *= nextNum; }
     	    else if (fours[i] == '/') { result /= nextNum; }
     	}
	}
}
