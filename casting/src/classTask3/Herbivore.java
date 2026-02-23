package classTask3;

public class Herbivore extends Animal {
	public Herbivore() {;}
	
	
	public void herbivoreType() {
		System.out.println(getName() + "은(는) 초식동물입니다.");
	}
	
}

//package classTask3;
//
//public class Harbivore extends Animal{
//   public Harbivore() {;}
//   public Harbivore(String name, int age, String feed) {
//      super(name, age, feed);
//   }
//   
//   public void printHarbivore() {
//      System.out.println(super.getName() + "은 초식동물!");
//   }
//   
//}