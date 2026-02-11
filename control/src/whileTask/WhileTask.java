package whileTask;

import java.util.Scanner;

public class WhileTask {
   public static void main(String[] args) {
//      키오스크 만들기
//      기본 판매 상품
//      아메리카노: 2000원
//      카페라떼: 3000원
      
//      1. 상품 등록
//      2. 상품 판매
//      3. 이름 변경 
//      4. 가격 변경
      
//      등록된 물품을 판매하는 시스템
//      판매가 완료되면 다시 첫 화면으로 돌아오기!
	   Scanner sc = new Scanner(System.in);
	   String message = "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n" 
			   + "윤성 카페입니다. 주문은 인당 1잔 필수~ 안 지킬거면 나가세용^^^^\n"
			   + "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n",
			  menu = "$$$ 메뉴 - 암거나 빨리 고르세용!! $$$\n"
			   + "1. 뜨거운 아이스 아메리카노\n"
			   + "2. 카페라떼\n"
			   + "3. 차가운 핫 아메리카노\n"
			   + "4. 카페에 기부\n",
			  ice = "뜨거운 아이스 아메리카노",
			  latte = "카페라떼",
			  hot = "차가운 핫 아메리카노",
			  donation = "카페에 기부",
			  coffee = null;
	   
	   int choice = 0, coffeePrice = 0, icePrice = 20000, lattePrice = 30000, hotPrice = 40000, donationPrice = 100000;
	   
	   while(true) {
		   System.out.println(message);
		   System.out.println(menu);
		   
		   choice = sc.nextInt();
		   
		   if(choice < 1 || choice > 4) {
			   System.out.println(choice + "번 메뉴는 없습니다--");
			   System.out.println();
		   }else {
			   switch(choice) {
			   case 1:
				   coffee = ice;
				   coffeePrice = icePrice;
				   break;
			   case 2:
				   coffee = latte;
				   coffeePrice = lattePrice;
				   break;
			   case 3:
				   coffee = hot;
				   coffeePrice = hotPrice;
				   break;
			   case 4:
				   coffee = donation;
				   coffeePrice = donationPrice;
				   break;  
			   default:
				   break;
			   }
			   
			   System.out.println(choice + "번 메뉴: " + coffee + "를 선택하셨군요.");
			   System.out.println("가격: " + coffeePrice + "원 입니다. 음료 받으시면 빨리 나가주세요^^^^\n"
			   		+ "기부는 그냥 나가시면 됩니다ㅋ 이용해 주셔서 감사합니다 ㅎㅎ");
			   System.out.println();
		   }
	   }
   }
}
