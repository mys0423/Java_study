package arrayTask;

import java.util.Scanner;

public class ArrayTask01 {
   public static void main(String[] args) {
//     브론즈
//	   1. 1~100까지 배열에 담은 후 홀수만 출력
	   System.out.println("브1");
	   int[] arr1 = new int[100];
	   for(int i = 0; i < arr1.length; i++) {
		   arr1[i] = i + 1; 
		   if(i % 2 == 0) {			   
			   System.out.println(arr1[i]);
		   }
	   }
	   System.out.println("=======================================");
 
//	   2. 10~1까지 중 짝수만 배열에 담고 출력
	   System.out.println("브2");
	   int[] arr2 = new int[10];
	   int index = 0;
	   
	   for(int i = arr2.length; i > 0; i--) {
		   if(i % 2 == 0) {
			   arr2[index] = i;
			   System.out.println(arr2[index]);
			   index++;
		   }
	   }
	   System.out.println("=======================================");
      
//	   3. 1~77까지 중 짝수만 배열에 담고 출력
	   System.out.println("브3");
	   int[] arr3 = new int[77];
	   for(int i = 0; i < arr3.length; i++) {
		   if((i + 1) % 2 == 0) {
			   arr3[i] = i + 1;
		   }else {
			   continue;
		   }
		   System.out.println(arr3[i]);
	   }
	   System.out.println("=======================================");
	   
	   
//     실버
//     1. A~F까지 배열에 담고 출력
	   System.out.println("실1");
	   char[] arr4 = new char[6];
	   
	   for(int i = 0; i < arr4.length; i++) {
		   arr4[i] = (char)('A' + i);
		   System.out.println(arr4[i]);
	   }
	   System.out.println("=======================================");
	   
//     2. 5개의 정수를 입력 받고 배열에 담은 후 최댓값과 최솟값을 출력
	   System.out.println("실2");
	   Scanner sc = new Scanner(System.in);
	   int[] arr5 = new int[5];
	   
	   for(int i = 0; i < arr5.length; i++) {
		   arr5[i] = sc.nextInt();		   
	   }
	   
	   int max = arr5[0];
	   int min = arr5[0];
	   
	   for(int i = 0; i < arr5.length; i++) {
		   if(arr5[i] > max) {
			   max = arr5[i];
		   }
		   if(arr5[i] < min) {
			   min = arr5[i];
		   }
	   }
	   System.out.printf("최댓값: %d, 최솟값: %d", max, min);
	   System.out.println();
	   System.out.println("=======================================");
   }
}


//package arrayTask;
//
//import java.util.Scanner;
//
//public class ArrayTask01 {
//   public static void main(String[] args) {
////      브론즈
////      1. 1~100까지 배열에 담은 후 홀수만 출력
////      int[] arData1 = new int[100];
////      for(int i = 0; i < arData1.length; i++) {
////         int value = i + 1;
////         arData1[0] = value;
////         if(value % 2 == 0) {
////            System.out.println(i);
////         }
////      }
//      
////      2. 10~1까지 중 짝수만 배열에 담고 출력
////      int[] arData2 = new int[5];
////      for(int i = 0; i < 5; i++) {
////         arData2[i] = (i + 1) * 2;
////         System.out.println(arData2[i]);
////      }
//      
////      3. 1~77까지 중 짝수만 배열에 담고 출력
////      int[] arData3 = null;
////      arData3 = new int[77 / 2];
////      for(int i = 0; i < arData3.length; i++) {
////         arData3[i] = (i + 1) * 2;
////         System.out.println(arData3[i]);
////      }
//      
////      실버
////      A~F까지 배열에 담고 출력
////      char[] chars = new char[6];
////      for(int i = 0; i < chars.length; i++) {
////         chars[i] = (char)('A' + i);
////         System.out.println(chars[i]);
////      }
//      
////      5개의 정수를 입력 받고 배열에 담은 후 최댓값과 최솟값을 출력
//      String message = "번 째 정수를 입력하세요.\n";
//      Scanner sc = new Scanner(System.in);
//      int[] arData4 = new int[5];
//      int count = 0, min = 0, max = 0;
//      
//      while(true) {
//         System.out.print(count + 1 + message);
//         arData4[count] = sc.nextInt();
//         count++;
//         if(count > 4) {
//            break;
//         }
//      }
//      
//      min = arData4[0];
//      max = arData4[0];
//      
//      for(int i = 1; i < arData4.length; i++) {
//         if(min > arData4[i]) { min = arData4[i]; }
//         if(max < arData4[i]) { max = arData4[i]; }
//      }
//      
//      System.out.println("최댓값: " + max);
//      System.out.println("최솟값: " + min);
//      
//   }
//}
