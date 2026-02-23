package classTask2;

public class Human extends Monster {
   public Human() {;}
   
   @Override
   public void dropItem() {
      System.out.println("갑옷을 떨군다.");
   }
   
   public void hidding() {
      System.out.println("휴먼이 숨는다");
   }
}