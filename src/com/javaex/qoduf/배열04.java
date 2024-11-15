package com.javaex.qoduf;

public class 배열04 {

	public static void main(String[] args) {
		
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		int count = 0;  // 3의 배수 개수를 저장할 변수
        int sum = 0;    // 3의 배수 합을 저장할 변수
		
		
		for (int i = 0; i <data.length; ++i) {
			 if (data[i] % 3 == 0) {  // 3의 배수인지 확인
	                count++;             // 3의 배수 개수 증가
	                sum += data[i];      // 3의 배수 합산
	            }
	        }
	        
	        System.out.println("주어진 배열에서 3의 배수의 개수 -> " + count);
	        System.out.println("주어진 배열에서 3의 배수의 합 -> " + sum);
	    }
	}
