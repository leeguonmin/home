package com.practice;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		int[] num = new int[i];
		int total = 0;
		
		for (i = 0; i < 4; i++) {
			num[i] = scanner.nextInt();
			total += num[i];
		}
		System.out.println("평균은 "+total/i +" 입니다.");
		
		scanner.close();
	}

}

// 왜.. 왜 평균이 35가 나오죠? 왜? 왜 때문이죠? 뭐가 문제죠..? ㅠㅠㅠㅠㅠㅠㅠㅠㅠ
