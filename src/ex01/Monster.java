package ex01;
/** Monster.java: 모든 몬스터 객체가 함께 사용하는 설계도입니다. */

public class Monster {
    // 필드: 몬스터가 가지고 있는 정보입니다.
    private String name;
    private String grade;
    private int level;
    private int exp;
    private String element;
   // private int  age;

    // 생성자(생성할때 데이터를 만드는방법): 새 몬스터를 만들 때 필요한 정보를 받습니다.
    // 다시 안고칠거다 하면 생성자에서 
   
    public Monster(String name, String grade, int level, int exp, 
    		String element ) {
        this.name = name;
        this.grade = grade;
        this.level = level;
        this.exp = exp;
        this.element = element;
     
    }
    //새로운 생성자 만들기
  //  public Monster(String name, String grade, int level, int exp) {
    	//완전한 생성자를 부르고 모자라는 멤버는 초기값을 영점처리
    	//this (name, grade, level, exp, "", 0);
    
    
    
    
    
    //Setter : 변경할 필요없으면 set은 없애기 
    // Getter: private 필드의 값을 읽을 수 있도록 도와줍니다.
    public String getName() { return name; }
    public String getGrade() { return grade; }
    public int getLevel() { return level; }
    public int getExp() { return exp; }
    public String getElement() { return element; }
    

   

	// 도감에 표시할 정보를 한 줄의 문자열로 만들어 줍니다. = toString 
    public String getInfo() {
        return name + " / " + grade + " / 레벨 " + level
                + " / 경험치 " + exp + " / 속성 " + element;
    }
}
