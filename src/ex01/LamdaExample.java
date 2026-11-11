package ex01;

import java.util.function.Consumer;

public class LamdaExample {

	public static void main(String[] args) {
		Consumer<String> greeting = name -> System.out.println(name +"님, 반갑습니다!");
		
		greeting.accept("지우");
	}

	
	//원래 함수 역산
	public static void sayHello (String name) {
		System.out.println(name +"님, 반갑습니다.");
	} 
}
