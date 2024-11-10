package 객체지향연습문제상속01;

public class Person {
	// 필드 선언 
	String name;
	String hp;
	
	// 기본 생성자
	public Person(String name, String hp) {
		this.name=name;
		this.hp=hp;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getHp() {
		return hp;
	}
	
	public void setHp(String hp) {
		this.hp=hp;
	}
	
	
	public void showInfo() {
		System.out.printf("#이름:%s, #핸드폰:%s%n",name,hp);
	}
	
	
	
	

}
