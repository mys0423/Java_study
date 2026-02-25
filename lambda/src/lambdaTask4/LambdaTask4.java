package lambdaTask4;

public class LambdaTask4 {
   public static void main(String[] args) {
//      1. 정수를 입력하면 정수에 해당하는 구구단을 출력해주는 람다
//      입력 예시)
//      3
//      출력 예시)
//      3 x 1 = 3
//      ...
//      3 x 9 = 27 
      System.out.println("1번");
      
      Gugudan gugu = (num) -> {
    	  for(int i = 0; i < 9; i++) {
    		  System.out.printf("%d x %d = %d\n", num, i + 1, num * (i + 1));
    	  }
      };
      
      gugu.gugudan(3);
      
//      2. 두 개의 정수와 연산자를 전달하면 식을 완성시켜주는 람다
//      입력 예시1)
//      10, 20, "+"
//      
//      출력 예시1)
//      30
      
//      입력 예시2)
//      10, 20, "-"
//      
//      출력 예시2)
//      -10
      System.out.println("2번");
      
      MakeCalculation makeCal = (num1, num2, c) -> {
    	  int result = 0;
    	  if(c == '+') { 
    		  result = num1 + num2; 
    	  }else if(c == '-') {
    		  result = num1 - num2;
    	  }else if(c == '*') {
    		  result = num1 * num2;
    	  }else if(c == '/') {
    		  result = num1 / num2;
    	  }else {
    		  System.out.println("노답");
    	  }
    	  return result;
      };
      
      System.out.println(makeCal.makeCalculation(10, 20, '-'));
      
//      3. 배열에 10개의 무작위 정수를 전달하면,
//      큰수부터(내림차순) 정렬하여 배열에 담아 리턴(반환)해주는 메서드
//      입력 예시)
//      {10, 3, 7, 8, 0, 9}
      
//      출력 예시)
//      {10, 9, 8, 7, 3, 0}
      System.out.println("3번");
      
      ArraySort arrSort = (array) -> {
    	  for(int i = 0; i < array.length - 1; i++) {
    		  for(int j = 0; j < array.length - 1 - i; j++) {
    			  if(array[j] < array[j + 1]) {
    				  int temp = array[j];
    				  array[j] = array[j + 1];
    				  array[j + 1] = temp;
    			  }
    		  }
    	  }
    	  return array;
      };
      
      int[] arr = {10, 3, 7, 8, 0, 9};
      int[] result = arrSort.arraySort(arr);

      for(int num : result) {
    	  System.out.print(num + " ");
      }
   }
}
