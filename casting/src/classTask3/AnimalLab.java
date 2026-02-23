package classTask3;

public class AnimalLab {
	public void checkAnimal(Animal animal) {
		if(animal instanceof Herbivore) {
			Herbivore herbivore = (Herbivore)animal;
			herbivore.herbivoreType();
			
		}else if(animal instanceof Carnivore) {
			Carnivore carnivore = (Carnivore)animal;
			carnivore.carnivoreType();
			
		}else if(animal instanceof Omivore) {
			Omivore omivore = (Omivore)animal;
			omivore.omivoreType();
			
		}
	}
}

//package classTask3;
//
//public class AnimalLab {
//   private String name;
//   
//   public AnimalLab() {;}
//   public AnimalLab(String name) {
//      this.name = name;
//   }
//
//   public String getName() {
//      return name;
//   }
//   public void setName(String name) {
//      this.name = name;
//   }
//   
//   public void checkAnimal(Animal animal){
//      if(animal instanceof Carnivore) {
//         Carnivore carnivore = (Carnivore)animal;
//         carnivore.printCarnivore();
//         
//         if(animal instanceof Lion) {
//            Lion lion = (Lion)animal;
//            lion.speak();
//         }else {
//            Bear bear = (Bear)animal;
//            bear.speak();
//         }
//         
//      }else if(animal instanceof Harbivore) {
//         Harbivore harbivore = (Harbivore)animal;
//         harbivore.printHarbivore();
//         
//         if(animal instanceof Koala) {
//            Koala koala = (Koala)animal;
//            koala.speak();
//         }else {
//            Deer deer = (Deer)animal;
//            deer.speak();
//         }
//         
//      }else if(animal instanceof Omivore) {
//         Omivore omivore = (Omivore)animal;
//         omivore.printOmivore();
//         
//         if(animal instanceof Dog) {
//            Dog dog = (Dog)animal;
//            dog.speak();
//         }else {
//            Cat cat = (Cat)animal;
//            cat.speak();
//         }
//         
//         
//      }else {
//         System.out.println("모르는 동물!");
//      }
//   }
//}


//package classTask4;
//
//public class Market {
//    private String name;
//    private Product[] products = new Product[5]; // 최대 5개 등록
//    private int productCount = 0;
//
//    public Market() { ; }
//    public Market(String name) { this.name = name; }
//
//    // 1. 상품 등록 (registerProduct)
//    public void registerProduct(Product product) {
//        if (productCount >= 5) {
//            System.out.println("등록 실패: 최대 5개까지만 등록 가능합니다.");
//            return;
//        }
//        for (int i = 0; i < productCount; i++) {
//            if (products[i].getName().equals(product.getName())) {
//                System.out.println("등록 실패: 이미 존재하는 상품명입니다.");
//                return;
//            }
//        }
//        products[productCount++] = product;
//        System.out.println(product.getName() + " 상품이 등록되었습니다.");
//    }
//
//    // 2. 상품 판매 (sellProducts)
//    public void sellProducts(Member member, String productName) {
//        Product target = null;
//        for (int i = 0; i < productCount; i++) {
//            if (products[i].getName().equals(productName)) {
//                target = products[i];
//                break;
//            }
//        }
//
//        if (target == null) {
//            System.out.println("판매 불가: 등록된 상품이 아닙니다.");
//            return;
//        }
//        if (target.getStock() <= 0) {
//            System.out.println("판매 불가: 재고가 부족합니다.");
//            return;
//        }
//
//        // 할인율 결정 (캐스팅 활용)
//        double discountRate = (member instanceof MarketMember) ? 0.3 : 0.05;
//        int finalPrice = (int) (target.getPrice() * (1 - discountRate));
//
//        // 비회원 쿠폰 무료 혜택 체크
//        if (member instanceof MarketNonMember && member.getCoupon() >= 10) {
//            System.out.println("쿠폰 10장 사용! 무료 구매 처리됩니다.");
//            finalPrice = 0;
//            member.setCoupon(member.getCoupon() - 10);
//        }
//
//        if (member.getMoney() < finalPrice) {
//            System.out.println("판매 불가: 유저의 잔액이 부족합니다.");
//            return;
//        }
//
//        // 결제 진행
//        member.setMoney(member.getMoney() - finalPrice);
//        target.setStock(target.getStock() - 1);
//        
//        // 포인트 적립 호출
//        savePoint(member, finalPrice);
//        
//        // 비회원 쿠폰 증정
//        if (member instanceof MarketNonMember && finalPrice > 0) {
//            member.setCoupon(member.getCoupon() + 1);
//        }
//
//        System.out.println(member.getName() + "님, " + target.getName() + " 구매 완료!");
//    }
//
//    // 3. 포인트 적립 (savePoint)
//    public void savePoint(Member member, int price) {
//        double pointRate = (member instanceof MarketMember) ? 0.1 : 0.05;
//        int addedPoint = (int) (price * pointRate);
//        member.setPoint(member.getPoint() + addedPoint);
//        System.out.println(addedPoint + "포인트가 적립되었습니다.");
//    }
//
//    // Getter & Setter
//    public String getName() { return name; }
//    public void setName(String name) { this.name = name; }
//}

















