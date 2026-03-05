package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args)  throws IOException {
		
//		new FileWriter(경로(+파일)), 이어쓰기 여부)
//		BufferedWriter bufferedWriter = null;
//		try {
//			bufferedWriter = new BufferedWriter(new FileWriter("./test.txt", true));
//			bufferedWriter.write("오늘 점심 메뉴 리스트\n");
//			bufferedWriter.write("김치찌개\n");
//			bufferedWriter.write("양념치킨\n");
//			bufferedWriter.write("라면\n");
//			bufferedWriter.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bufferedWriter.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
//		파일 읽기
//		new FilReader(경로)
		BufferedReader bufferedReader = null;

		try {
			bufferedReader = new BufferedReader(new FileReader("./test.txt"));
			String line = null;
			
//		while((line = bufferedReader.readLine()) != null) {
//			System.out.println(line);
//		}
			
			bufferedReader.lines().forEach(System.out::println);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
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
