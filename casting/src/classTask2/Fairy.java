package classTask2;

public class Fairy extends Monster {
   public Fairy() {;}
   
   @Override
   public void dropItem() {
      System.out.println("날개를 떨군다.");
   }
   
   public void magicAttact() {
      System.out.println("마법으로 공격한다.");
   }
}