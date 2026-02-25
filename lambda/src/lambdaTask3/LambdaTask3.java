package lambdaTask3;

public class LambdaTask3 {
	public static void main(String[] args) {
//   1. 전달한 글자가 등장하는 거리 구하기
//   입력예시
//   "abcdababefda", "a"
//
//   출력예시
//   "3 -> 1 -> 4"
//   만약 중복된 글자가 없어 거리를 찾지 못하면
//   "-1"
		System.out.println("1번");
		
		CharDistance charDis = (data, c) -> {
			String result = "";
			int[] distance = new int[data.length()];
			int count = 0;
			
			for(int i = 0; i < data.length(); i++) {
				if(c == data.charAt(i)) {
					distance[count++] = i;
				}
			}
			for(int i = 0; i < count - 1; i++) {
				int dis = distance[i + 1] - distance[i] - 1;
				result += dis + (i == count - 2 ? "" : " -> ");
			}
			return result;
		};
	
		System.out.println(charDis.charDistance("abcdababefda", 'b'));
//
//   2. 스파이가 남긴 암호를 해독하시오.
//   주어진 소문자(a~z) 범위라 가정한다.
//   주어진 암호를 원래 문자열을 복원하시오.
//
//   "1051081111181011069711897"   
		
	}
}
