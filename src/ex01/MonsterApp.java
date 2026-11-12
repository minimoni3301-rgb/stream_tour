package ex01;

import java.util.List;

public class MonsterApp {

	public static void main(String[] args) {
		// 1.몬스토 목록 객체 생성
		List <Monster> monsters = List.of(
				new Monster("슬라임", "일반",3,100, "물"),
				new Monster("불꽃이", "희귀",8,200, "불"),
				new Monster("버섯돌이", "일반", 5, 180, "풀"),
			    new Monster("꼬마드래곤", "전설", 20, 1500, "불"),
			    new Monster("얼음토끼", "희귀", 12, 700, "얼음"),
			    new Monster("돌멩이", "일반", 2, 80, "땅") 
			   
						);
		// List of로 만든 목록은 만든 뒤 추가하거나 삭제할 수 없는 목록
		// 새 몬스터를 넣으려면 목록을 만드는 코드 안에 
		
		
		
		// 2. 몬스터 목록크기 알기
		System.out.println(monsters.size()); 
		// 3. 첫 번째(위치번호 0) 몬스터 이름 알아보기 
		System.out.println(monsters.get(0).getName());

		System.out.println("--------------------------");
		
		// 1. 몬스터 리스트 데이터 처리 
		// stream은 데이터를 처리할 흐름을 만드는 역할
		// 데이터를 출력하려면 forEach 같은 작업을 연결해야함.
		System.out.println("[레벨 10 이상 몬스터]");
		monsters.stream()
		        .filter(monster -> monster.getLevel() >= 10)
		        .forEach(monster->System.out.println(monster.getName()
		        		)// forEach는 각 몬스터를 차례로 꺼내 람다식에 전달 
		        		);
		System.out.println();
		System.out.println("[희귀 몬스터]");
		monsters.stream()
		        .filter(monster -> monster.getGrade().equals("희귀"))
		        .forEach(monster -> System.out.println(monster.getName()));
	            //forEach는 루프돌리기임 
		
		System.out.println("-----------------------");
		monsters.stream()  
		        .map(monster ->"몬스터:" + monster.getName())
		        .forEach(name ->System.out.println(name));
		
	  long totalCount = monsters.stream().count();
	  System.out.println(totalCount);
	  
	 
	  //희귀한 몬스터 리스트 
	  //map을 거치면 내가 지정한 하나의 데이터 타입으로 낱개 변환됨 
	  List<String> rareNames = monsters.stream()
	 .filter(monster -> monster.getGrade().equals("희귀"))
	 .map(monster -> monster.getName())
	 .toList();
	  
	  System.out.println(rareNames);
		
	}

			
}	  	  	  	  	  
	
    	