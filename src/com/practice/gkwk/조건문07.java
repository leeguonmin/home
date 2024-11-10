package com.practice.gkwk;

import java.util.Scanner;

public class 조건문07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주쇼");
		System.out.print("나이: ");
		int i = scanner.nextInt();
		
		if(i>0&&i<8) {
			System.out.println("취학전아동입니다 무료예용");
		} else if (i>7&&i<14) {
			System.out.println("초딩 2천원");
		} else if (i>=14&&i<17) {
			System.out.println("중딩 3000원");
		} else if(i>16&&i<20) {
			System.out.println("고딩 4찬원");
		} else {
			System.out.println("성인 오천넌");
		}
	}

}



//syso