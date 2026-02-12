package arrayTask;

import java.util.Scanner;

public class ArrayTask02 {
   public static void main(String[] args) {
      
//      골드
//      1. 사용자가 몇 개를 입력할 지 모를 때,
//      입력한 모든 값을 배열에 담은 후 최댓값과 최솟값을 출력
	   System.out.println("골1");
	   String message1 = "원하시는 입력 개수를 적어주세요.";
	   String message2 = "정수를 입력해주세요.";
	   String message3 = "정수와 실수 아무거나 입력해주세요.";
	   
	   Scanner sc = new Scanner(System.in);
	   int countNum = 0, num = 0;
	   
	   System.out.println(message1);
	   countNum = sc.nextInt();	   
	   int[] arr1 = new int[countNum];
	   
	   System.out.println(message2);
	   
	   for(int i = 0; i < arr1.length; i++) {
		   arr1[i] = sc.nextInt();
	   }
	   
	   int max = arr1[0];
	   int min = arr1[0];
	   
	   for(int i = 0; i < arr1.length; i++) {
		   if(arr1[i] > max) {
			   max = arr1[i];
		   }
		   if(arr1[i] < min) {
			   min = arr1[i];
		   }
	   }
	   System.out.printf("최댓값: %d, 최솟값: %d", max, min);
	   System.out.println();
	   System.out.println("================================");
      
//      2. 사용자가 몇 개를 입력할 지 모를 때,
//      입력한 모든 값을 배열에 담고, 실수와 정수의 개수를 출력
//      입력예시) "10", "10.7", "2", "3.6"
//      출력예시) 실수 2개, 정수 2개
	   System.out.println("골2");
	   
	   Scanner sc1 = new Scanner(System.in);
	   Scanner sc2 = new Scanner(System.in);
	   int countNum1 = 0;
	   int intCount = 0, doubleCount = 0;
	   String input = "";
	   
	   System.out.println(message1);
	   countNum1 = sc1.nextInt();	   
	   String[] arr2 = new String[countNum1];
	   
	   System.out.println(message3);
	   for(int i = 0; i < arr2.length; i++) {
		   input = sc2.nextLine();
		   if(input.indexOf(".") > 0) {
			   doubleCount++;
		   }else {
			   intCount++;
		   }
	   }

	   System.out.printf("실수 %d개, 정수 %d개", doubleCount, intCount);
	   System.out.println();
	   System.out.println("================================");
   }
}


//package arrayTask;
//
//import java.util.Scanner;
//
//public class ArrayTask02 {
//   public static void main(String[] args) {
////      골드
////      1. 사용자가 몇 개를 입력할 지 모를 때,
////      입력한 모든 값을 배열에 담은 후 최댓값과 최솟값을 출력
////      Scanner sc = new Scanner(System.in);
////      int[] arData1 = null;
////      int count = 0, min = 0, max = 0;
////      String message1 = "배열의 길이를 입력하세요.";
////      
////      System.out.println(message1);
////      count = sc.nextInt();
////      arData1 = new int[count];
////      
////      for(int i = 0; i < count; i++) {
////         System.out.println(i + 1 + "번 째 정수를 입력하세요.\nex)10");
////         arData1[i] = sc.nextInt();
////      }
////      
////      min = arData1[0];
////      max = arData1[0];
////      
////      for(int i = 0; i < arData1.length; i++) {
////         if(min > arData1[i]) { min = arData1[i]; };
////         if(max < arData1[i]) { max = arData1[i]; };
////      }
////      
////      System.out.printf("최솟값: %d 최댓값: %d", min, max);
//      
////      2. 사용자가 몇 개를 입력할 지 모를 때,
////      입력한 모든 값을 배열에 담고, 실수와 정수의 개수를 출력
////      입력예시) "10", "10.7", "2", "3.6"
////      출력예시) 실수 2개, 정수 2개
//      Scanner sc = new Scanner(System.in);
//      String[] arData2 = null;
//      int arData2Length = 0, integerCount = 0, floatCount = 0;
//      String message1 = "배열의 길이를 입력하세요.";
//      
//      System.out.println(message1);
//      arData2Length = sc.nextInt();
//      arData2 = new String[arData2Length];
//      
//      for(int i = 0; i < arData2Length; i++) {
//         
//         System.out.println(arData2Length + 1 + "번 째 값을 입력하세요\nex)10 or 11.2");
//         
//         String input = sc.next();
//         arData2[i] = input;
//         
//         if(input.contains(".")) {
//            floatCount++;
//         }else {
//            integerCount++;
//         }
//      }
//      
//      System.out.printf("실수: %d개, 정수: %d개", floatCount, integerCount);
//      
//   }
//}






















