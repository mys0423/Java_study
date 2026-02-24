package classTask4;

public class Market {
	private String name;
	private Product[] products = new Product[5];
	private int productNumber = 0;

	public Market() {;}
	public Market(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sellProducts(Member member, String productName, int amount) {
		Product selling = null;
		
		for(int i = 0; i < productNumber; i++) {
			if(products[i].getName().equals(productName)) {
				selling = products[i];
				break;
			}
		}
		
		if (selling == null) {
            System.out.println("등록되지 않은 상품입니다.");
            return;
        }
		
		if(selling.getStock() < amount) {
			System.out.println("재고가 부족합니다. 현재 재고: " + selling.getStock() + "개");
			return;
		}
		
		double discountRate = (member instanceof MarketMember) ? 0.3 : 0.05;
		double finalPrice = (selling.getPrice() * amount * (1 - discountRate));
		
		if(member instanceof MarketNonMember) {
			MarketNonMember nonMember = (MarketNonMember) member;
			
			if (nonMember.getCoupon() >= 10) {
	            System.out.println("쿠폰 10장 사용! 상품 무료 구매!");
	            finalPrice = 0;
	            nonMember.setCoupon(nonMember.getCoupon() - 10);
			}
		}
		
		if(member.getMoney() < finalPrice) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		member.setMoney(member.getMoney() - (int)finalPrice);
        
        selling.setStock(selling.getStock() - amount);
        
        savePoint(member, (int)finalPrice);
        
        if (member instanceof MarketNonMember && finalPrice > 0) {
            MarketNonMember nm = (MarketNonMember) member;
            nm.setCoupon(nm.getCoupon() + 1);
        }

        System.out.println(member.getName() + "님의 결제가 완료되었습니다.");
        System.out.println("결제 금액: " + (int)finalPrice + "원");
		
	}
	
	public void registerProduct(Product product) {
		if(productNumber >= 5) {
			System.out.println("최대 5개까지 등록 가능합니다.");
			return;
		}
		for(int i = 0; i < productNumber; i++) {
			if(products[i].getName().equals(product.getName())) {
				System.out.println("이미 등록된 상품입니다.");
				return;
			}
		}
		products[productNumber++] = product;
		System.out.println(product.getName() + "상품이 등록되었습니다.");
	}
	
	
	public void savePoint(Member member, int price) {
		double pointRate = (member instanceof MarketMember) ? 0.1 : 0.05;
        int addedPoint = (int)(price * pointRate);
        member.setPoint(member.getPoint() + addedPoint);
        System.out.println(addedPoint + " 포인트가 적립되었습니다.");
	}
}


//package classTask4;
//
//public class Market {
//   private String marketName;
//   private Product[] products;
//   
//   {
//      this.products = new Product[5];
//   }
//   
//   public Market() {;}
//   public Market(String marketName) {
//      super();
//      this.marketName = marketName;
//   }
//   
//   public String getMarketName() {
//      return marketName;
//   }
//   public void setMarketName(String marketName) {
//      this.marketName = marketName;
//   }
//   public Product[] getProducts() {
//      return products;
//   }
//   public void setProducts(Product[] products) {
//      this.products = products;
//   }
//   
//   public void registerProduct(Product product) {
//      Product[] products = this.getProducts();
//      
//      for(int i = 0; i < products.length; i++) {
//         Product registeredProduct = products[i];
//         
//         // null이면 상품 등록이 가능!
//         if(registeredProduct == null) {
//            // 상품이 추가될 때 기존에 있는 상품이 다음에 등록된 상품과 이름이 겹치는지 확인해서
//            // 기존에 있는 상품이라면 등록하지 않게한다.
//            boolean flag = false;
//            for(int j = 0 ; j < products.length; j++) {
//               if(products[j] != null && products[j].getProductName().equals(product.getProductName())) {
//                  flag = true;
//               }
//            }
//            if(flag) { break; }
//            products[i] = product;
//         }
//      }
//      System.out.println("상품 등록이 완료되었습니다.");
//   }
//   
//   public void registerProducts(Product[] products) {
//      this.setProducts(products);
//      System.out.println("상품 등록이 완료되었습니다.");
//   }
//   
//   public void sell(String name, int stock, MarketCustomer marketCustomer) {
//      Product[] products = this.getProducts();
//      Product product = null;
//      int totalPrice = 0, discount = 0;
//      
////      상품 목록을 가져와서, 구매하려는 상품을 product에 담는다
//      for(int i = 0; i < this.getProducts().length; i++) {
//         if(products[i] != null && products[i].getProductName().equals(name)) {
//            product = products[i];
//         }
//      }
//      
////      상품의 재고보다 클 때에만 판매 아니면 메서드 종료
//      if(product.getProductStock() < stock) {
//         System.out.println("재고 부족\n상품을 판매할 수 없습니다.");
//         return;
//      }
//      
//      totalPrice = product.getProductPrice() * stock;
//      
////      멤버별 차등 할인율 적용
//      if(marketCustomer instanceof MarketMember) {
//         discount = 30;
//      }else {
//         discount = 5;
//      }
//
////      할인율 계산
//      totalPrice = (int)(totalPrice * ((100 - discount) / 100.0));
//      
////      사용자의 돈을 차감
//      marketCustomer.setCustomerMoney(marketCustomer.getCustomerMoney() - totalPrice);
//      
////      상품의 재고 차감
//      product.setProductStock(product.getProductStock() - stock);
//      
////      쿠폰 적립
////      rewardCoupon
//      this.rewardCoupon(marketCustomer);
//      this.rewardPoint(marketCustomer, totalPrice);
//      
////      포인트 적립 
////      rewardPoint
//      System.out.println("판매가 완료되었습니다.");
//   };
//   
////   판매중인 마켓의 상품을 보여주는 메서드 
//   public void showProducts() {
//      String result = "";
//      for(Product product: this.getProducts()) {
//         if(product == null) {
//            break;
//         }
//         result += product.getProductName() + " ";
//      }
//      System.out.println(result);
//   }
//   
////   쿠폰 적립
//   public void rewardCoupon(MarketCustomer marketCustomer) {
//      if(marketCustomer instanceof MarketNonMember) {
//         marketCustomer.setCustomerCoupon(marketCustomer.getCustomerCoupon() + 1);
//      }
//   }
//   
////   포인트 적립
//   public void rewardPoint(MarketCustomer marketCustomer, int productPrice) {
////      - 비회원은 5%
////      - 회원은 10%
//      int point = 0;
//      if(marketCustomer instanceof MarketMember) {
//         point = (int)Math.floor(productPrice * 0.1);
//      }else {
//         point = (int)Math.floor(productPrice * 0.05);
//      }
//      marketCustomer.setCustomerPoint(marketCustomer.getCustomerPoint() + point);
//   }
//}

















