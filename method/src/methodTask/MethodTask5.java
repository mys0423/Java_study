package methodTask;

import java.util.Scanner;

public class MethodTask5 {
//  1. 두 정수를 전달하면 몫과 나머지를 배열로 전달하는 메서드
	int[] quoAndrem(int num1, int num2) {
		int[] qAr = new int[2];
		
		int quotient = num1 / num2;
		int reminder = num1 % num2;
		
		qAr[0] = quotient;
		qAr[1] = reminder;
		
		return qAr;
	};
	
//  2. 사용자가 입력하는 값중 정수 분리하기
//  입력 예시)
//  안1녕2하3세4요
//  출력 예시)
//  1234
	String sepInt() {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String result = "";
		
		for(int i = 0; i < input1.length(); i++) {
			char c = input1.charAt(i);
			if(c >= '0' && c <= '9') {
				result += c;
			}
		}
		return result;
	};
	
//  3. 사용자가 입력한 글자와 찾을 글자를 입력하면 글자의 개수를 반환해주는 메서드
//  입력 예시) apple
//  찾을 글자 p
//  반환 2
	int findChar() {
		Scanner sc1 = new Scanner(System.in);
		String inputS = sc1.nextLine();
		char inputC = sc1.next().charAt(0);
		int count = 0;
		
		for(int i = 0; i < inputS.length(); i++) {
			char sepC = inputS.charAt(i);
			if(sepC == inputC) {
				count += 1;
			}
		}
		return count;
	}
	
//  4. 5개 정수를 배열로 마구잡이로 전달할 때 가장 작은 2개의 숫자를 배열에 담아 전달하는 메서드
	int[] min2(int[] userNum) {
		int min1 = userNum[0];
		int min2 = userNum[0];
		
		if(userNum[1] < min1) {
			min2 = min1;
			min1 = userNum[1];	
		}else {
			min2 = userNum[1];
		}
		
		for(int i = 2; i < userNum.length; i++) {
			if(userNum[i] < min1) {
				min2 = min1;
				min1 = userNum[i];
			}else if(userNum[i] < min2) {
				min2 = userNum[i];
			}
		}
		int[] result2Num = { min1, min2 };
		return result2Num;
	};
	
//  5. 랜덤한 값을 100칸 배열에 담은 후 배열 안의 값 중 홀수의 합만 출력
	int randOddNum() {
		int[] randNum = new int[100];
		int total = 0;
		
		for(int i = 0; i < randNum.length; i++) {
			randNum[i] = (int)Math.floor(Math.random() * 100);
			if(randNum[i] % 2 == 1) {
				total += randNum[i];
			}
		}
		return total;
	};
	
//  6. 연속된 중복 문자 제거하기
//  입력 예시1)
//  abbbbacda
//  출력 예시1)
//  aacda
	
//  입력 예시2)
//  aabbccccd
//  출력 예시2)
//  abcd
	
   public static void main(String[] args) {
      MethodTask5 mt5 = new MethodTask5();
      
      System.out.println("문제 1");
      int[] arr1 = mt5.quoAndrem(10, 3);
      for(int num : arr1) {
    	  System.out.print(num + " ");
      }
      System.out.println();
      
      System.out.println("문제 2");
      System.out.println(mt5.sepInt());
      
      System.out.println("문제 3");
      System.out.println(mt5.findChar());
      
      System.out.println("문제 4");
      int[] userNum = {2, 4, 5, 7, 10};
      int[] mins = mt5.min2(userNum);
      for(int num1 : mins) {    	  
    	  System.out.print(num1 + " ");
      }
      System.out.println();
      
      System.out.println("문제 5");
      System.out.println(mt5.randOddNum());
      
      System.out.println("문제 6");
   }
}











