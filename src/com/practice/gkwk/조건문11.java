package com.practice.gkwk;

import java.util.Scanner;

public class 조건문11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int rr = scanner.nextInt();
		System.out.print("두번째 숫자: ");
		int kk = scanner.nextInt();
		
		if (rr>kk) {
			System.out.println("몫: "+(rr/kk));
			System.out.println("나머지: "+(rr%kk));
		} else {
			System.out.println("몫: "+(kk/rr));
			System.out.println("나머지: "+(kk%rr));
		}

	}

}
