package classTask4;

public class MarketNonMember extends Member {
	private int coupon;

	public MarketNonMember() {;}
	public MarketNonMember(String name, String phone, int money, int point, int coupon) {
		super(name, phone, money, point);
		this.coupon = coupon;
	}
	
	public int getCoupon() {
		return coupon;
	}

	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}

}


//package classTask4;
//
//public class MarketNonMember extends MarketCustomer{
//
//   public MarketNonMember() {;}
//   public MarketNonMember(String customerName, String customerPhone, int customerMoney) {
//      super(customerName, customerPhone, customerMoney);
//   }
//}
