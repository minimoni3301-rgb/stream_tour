package ex01;

interface LabAction {
	void run();
}

	
	
	// 실제 실행앱
	public class AnonymousExample1 {
	public static void main(String[] args) {
	// 1. 이름이 있는 클래스로 기능 만들기	
	//	LabAction action = new WelcomeAction (); //class WelcomeAction이 있어야함
	// 
	//	action.run();
		
	// 2. 익명 클래스를 이용한 기능구현	
    //LabAction action = new LabAction() {

	//	@Override
	//	public void run() {
	//		System.out.println("연구소에 오신 것을 환영합니다.");
			
	//	}
		
	//};
	
	//action.run();	
	//}

//}
		
		// 3. 익명 클래스를 -> 람다함수로 바꿔서 이용한 기능구현
	     LabAction action = () -> System.out.println("연구소에 오신 것을 환영합니다.");
		 action.run();		
			
			
		
		
		
	}

}
