package classTest;

// Person, Bank
class Bank {
	String bankName;
	int bankMoney;
	
	public Bank() {;}
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
//	사용자의 돈을 입금
//	수수료 1000원
	void deposit(int money, Person person) {
		this.bankMoney += money + 1000;
		person.personMoney -= money + 1000;
	}
	
//	사용자의 돈을 출금
//	수수료 5000원
	void withdraw(int money, Person person) {
		this.bankMoney -= money - 5000;
		person.personMoney += money - 5000;
	}
}

class Person{
	String personName;
	int personMoney;
	
	public Person() {;}
	public Person(String personName, int personMoney) {
		this.personName = personName;
		this.personMoney = personMoney;
	}
}


public class ClassTest2 {
	public static void main(String[] args) {
		Bank kb = new Bank("국민은행");
		Person guehyeok = new Person();
		
//		kb.deposit(10000, guehyeok);
//		System.out.println("규혁이 돈: " + guehyeok.personMoney);
//		System.out.println("은행의 돈: " + kb.bankMoney);

		kb.withdraw(5000, guehyeok);
		System.out.println("규혁이 돈: " + guehyeok.personMoney);
		System.out.println("은행의 돈: " + kb.bankMoney);	
	}
}


//package classTask;
//
//class PlayerA {
//    int[] playerACards = {10, 170, 16, 24, 35};
//
//    // B의 카드 중 최대/최소를 가져옴
//    void takeMmCards(PlayerB opponent) {
//        int max = opponent.playerBCards[0];
//        int min = opponent.playerBCards[0];
//
//        // 1. 최대/최소 찾기
//        for (int i = 0; i < opponent.playerBCards.length; i++) {
//            if (opponent.playerBCards[i] > max) max = opponent.playerBCards[i];
//            if (opponent.playerBCards[i] < min) min = opponent.playerBCards[i];
//        }
//
//        // 2. 상대방(B)에서 지우기
//        opponent.removeCard(max);
//        opponent.removeCard(min);
//
//        // 3. 나(A)에게 추가하기
//        this.addCard(max);
//        this.addCard(min);
//    }
//
//    // [추가] 새 바구니 만들어 옮겨담기
//    void addCard(int card) {
//        int[] newArray = new int[playerACards.length + 1]; // 한 칸 큰 바구니
//        for (int i = 0; i < playerACards.length; i++) {
//            newArray[i] = playerACards[i]; // 기존 내용 복사
//        }
//        newArray[newArray.length - 1] = card; // 마지막에 새 카드 쏙!
//        playerACards = newArray; // 내 바구니 교체
//    }
//
//    // [제거] 지울 카드만 빼고 새 바구니에 담기
//    void removeCard(int card) {
//        int[] newArray = new int[playerACards.length - 1]; // 한 칸 작은 바구니
//        int index = 0;
//        boolean deleted = false; // 딱 하나만 지우기 위한 장치
//
//        for (int i = 0; i < playerACards.length; i++) {
//            if (!deleted && playerACards[i] == card) {
//                deleted = true; // 지울 대상을 찾으면 복사 안 하고 건너뜀
//                continue;
//            }
//            if (index < newArray.length) {
//                newArray[index] = playerACards[i];
//                index++;
//            }
//        }
//        playerACards = newArray;
//    }
//
//    void printACards() {
//        System.out.print("A의 카드: ");
//        for (int c : playerACards) System.out.print(c + " ");
//        System.out.println();
//    }
//}
//
//class PlayerB {
//    int[] playerBCards = {53, 22, 74, 12, 13};
//
//    // A의 카드 중 홀수를 모두 가져옴
//    void takeOddCards(PlayerA opponent) {
//        for (int i = 0; i < opponent.playerACards.length; i++) {
//            int card = opponent.playerACards[i];
//            if (card % 2 != 0) { // 홀수라면
//                opponent.removeCard(card); // A에서 지우고
//                this.addCard(card);       // B에 추가
//                i--; // A의 배열이 줄어들었으니 현재 자리를 다시 확인해야 함!
//            }
//        }
//    }
//
//    void addCard(int card) {
//        int[] newArray = new int[playerBCards.length + 1];
//        for (int i = 0; i < playerBCards.length; i++) {
//            newArray[i] = playerBCards[i];
//        }
//        newArray[newArray.length - 1] = card;
//        playerBCards = newArray;
//    }
//
//    void removeCard(int card) {
//        int[] newArray = new int[playerBCards.length - 1];
//        int index = 0;
//        boolean deleted = false;
//        for (int i = 0; i < playerBCards.length; i++) {
//            if (!deleted && playerBCards[i] == card) {
//                deleted = true;
//                continue;
//            }
//            if (index < newArray.length) {
//                newArray[index] = playerBCards[i];
//                index++;
//            }
//        }
//        playerBCards = newArray;
//    }
//
//    void printBCards() {
//        System.out.print("B의 카드: ");
//        for (int c : playerBCards) System.out.print(c + " ");
//        System.out.println();
//    }
//}
//
//public class ClassTask3 {
//    public static void main(String[] args) {
//        PlayerA pA = new PlayerA();
//        PlayerB pB = new PlayerB();
//
//        System.out.println("--- 게임 시작! ---");
//        pA.takeMmCards(pB); // A가 먼저 뽑기
//        pB.takeOddCards(pA); // B가 다음에 뽑기
//
//        pA.printACards();
//        pB.printBCards();
//    }
//}
