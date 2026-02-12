package arrayTask;

import java.util.Scanner;

public class ArrayTask05 {
   public static void main(String[] args) {
//      골드 ~ 플레티넘
//      1. 비밀번호를 암호화해주는 로직을 완성하세요.
//      입력예시)
//      test123!@#
//      비밀번호 이외의 특수문자가 나올 수 있음.
//      출력 예시)
//      ???????
	   System.out.println("골드~플레");
	   Scanner sc = new Scanner(System.in);
	   String password = sc.nextLine();
	   char[] passArr = new char[password.length()];
	   
	   for(int i = 0; i < passArr.length; i++) {
		   passArr[i] = '?';
		   System.out.print(passArr[i]);
	   }
	   System.out.println();
       System.out.println("==========================================");
       
//      2. 가장 많이 판매된 상품의 총 판매 수익과
//      가장 적게 판매된 상품의 판매 수익의 차를 출력하세요.
//      아메리카노 2000원, 카페라떼 3000원, 에이드 4000원, 밀크쉐이크 5000원
      String[] menus = {"아메리카노", "카페라떼", "에이드", "밀크쉐이크"};
      int[] prices = {2000, 3000, 4000, 5000};
//      orders의 정수는 menus의 주문 번호입니다.
      int[] orders = {0, 1, 0, 1, 3, 1, 1, 2, 2, 0, 2, 3, 1, 2, 3, 0, 2, 2, 1, 1, 0};
      int[] countMenu = new int[menus.length];
      int[] totalPrice = new int[menus.length];
      int maxMenu = 0, minMenu = 0;
      
      for(int i = 0; i < orders.length; i++) {
    	  int menuIndex = orders[i];
    	  countMenu[menuIndex]++;
      }
       
      for(int i = 0; i < menus.length; i++) {
    	  totalPrice[i] = countMenu[i] * prices[i];
      }
      
      minMenu = totalPrice[0];
      maxMenu = totalPrice[0];
      
      for(int i = 0; i < totalPrice.length; i++) {
    	  if(minMenu > totalPrice[i]) { minMenu = totalPrice[i];}
    	  if(maxMenu < totalPrice[i]) { maxMenu = totalPrice[i];}
      }
      System.out.printf("가장 많은 수입과 적은 수입 차: %d", maxMenu - minMenu);
   }
}
