package hashMap.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("name", "홍길동");
		userMap.put("age", "20");
		userMap.put("address", "서울시 강남구");
		userMap.put("name", "김길동");
		
//		System.out.println(userMap); // 순서 x
//		System.out.println(userMap.get("name"));
//		System.out.println(userMap.size());
		
//		HashSet
//		.iterator()
		Set<String> keys = userMap.keySet();
		Iterator<Entry<String, Object>> userIter = userMap.entrySet().iterator();
		
		while(userIter.hasNext()) {
			Entry<String, Object> userData = userIter.next();
			
			if(userData.getKey().equals("name")) {
				System.out.println(userData.getValue());
			}
		}		
	}
}

//package hashMap.test;
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map.Entry;
//import java.util.Set;
//
//public class HashMapTest {
//   public static void main(String[] args) {
//      HashMap<String, Object> userMap = new HashMap<String, Object>();
//      userMap.put("name", "홍길동");
//      userMap.put("age", 20);
//      userMap.put("address", "서울시 강남구");
//      userMap.put("name", "김길동");
//      
////      System.out.println(userMap);
////      System.out.println(userMap.get("name"));
////      System.out.println(userMap.size());
////      
//      
////      HashSet
////      .iterator()
//      Set<String> keys = userMap.keySet();
//      Iterator<Entry<String, Object>> userIter = userMap.entrySet().iterator();
//      
//      while(userIter.hasNext()) {
//         Entry<String, Object> userData = userIter.next();
//         
//         if(userData.getKey().equals("name")) {
//            System.out.println(userData.getValue());
//         }
//      }
//      
//      
//      
//   }
//}









