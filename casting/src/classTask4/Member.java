package classTask4;

public class Member {
	private String name;
	private String phone;
	private int money;
	private int point;
	
	public Member() {;}
	public Member(String name, String phone, int money, int point) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.point = point;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
