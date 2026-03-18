package view;

import dao.MemberDAO;
import vo.MemberVO;

public class View {
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
//		MemberVO memberVO = new MemberVO();
//		
//		memberVO.setMemberEmail("hong1234@gmail.com");
//		memberVO.setMemberPassword("1234");
//		memberVO.setMemberAddress("서울시 강남구");
//		
//		memberDAO.join(memberVO);
		
//      3명 데이터 추가하기
//      lee1234@gmail.com, "1234", "경기도 성남시"
//      jang4567@gmail.com, "1234", "경기도 수원시"
//      kim7897@gmail.com, "1234", "서울시 종로구"
		
//		MemberVO memberVO = new MemberVO();
//		
//		memberVO.setMemberEmail("lee1234@gmail.com");
//		memberVO.setMemberPassword("1234");
//		memberVO.setMemberAddress("경기도 성남시");
//		
//		memberDAO.join(memberVO);
		
		MemberVO memberVO1 = new MemberVO();
		
		memberVO1.setMemberEmail("jang4567@gmail.com");
		memberVO1.setMemberPassword("1234");
		memberVO1.setMemberAddress("경기도 수원시");
		
		memberDAO.join(memberVO1);
		
		MemberVO memberVO2 = new MemberVO();
		
		memberVO2.setMemberEmail("kim7897@gmail.com");
		memberVO2.setMemberPassword("1234");
		memberVO2.setMemberAddress("서울시 종로구");
		
		memberDAO.join(memberVO2);
		
		
		System.out.println("회원가입 완료!");
	}
}


//package view;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//import dao.MemberDAO;
//import vo.MemberVO;
////import vo.MemberVO;
//
//public class View {
//   public static void main(String[] args) {
//      MemberDAO memberDAO = new MemberDAO();
////      MemberVO memberVO = new MemberVO();
////      
////      memberVO.setMemberEmail("hong1234@gmail.com");
////      memberVO.setMemberPassword("1234");
////      memberVO.setMemberAddress("서울시 강남구");
////      
////      memberDAO.join(memberVO);
//      
////      3명 데이터 추가하기
//      MemberVO lee = new MemberVO("lee1234@gmail.com", "1234", "경기도 성남시");
//      MemberVO jang = new MemberVO("jang4567@gmail.com", "1234", "경기도 수원시");
//      MemberVO kim = new MemberVO("kim7897@gmail.com", "1234", "서울시 종로구");
////      
////      ArrayList<MemberVO> users = new ArrayList<MemberVO>(Arrays.asList(lee, jang, kim));
////      users.forEach(memberDAO::join);
////      System.out.println("회원가입 완료!");
//
//      if(memberDAO.login(kim)) {
//         System.out.println("로그인 성공");
//      }else {
//         System.out.println("로그인 실패");
//      }
//  
//   }
//   
//}












