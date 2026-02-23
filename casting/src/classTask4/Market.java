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
		
		for(int i = 0; i < products.length; i++) {
			if(products[i].getName().equals(productName)) {
				selling = products[i];
				break;
			}else {
				System.out.println("동록되지 않은 상품입니다.");
			}
		}
		
		if(selling.getStock() < amount) {
			System.out.println("재고가 부족합니다. 현재 재고: " + selling.getStock() + "개");
		}
		
		double discountRate = (member instanceof MarketMember) ? 0.1 : 0.05;
		double finalPrice = (selling.getPrice() * (1 - discountRate));
		
		if(member.getMoney() < finalPrice) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		if(member instanceof MarketNonMember) {
			MarketNonMember nonMember = (MarketNonMember) member;
			System.out.println("쿠폰이 10장이므로 상품 무료!");
			finalPrice = 0;
			nonMember.setCoupon(nonMember.getCoupon() - 10);
			
			if(finalPrice > 0) {
				nonMember.setCoupon(nonMember.getCoupon() + 1);
			}
		}
	}
	
	public void registerProduct(Product product) {
		if(productNumber > 5) {
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
	
	
	public void savePoint() {
		
	}
}
