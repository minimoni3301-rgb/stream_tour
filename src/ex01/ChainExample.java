package ex01;

import java.util.List;

public class ChainExample {

	public static void main(String[] args) {
		// 1. 과일 목록 준비 
		// 과일은 3개이므로 List.of 이용 
		List<String> names = 
				List.of("banana", "apple", "mango" );
		
		// 2. 과일 목록 스트림 생성 
		names.stream()
		// 3. 'a'가 포함되었는가 ?
		     .filter(name -> name.contains("a"))
		// 4. 대문자로 고쳐서 맵을 만든다.
		// 여기서 map은 매핑(Mapping)해서 변신시킨다는 의미  
		// 데이터를 원하는 형태로 바꾸어 다음단계에 전달하는 것 
		     .map(name -> name.toUpperCase())
		// 5. 순서를 정렬한다. 
		// .sorted()
		// 역순으로 하고싶을때
		//     .sorted((o1,o2) -> o2-o1) 이건 String이기때문에 - 연산자가 안먹는다
		       .sorted((o1,o2) -> o2.compareTo(o1))
		// 6. 과일 목록의 각각의 이름을 출력한다.  
		     .forEach(name -> System.out.println(name));
	}

}
