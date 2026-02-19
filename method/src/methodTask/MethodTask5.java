package methodTask;

import java.util.Scanner;

public class MethodTask5 {
//  1. 두 정수를 전달하면 몫과 나머지를 배열로 전달하는 메서드
//	int[] quoAndrem(int num1, int num2) {
//		int[] qAr = new int[2];
//		
//		int quotient = num1 / num2;
//		int reminder = num1 % num2;
//		
//		qAr[0] = quotient;
//		qAr[1] = reminder;
//		
//		return qAr;
//	};
	
//  2. 사용자가 입력하는 값중 정수 분리하기
//  입력 예시)
//  안1녕2하3세4요
//  출력 예시)
//  1234
//	String sepInt() {
//		Scanner sc = new Scanner(System.in);
//		String input1 = sc.nextLine();
//		String result = "";
//		
//		for(int i = 0; i < input1.length(); i++) {
//			char c = input1.charAt(i);
//			if(c >= '0' && c <= '9') {
//				result += c;
//			}
//		}
//		return result;
//	};
	
//  3. 사용자가 입력한 글자와 찾을 글자를 입력하면 글자의 개수를 반환해주는 메서드
//  입력 예시) apple
//  찾을 글자 p
//  반환 2
//	int findChar() {
//		Scanner sc1 = new Scanner(System.in);
//		String inputS = sc1.nextLine();
//		char inputC = sc1.next().charAt(0);
//		int count = 0;
//		
//		for(int i = 0; i < inputS.length(); i++) {
//			char sepC = inputS.charAt(i);
//			if(sepC == inputC) {
//				count += 1;
//			}
//		}
//		return count;
//	};
	
//  4. 5개 정수를 배열로 마구잡이로 전달할 때 가장 작은 2개의 숫자를 배열에 담아 전달하는 메서드
//	int[] min2(int[] userNum) {
//		int min1 = userNum[0];
//		int min2 = userNum[0];
//		
//		if(userNum[1] < min1) {
//			min2 = min1;
//			min1 = userNum[1];	
//		}else {
//			min2 = userNum[1];
//		}
//		
//		for(int i = 2; i < userNum.length; i++) {
//			if(userNum[i] < min1) {
//				min2 = min1;
//				min1 = userNum[i];
//			}else if(userNum[i] < min2) {
//				min2 = userNum[i];
//			}
//		}
//		int[] result2Num = { min1, min2 };
//		return result2Num;
//	};
	
//  5. 랜덤한 값을 100칸 배열에 담은 후 배열 안의 값 중 홀수의 합만 출력
//	int randOddNum() {
//		int[] randNum = new int[100];
//		int total = 0;
//		
//		for(int i = 0; i < randNum.length; i++) {
//			randNum[i] = (int)Math.floor(Math.random() * 100);
//			if(randNum[i] % 2 == 1) {
//				total += randNum[i];
//			}
//		}
//		return total;
//	};
	
//  6. 연속된 중복 문자 제거하기
//  입력 예시1)
//  abbbbacda
//  출력 예시1)
//  aacda
	
//  입력 예시2)
//  aabbccccd
//  출력 예시2)
//  abcd
	String remdup(String data) {
		String result = "";
		
		for(int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			
			if(result.length() == 0 || result.charAt(result.length() - 1) != c) {
				result += c;
			}
		}
		return result;
	};
	
   public static void main(String[] args) {
      MethodTask5 mt5 = new MethodTask5();
      
//      System.out.println("문제 1");
//      int[] arr1 = mt5.quoAndrem(10, 3);
//      for(int num : arr1) {
//    	  System.out.print(num + " ");
//      }
//      System.out.println();
//      
//      System.out.println("문제 2");
//      System.out.println(mt5.sepInt());
//      
//      System.out.println("문제 3");
//      System.out.println(mt5.findChar());
//      
//      System.out.println("문제 4");
//      int[] userNum = {2, 4, 5, 7, 10};
//      int[] mins = mt5.min2(userNum);
//      for(int num1 : mins) {    	  
//    	  System.out.print(num1 + " ");
//      }
//      System.out.println();
//      
//      System.out.println("문제 5");
//      System.out.println(mt5.randOddNum());
      
      System.out.println("문제 6");
      String data1 = "abbbbacda";
      System.out.printf("입력: %s\n출력: %s", data1, mt5.remdup(data1));
   }
}

//package methodTask;
//
//import java.util.Scanner;
//
//public class MethodTask5 {
//   int[] getDivide(int data1, int data2) {
//      return new int[] {data1 / data2, data1 % data2};
//   };
//   
//   String getIntegerString(String input) {
//      String result = "";
//      for(int i = 0; i < input.length(); i++) {
//         int c = input.charAt(i) - 48;
//         if(c >= 1 && c <= 9) {
//            result += (char)(c + 48);
//         }
//      }
//      return result;
//   }
//
//   int getCount(String expression, char c) {
//      int count = 0;
//      for(int i = 0; i < expression.length(); i++) {
//         if(expression.charAt(i) == c) {
//            count++;
//         }
//      }
//      return count;
//   }
//   
//   int[] getMinArray(int[] datas) {
//      int[] minArray = new int[2];
//      int min1 = datas[0], min2 = datas[1];
//      for(int i = 0; i < datas.length; i++) {
//         if(min1 > datas[i]) {
//            min1 = datas[i];
//         }else if(datas[i] > min1 && min2 >= datas[i]){
//            min2 = datas[i];
//         }
//      }
//      minArray[0] = min1;
//      minArray[1] = min2;
//      return minArray;
//   }
//   
//   int getTotalOdd(int[] datas) {
//      int result = 0;
//      for(int i = 0; i < datas.length; i++) {
//         if(datas[i] % 2 == 1) {
//            result += datas[i];
//         }
//      }
//      return result;
//   }
//   
//   String getRemoveString(String input) {
//      String result = "";
//      for(int i = 0; i < input.length(); i++) {
//         char c = input.charAt(i);
//         if(!result.contains(String.valueOf(c))) {
//            result += c;
//         }
//      }
//      return result;
//   }
//   
//   
//   public static void main(String[] args) {
//      MethodTask5 mt = new MethodTask5();
////      플레티넘 ~ 다이아
////      1. 두 정수를 전달하면 몫과 나머지를 배열로 전달하는 메서드
////      int[] datas = new MethodTask5().getDivide(10, 20);
////      for(int data : datas) {
////         System.out.println(data);
////      }
//      
//      
////      2. 사용자가 입력하는 값 중 정수 분리하기
////      입력 예시)
////      안1녕2하3세4요
////      출력 예시)
////      1234
//      
////      .charAt()
////      Scanner sc = new Scanner(System.in);
////      String input = null, message = "정수를 분리할 글자를 입력하세요\n안1녕", result = null;
////
////      System.out.println(message);
////      input = sc.next();
////      result = mt.getIntegerString(input);
//      
////      System.out.println(result);
//      
//      
////      3. 사용자가 입력한 글자와 찾을 글자를 입력하면 글자의 개수를 반환해주는 메서드
////      입력 예시) apple
////      찾을 글자 p
////      반환 2
////      Scanner sc = new Scanner(System.in);
////      String input = null, message = "문자열과 찾을 글자를 입력하세요.\nex)abcd", result = null;
////      
////      System.out.println(message);
////      input = sc.next();
////      int count = mt.getCount(input, 'a');
////      System.out.println(count);
//      
////      4. 5개 정수를 배열로 마구잡이로 전달할 때 가장 작은 2개의 숫자를 배열에 담아 전달하는 메서드
////      int[] datas = {10, 40, 1, 10};
////      System.out.println(mt.getMinArray(datas)[0]);
////      System.out.println(mt.getMinArray(datas)[1]);
//      
//      
////      5. 랜덤한 값을 100칸 배열에 담은 후 배열 안의 값 중 홀수의 합만 출력
////      int[] datas = new int[100];
////      int result = 0;
////      for(int i = 0; i < datas.length; i++) {
////         datas[i] = (int)(Math.random() * 100);
////      }
////      
////      System.out.println(mt.getTotalOdd(datas));
//      
////      6. 연속된 중복 문자 제거하기
////      입력 예시1)
////      abbbbacda
////      출력 예시1)
////      abacda
//      
////      입력 예시2)
////      aabbccccd
////      출력 예시2)
////      abcd
//      Scanner sc = new Scanner(System.in);
//      String input = null, message = "중복을 제거할 문자를 입력하세요.\naabbccccd", result = "";
//      
//      System.out.println(message);
//      input = sc.next();
//      
//      System.out.println(mt.getRemoveString(input));
//      
//   }
//}











