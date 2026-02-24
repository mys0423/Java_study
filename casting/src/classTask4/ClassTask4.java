package classTask4;

//   - 캐스팅 심화
//   Market
//   - 필드: 이름
//   - 메서드:
//   1. 상품 판매
//      - 등록된 상품만 판매할 수 있다.
//      - 유저가 가진 돈보다 적으면 판매할 수 없다.
//      - 유저가 마다의 할인율이 적용된다.
//         1. 비회원 할인율 5% 적용
//         2. 멤버 할인율 30% 적용
//      - 등록된 상품의 재고보다 작으면 판매할 수 없다.

//   2. 상품 등록
//      - 상품 등록은 최대 5개까지만 할 수 있다.
//      (즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
//      - 마트에 같은 이름의 상품은 등록할 수 없다.
//
//   3. 포인트 적립 메서드
//      - 회원이 각각 포인트를 가지도록
//      - 비회원은 5%
//      - 회원은 10%

//   4. 만약 비회원이라면
//      - 회원이 각각 쿠폰를 가지도록
//      - 쿠폰 1장 제공, 쿠폰이 10장이라면 상품 무료!

//   Product 상품
//      - 필드: 이름, 가격, 재고
//
//   MarketMember 
//      - 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
//   
//   MarketNonMember
//      - 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
//      - 마트 비회원과, 마트 회원을 객체화 시켜 물품을 구매하시오.

//   공통 필드로 추상화 작업 필요**

public class ClassTask4 {
    public static void main(String[] args) {
        // 1. 마트 생성 및 상품 등록
        Market market = new Market("자바 마트");
        
        System.out.println("--- [상품 등록 단계] ---");
        market.registerProduct(new Product("새우깡", 2000, 10));
        market.registerProduct(new Product("콜라", 1500, 5));
        market.registerProduct(new Product("사탕", 500, 3));
        market.registerProduct(new Product("초콜릿", 3000, 1));
        market.registerProduct(new Product("우유", 2500, 2));
        market.registerProduct(new Product("넘치는상품", 100, 1)); // 6번째라 등록 실패해야 함

        // 2. 유저 객체 생성 (이름, 전화번호, 돈, 포인트)
        // 회원은 30% 할인 / 10% 적립
        MarketMember member = new MarketMember("철수", "010-1111", 20000, 0);
        
        // 비회원은 5% 할인 / 5% 적립 / 쿠폰 9장에서 시작 (무료 혜택 테스트용)
        MarketNonMember nonMember = new MarketNonMember("길동", "010-2222", 10000, 0, 9);

        // 3. 구매 시뮬레이션
        System.out.println("\n--- [구매 시뮬레이션 시작] ---");

        // (1) 회원 철수가 새우깡 2개 구매
        // 2000원 * 2개 = 4000원 -> 30% 할인 = 2800원 결제 / 280원 적립
        market.sellProducts(member, "새우깡", 2);

        // (2) 비회원 길동이가 콜라 1개 구매
        // 1500원 -> 5% 할인 = 1425원 결제 / 71원 적립 / 쿠폰 1장 증정 (이제 10장)
        market.sellProducts(nonMember, "콜라", 1);

        // (3) 비회원 길동이가 사탕 1개 구매 (쿠폰 10장 사용 시점)
        // 쿠폰 10장 사용 -> 0원 결제 / 0원 적립 / 쿠폰 10장 차감
        market.sellProducts(nonMember, "사탕", 1);

        // (4) 재고 부족 테스트 (초콜릿은 1개뿐인데 2개 구매 시도)
        market.sellProducts(member, "초콜릿", 2);

        // 4. 최종 결과 출력
        System.out.println("\n--- [최종 영수증] ---");
        System.out.println("[" + member.getName() + " - 회원]");
        System.out.println("잔액: " + member.getMoney() + "원, 포인트: " + member.getPoint());
        
        System.out.println("\n[" + nonMember.getName() + " - 비회원]");
        System.out.println("잔액: " + nonMember.getMoney() + "원, 포인트: " + nonMember.getPoint() + ", 쿠폰: " + nonMember.getCoupon() + "장");
    }
}


//package classTask4;
//
////- 캐스팅 심화
////Market
////- 필드: 이름
////- 메서드:
////1. 상품 판매
//// - 등록된 상품만 판매할 수 있다.
//// - 유저가 가진 돈보다 적으면 판매할 수 없다.
//// - 유저가 마다의 할인율이 적용된다.
////    1. 비회원 할인율 5% 적용
////    2. 멤버 할인율 30% 적용
//// - 등록된 상품의 재고보다 작으면 판매할 수 없다.
////2. 상품 등록
//// - 상품 등록은 최대 5개까지만 할 수 있다.
//// (즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
//// - 마트에 같은 이름의 상품은 등록할 수 없다.
////
////3. 포인트 적립 메서드
//// - 회원이 각각 포인트를 가지도록
//// - 비회원은 5%
//// - 회원은 10%
//
////4. 만약 비회원이라면
//// - 회원이 각각 쿠폰를 가지도록
//// - 쿠폰 1장 제공, 쿠폰이 10장이라면 상품 무료!
//
////Product 상품
//// - 필드: 이름, 가격, 재고
////
////MarketMember 
//// - 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
////
////MarketNonMember
//// - 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
//// - 마트 비회원과, 마트 회원을 객체화 시켜 물품을 구매하시오.
//
////공통 필드로 추상화 작업 필요**
//
//public class ClassTask4 {
//public static void main(String[] args) {
// Market market = new Market("당근마켓");
// Product product1 = new Product("당근", 10000, 100);
// Product product2 = new Product("당근", 10000, 100);
// 
// MarketMember member = new MarketMember("김회원", "01012341234", 1000000);
// MarketNonMember noMember = new MarketNonMember("노회원", "01034567890", 1000000);
// 
// market.registerProduct(product1);
// market.showProducts();
// 
//// 상품이 판매되면
// market.sell("당근", 2, member);
// market.sell("당근", 2, noMember);
// 
// System.out.println("===============");
// member.printInfo();
// System.out.println("===============");
// noMember.printInfo();
//}
//}



























