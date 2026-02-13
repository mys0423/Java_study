package methodTask;

public class MethodTask {
//  1. 1~10까지 출력하는 메서드
   void printNum(int num) {
	   for(int i = 0; i < num; i++) {
		   System.out.println(i + 1); 			   
	   }
   };
   
//  2. 1~n까지의 합을 반환해주는 메서드
   int sumNum(int n) {
	   int sum = 0;
	   for(int i = 0; i < n; i++) {
		   sum += (i + 1);
	   }
	   return sum;
   }
   
   public static void main(String[] args) {
	   MethodTask mt = new MethodTask();
	   
	   mt.printNum(10);
	   System.out.println();
	   System.out.println(mt.sumNum(10));
   }
}

//package methodTask;
//
//public class MethodTask {
//   
//   void printFromTo10() {
//      for(int i = 0 ; i < 10; i++) {
//         System.out.println(i + 1);
//      }
//   }
//   
//   int getTotal(int count) {
//      int total = 0;
//      for(int i = 0; i < count; i++) {
//         total += i + 1;
//      }
//      return total;
//   }
//   
//   public static void main(String[] args) {
//      
//      MethodTask mt = new MethodTask();
//      int total = 0;
//      
////      1. 1~10까지 출력하는 메서드
//      mt.printFromTo10();
//      
////      2. 1~n까지의 합을 반환해주는 메서드
//      total = mt.getTotal(79);
//      System.out.println(total);
//   }
//}















