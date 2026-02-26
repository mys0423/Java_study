package arrayListTask1;

import java.util.ArrayList;

public class ArrayListTask1 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			datas.add((i + 1) * 10);
		}
		
		System.out.println(datas);
		
//		실습
//		50뒤에 500을 삽입
		datas.add(5, 500);
		
//		80 삭제
//		1. 인덱스로 삭제하기
		datas.remove(8);
		
//		60삭제
//		2. 값으로 삭제하기
		datas.remove(datas.get(6));
		
		System.out.println(datas);
	}
}
