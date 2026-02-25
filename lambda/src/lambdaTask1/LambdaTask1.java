package lambdaTask1;

public class LambdaTask1 {
   public static void main(String[] args) {
//      1~10까지 출력해주는 메서드
	   PrintOneToTen printOTT = () -> {
		 for(int i = 0; i < 10; i++) {
			 System.out.print(i + 1 + " ");
		 }
	   };
	   
	   printOTT.printOneToTen();
	   
	   System.out.println();
//      문자열, 문자형, 인덱스를 전달하면 해당 인덱스에 값을 전달한 문자형으로 바꿔주는 메서드 
	   ChangeChar changeC = (data, c, index) -> {
		   String result = "";
		   for(int i = 0; i < data.length(); i++) {
			   if(i == index) {
				   result += c;
			   }else {
				   result += data.charAt(i);
			   }
		   }
		   return result;
	   };
	   System.out.println(changeC.changeChar("apple", 'A', 2));
   }
}
