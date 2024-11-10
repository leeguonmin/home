package com.javaex;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		ex();
	}

	private static void ex() {
		System.out.println("첫번째 숫자: ");
		System.out.println("두번째 숫자: ");
		
		Scanner scanner = new Scanner(System.in);
		int fir = scanner.nextInt();
		int sec = scanner.nextInt();
		
		
		// 약수 인지 아닌지
		// 두개의 정수중 작은 수가 큰 수의 약수인지
		if (fir > sec && sec / fir == 0) {
			System.out.println(sec + "는(은)" + fir + "의 약수입니다.");
		} else if (fir < sec && fir / sec == 0) {
			System.out.println(sec + "는(은)" + fir + "의 약수입니다.");
		} else if (fir > sec && fir / sec != 0) {
			System.out.println(sec + "는(은)" + fir + "의 약수가 아닙니다 제발");
		} else if (fir < sec && fir / sec != 0) {
			System.out.println(sec + "는(은)" + fir + "의 약수가 아닙니다 제발");
		}
		
		// 아 애 뭔데 왜 안되는데 살려줘 ㅠ
		/*
		else if (fir < sec && fir / sec != 0) {
			System.out.println(sec + "는(은)" + fir + "의 약수가 아닙니다");
		} else if (fir < sec && fir / sec != 0) {
			System.out.println(sec + "는(은)" + fir + "의 약수가 아닙니다. 제발");
		scanner.close();
	}
	*/
	
}
	
}
