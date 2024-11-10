package com.practice.gkwk;

import java.util.Scanner;

public class Dustmq {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = scanner.nextInt();
		
		if (age>20 && age<65) {
			System.out.println("1번 그룹입니다 ");
		} else {
			System.out.println("2번 그룹입낟");
		}
		

	}

}
