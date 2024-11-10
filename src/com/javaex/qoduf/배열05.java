package com.javaex.qoduf;

import java.util.Scanner;

public class 배열05 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int[] i = new int[5];
//		int y = scanner.nextInt();
		int con = 0;		// 합
//		double uu = 0;		// 평균 값
		
		int r;
		for (r=0; r<i.length; r++) {
			i[r]= scanner.nextInt();
			con = con + i[r];
		}
		System.out.println("평균은" + con/r + "입니다.");
		
		scanner.close();
		
		
	}

}
