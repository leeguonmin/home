package com.rorclwlgiddlfqjs;

public class UserApp {

	public static void main(String[] args) {
		
		Customer t = new Customer("Jws", "J1234", "정우성", 1000);
		t.show();
		
		Customer e = new Customer("yis", "y23445", "이효리", 9587);
		e.show();
		
		Employee r = new Employee("master", "m7894", "운영자", 5000);
		r.show();

	}

}
