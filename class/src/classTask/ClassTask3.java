package classTask;

// PlayerA
// 10 170 16 24 35
// 카드 뽑기

class PlayerA {
   int[] cards = {10, 170, 16, 24, 35};

// PlayerB의 카드 중에 가장 큰 수와 가장 작은 수를 뽑아올 수 있는 메서드
   public void takeCard(PlayerB playerB) {
      int min = playerB.cards[0];
      int max = playerB.cards[0];
      
      for(int i = 0; i < playerB.cards.length; i++) {
         if(min > playerB.cards[i]) {
            min = playerB.cards[i];
         }
         if(max < playerB.cards[i]) {
            max = playerB.cards[i];
         }
      }
      
      // min, max -> 내가 가진 카드에 추가하는 로직
      addCard(min);
      addCard(max);
      
      removePlayerBCard(min, playerB);
      removePlayerBCard(max, playerB);
      
   }
   
   // 카드를 추가하는 메서드
   void addCard(int card) {
      int[] newCards = new int[this.cards.length + 1];
      
      for(int i = 0; i < this.cards.length; i++) {
         newCards[i] = this.cards[i];
      }
      
      newCards[this.cards.length] = card;
      this.cards = newCards;
   }
   
   // playerB 카드를 제거하는 메서드
   void removePlayerBCard(int card, PlayerB playerB) {
      int[] newCards = new int[playerB.cards.length - 1];
      int index = 0;
      
      for(int i = 0; i < playerB.cards.length; i++) {
         if(playerB.cards[i] != card) {
            newCards[index] = playerB.cards[i];
            index++;
         }
      }
      
      playerB.cards = newCards;
   }
   
   
   void showCards() {
      String result = "";
      for(int card: this.cards) {
         result += String.valueOf(card) + " ";
      }
      System.out.println("A: " + result);
   }
   
   
}

class PlayerB {
   int[] cards = {53, 22, 74, 12, 13};
   
//   PlayerA의 카드 전부 중 모든 숫자의 홀수를 뽑아올 수 있는 메서드
   public void takeCard(PlayerA playerA) {
      for(int i = 0; i < playerA.cards.length; i++) {
         if(playerA.cards[i] % 2 == 1) {
            int oddCard = playerA.cards[i];
            
            addCard(oddCard);
            removePlayerACard(oddCard, playerA);
         }
      }
   }
   
   // 카드를 추가하는 메서드
   void addCard(int card) {
      int[] newCards = new int[this.cards.length + 1];
      
      for(int i = 0; i < this.cards.length; i++) {
         newCards[i] = this.cards[i];
      }
      
      newCards[this.cards.length] = card;
      this.cards = newCards;
   }
   
   // playerA 카드를 제거하는 메서드
   void removePlayerACard(int card, PlayerA playerA) {
      int[] newCards = new int[playerA.cards.length - 1];
      int index = 0;
      
      for(int i = 0; i < playerA.cards.length; i++) {
         if(playerA.cards[i] != card) {
            newCards[index] = playerA.cards[i];
            index++;
         }
      }
      
      playerA.cards = newCards;
   }
   
   
   void showCards() {
      String result = "";
      for(int card: this.cards) {
         result += String.valueOf(card) + " ";
      }
      System.out.println("B: " + result);
   }
}


public class ClassTask3 {
   public static void main(String[] args) {
      PlayerA a = new PlayerA();
      PlayerB b = new PlayerB();
      a.takeCard(b);
      a.showCards();
      b.takeCard(a);
      b.showCards();
      a.showCards();
   }
}


//package classTask;
//// PlayerA
//// 10 170 16 24 35
//
//// PlayerB
//// 53 22 74 12 13
//
//// 클래스 PlayerA
//// 카드 뽑기
//// PlayerB의 카드 중에 가장 큰 수와 가장 작은 수를 뽑아올 수 있는 메서드
//
//// 클래스 PlayerB
//// 카드 뽑기
//// PlayerA의 카드 전부 중 모든 숫자의 홀수를 뽑아올 수 있는 메서드
//
//// 기존 카드에서도 카드가 사라져야하고, 기존에 카드덱에 추가 되어야됩니다.
//
//// 1. 객체화 PlayerA, PlayerB
//// 2. PlayerA 카드뽑기
//// 3. PlayerB 카드뽑기
//// 4. PlayerA 가진 모든 카드를 출력
//// 5. PlayerB 가진 모든 카드를 출력
//class PlayerA {
//	int[] playerACards = {10, 170, 16, 24, 35};
//	
//	public PlayerA() {;}
//	
//	void takeMmCards(PlayerB mMCard) {
//		int max = mMCard.playerBCards[0];
//		int min = mMCard.playerBCards[0];
//		
//		for(int card : mMCard.playerBCards) {
//			if(card > max) {max = card;}
//			if(card < min) {min = card;}
//		}
//		
//		addBCards(max);
//		addBCards(min);
//	}
//	
//	void addBCards(int card) {
//		int[] temp = new int[this.playerACards.length + 1];
//		for(int i = 0; i < this.playerACards.length; i++) {
//			temp[i] = this.playerACards[i];
//		}
//		temp[this.playerACards.length - 1] = card;
//		this.playerACards = temp;
//	}
//	
//	void removeACards(int card) {
//		int[] temp = new int[playerACards.length - 1];
//		int index;
//		boolean delete;
//				
//	}
//	
//	void printACards() {
//		System.out.println("A의 카드 목록: ");
//		for(int c : playerACards) {
//			System.out.println(c + " ");
//			System.out.println();
//		}
//	}
//}
//
//class PlayerB {
//	int[] playerBCards = {53, 22, 74, 12, 13};
//	
//	public PlayerB() {;}
//	
//	void takeOddCards(PlayerA oddCard) {
//		for(int i = 0; i < oddCard.playerACards.length; i++) {
//			int card = oddCard.playerACards[i];
//			if(card % 2 != 0) {
//				
//			}
//		}
//	}
//	
//	void addACards(int card) {
//		int[] temp = new int[playerBCards.length + 1];
//		for(int i = 0; i < playerBCards.length; i++) {
//			temp[i] = playerBCards[i];
//		}
//		temp[temp.length - 1] = card;
//		playerBCards = temp;
//	}
//	
//	void removeBCards() {
//		
//	}
//	
//	void printBCards() {
//		System.out.println("B의 카드 목록: ");
//		for(int c : playerBCards) {
//			System.out.println(c + " ");
//			System.out.println();
//	}
//}
//
//public class ClassTask3 {
//   public static void main(String[] args) {
//	   PlayerA playerA = new PlayerA();
//	   PlayerB playerB = new PlayerB();
//	   
//	   System.out.println("player A턴...!");
//	   System.out.println("playerA 카드뽑기! playerB의 가장 큰 수와 작은 수 2개 카드를 가져옵니다.");
//	   playerA.takeMmCards(playerB);
//	   
//	   System.out.println("player B턴...!");
//	   System.out.println("B 카드뽑기! playerA의 홀수 카드를 가져옵니다.");
//	   playerB.takeOddCards(playerA);
//	   
//	   playerA.printACards();
//	   playerB.printBCards();
//   }
//}