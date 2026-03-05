package fileTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
   public static void main(String[] args) throws IOException {
//      String[] foods = {"잔치국수", "피자", "한우", "스테이크"};
//      음식 4가지를 메모장으로 만들고 콘솔에 출력
//      BufferedWriter bufferedWriter = null;
//      try {
//		bufferedWriter = new BufferedWriter(new FileWriter("./foods.txt", true));
//		  bufferedWriter.write("잔치국수\n");
//		  bufferedWriter.write("피자\n");
//		  bufferedWriter.write("한우\n");
//		  bufferedWriter.write("스테이크\n");
//		  bufferedWriter.flush();
//	} catch (IOException e) {
//		e.printStackTrace();
//	} finally {
//		try {
//			bufferedWriter.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
      
//		파일 읽기
//		new FilReader(경로)
		BufferedReader bufferedReader = null;

		try {
			bufferedReader = new BufferedReader(new FileReader("./foods.txt"));
			String line = null;
			
//		while((line = bufferedReader.readLine()) != null) {
//			System.out.println(line);
//		}
			
			bufferedReader.lines().forEach(System.out::println);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bufferedReader != null) {
					bufferedReader.close();				
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
      
   }
}


//package fileTask;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Arrays;
//
//public class FileTask {
//   public static void main(String[] args) throws IOException {
//      String[] foods = {"잔치국수", "피자", "한우", "스테이크"};
////      음식 4가지를 메모장으로 만들고 콘솔에 출력
//      
////      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./food.txt", true));
////      
////      Arrays.asList(foods).stream().forEach(food -> {
//////         bufferedWriter.newLine() 비추 
////         try {
////            bufferedWriter.write(food + "\n");
////         } catch (IOException e) {
////            e.printStackTrace();
////         }
////      });
//      
////      bufferedWriter.close();
////      System.out.println("food.txt 생성 완료.");
//      
//      BufferedReader bufferedReader = new BufferedReader(new FileReader("food.txt"));
//      bufferedReader.lines().forEach(System.out::println);
//      
//      
//   }
//}

