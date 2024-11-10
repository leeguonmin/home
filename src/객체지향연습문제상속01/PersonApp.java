package 객체지향연습문제상속01;

public class PersonApp {

	public static void main(String[] args) {
		
		Person r = new Person("정우성", "010-1111-2222");
		r.showInfo();
		
		Customer n = new Customer("유재석", "010-2222-3333", 1, 1000);
		n.showInfo();

	}

}

