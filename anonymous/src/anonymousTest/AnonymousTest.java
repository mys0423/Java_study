package anonymousTest;

public class AnonymousTest {
	public static void main(String[] args) {
//		1회성
		Study study = new Study() {
			
			@Override
			public void setTopic(String topic) {
				System.out.println("주제: " + topic);
			}
		}; 
		
		study.setTopic("화학");
	}
}
