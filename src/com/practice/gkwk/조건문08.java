package com.practice.gkwk;

import java.util.Scanner;

public class 조건문08 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("키와 몸무게를 입력해주세요");
		 System.out.print("키: ");
		 double u = scanner.nextDouble() / 100; // 키를 미터 단위로 변환
		 System.out.print("몸무게: ");
		 double r=scanner.nextDouble();
		 double bmi = r / (u * u); // BMI 계산
		 
		 if (18.5<=bmi) {
			 System.out.println("저체중입니다.");
			 System.out.print("BMI: " + bmi);
		 } else if (bmi <=24.9) {
			 System.out.println("과체중입니다");
			 System.out.print("ㅠㅡㅑ: " + bmi);
		 } else {
			 System.out.println("정상체중입니다");
			 System.out.print("ㅠㅡㅑ: " + bmi);
		 }

	}

}
