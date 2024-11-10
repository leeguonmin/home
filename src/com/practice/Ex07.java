package com.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] won = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		String[] mon = { "50000원", "10000원", "5000원","1000원","500원","100원","5원","1원"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액: ");
		int sa = scanner.nextInt();
		
		for (int i=0; i<won.length; i++) {
			int con =
					// 
			
		System.out.println(mon + ": "+ con + "개");
		
		}
		
		scanner.close();
	}

}






//int cons = sa / won[i];		// con = 금액/돈[박스]
//sa %= won[i];				// 
