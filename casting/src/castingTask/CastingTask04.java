package castingTask;

// 심화
public class CastingTask04 {
   public static void main(String[] args) {
//       (심화)      
//       "0.12346", "0.5130", "78", "9.133";
//      4개 값을 더해서 123456789를 출력하기
	   String s1 = "0.12346", s2 = "0.5130", s3 = "78", s4 = "9.133";
	   String data5 = String.valueOf((int)(Double.parseDouble(s1) * 10000)) + "5";
	   String data6 = String.valueOf((int)(Double.parseDouble(s2) * 1000 / 100 + 1));
	   String data7 = String.valueOf((int)Double.parseDouble(s4));
	   
	   System.out.println(data5 + data6 + s3 + data7);
   }
}


//package castingTask;
//
////심화
//public class CastingTask04 {
//public static void main(String[] args) {
////    (심화)      
////    "0.12346", "0.5130", "78", "9.133";
////   4개 값을 더해서 123456789를 출력하기
//   String data1 = "0.12346", data2 = "0.5130", data3 = "78", data4 = "9.133", 
//         numResult = "", result = "정답: %s";
//   int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
//   double double1 = 0.0, double2 = 0.0, double3 = 0.0;
//   
//   double1 = Double.parseDouble(data1);
//   double2 = Double.parseDouble(data2);
//   double3 = Double.parseDouble(data4);
//   
//   num1 = (int)(double1 * 10000);
//   num2 = (int)(double2 * 10);
//   num3 = (int)((Double.parseDouble(data1) + Double.parseDouble(data2)) * 10);
//   num3 = data1.indexOf("6");
//   num4 = Integer.parseInt(data3);
//   num5 = (int)Double.parseDouble(data4);
//   
//   numResult = "" + num1 + num2 + num3 + num4 + num5;
//   System.out.printf(result, numResult);
//   
//   
//   
//}
//}

