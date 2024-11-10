package com.practice.gkwk;

import java.util.Scanner;

public class 조건문10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1: ");
		int i = scanner.nextInt();
		System.out.print("숫자2: ");
		int r = scanner.nextInt();
		
		if (i>r) {
			System.out.println("큰수:"+i+"      작은수: "+r);
		} else if (r>i) {
			System.out.println("큰수: "+r+"     작은수: "+i);
		} else {
			System.out.println("큰수:"+r+"      작은수:"+i);
		}

	}

}
