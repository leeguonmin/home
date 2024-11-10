package com.practice.gkwk;

import java.util.Scanner;

public class 조건문09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해주쇼");
		System.out.print("년도: ");
		int u = scanner.nextInt();
		
//		int age = u - 2020;
		int oll = 2023;
		int age=oll-u;
		
		if (u>15 && u >= 65) {
			System.out.println(age+"살 무료예짱접종 대상자 입니다" );
		} else {
			System.out.println(age+"살 무료예방접종 대상자가 아닙니다");
		}
		
		
		
	}

}
