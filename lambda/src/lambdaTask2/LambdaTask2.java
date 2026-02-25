package lambdaTask2;

public class LambdaTask2 {
   public static void main(String[] args) {
//      1) 문자열과 정수형을 전달하면 정수형마다 글자를 건너뛰고 반환(리턴)하는 메서드
//      입력 예시)
//      "abcdabcd", 4
//      출력 예시
//      "abcabc"
      System.out.println("1번");
      IntPass intPass = (data, index) -> {
    	  String result = "";
    	  for(int i = 0; i < data.length(); i++) {
    		  if((i + 1) % index == 0) {
    			  continue;
    		  }  
    		  
    		  result += data.charAt(i);  
    	  }
    	  return result;
      };
      
      System.out.println(intPass.intPass("abcdabcd", 2));
      
//      2) 문자열과 문자형을 전달하면 찾은 문자열의 인덱스에 해당하는 글자를 반환(리턴) 메서드
//      없을 시 -1
//      "abcdabcd", 'a'
//      출력 결과
//      "c"
      System.out.println("2번");
      IndexString idxString = (data, c) -> {
    	  int count = 0;

    	  for(int i = 0; i < data.length(); i++) {
    		  if(data.charAt(i) == c) {
    			  count++;
    		  }
    	  }
    	  
    	  if(count > 0) {
    		  return String.valueOf(data.charAt(count));
    	  }else {
    		  return "-1";
    	  }
      };
      
      System.out.println(idxString.indexString("abcdabcd", 'b'));
      
//      3) 문자열에서 중복된 값을 모두 없애고 반환(리턴)하는 메서드
//      입력 예시
//      "가나다라마바사가나다라가나다"
      
//      출력 예시
//      "가나다라마바사"
//      .contains(""); boolean
      System.out.println("3번");
      NoDuplication noDup = (data) -> {
    	  String result = "";
    	  for(int i = 0; i < data.length(); i++) {
    		  char c = data.charAt(i);
    		  if(result.indexOf(c) == -1) {
    			  result += c;
    		  }
    	  }
    	  return result;
      };
      
      System.out.println(noDup.noDuplication("가나다라마바사가나다라가나다"));
//      4) 문자열을 전달하면 문자열을 뒤집어서 리턴(반환)해주는 메서드
//      입력 예시
//      "123456789"
      
//      출력 예시
//      "987654321"
      System.out.println("4번");
      ReverseString reverseStr = (data) -> {
    	  String result = "";
    	  for(int i = data.length() - 1; i >= 0; i--) {
    		  result += data.charAt(i);
    	  }
    	  return result;
      };
      System.out.println(reverseStr.reverseString("123456789"));
   }
}

