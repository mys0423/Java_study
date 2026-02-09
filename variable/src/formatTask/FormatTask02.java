package formatTask;

public class FormatTask02 {
   public static void main(String[] args) {
//      %자릿수d
//      %5d
      
//      국어점수, 영어점수, 수학점수를 받아서 서식에 맞게 출력
//      이름: 이규학
//      수학:    20점
//      국어:    40점
//      영어:    15점
//      총점:    75점
	   int korean = 0, math = 0, english = 0, total = 0;
	   String name = "";
	   
	   name = "이규학";
	   korean = 40;
	   math = 20;
	   english = 15;
	   total = korean + math + english;
	   
	   System.out.printf("이름: %s\n수학: %5d점\n국어: %5d점\n영어: %5d점\n총점: %5d점\n",
			   name, math, korean, english, total);
   }
}


//package formatTask;
//
//public class FormatTask02 {
//   public static void main(String[] args) {
////      %자릿수d
////      %5d
//      
////      국어점수, 영어점수, 수학점수를 받아서 서식에 맞게 출력
//      int mathScore = 0, korScore = 0, engScore = 0, totalScore = 0;
//      String name = "",
//            kor = "국어:", 
//            eng = "영어:", 
//            math = "수학:", 
//            score = "%6d점\n",
//            total = "총점:",
//            nameResult = "이름: %5s\n",
//            korResult = kor + score,
//            engResult = eng + score,
//            mathResult = math + score,
//            totalResult = total + score,
//            result = nameResult + mathResult + korResult + engResult + totalResult;
//      
//      name = "이규학";
//      mathScore = 20;
//      korScore = 15;
//      engScore = 10;
//      totalScore = mathScore + korScore + engScore;
//      
//      System.out.printf(result, name, mathScore, korScore, engScore, totalScore);
//      
//      
//   }
//}










