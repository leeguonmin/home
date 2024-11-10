package com.javaex.qoduf;

public class 배열03 {

	public static void main(String[] args) {
		
		int[] intA= {3,6,91};
		
		int[] intB;
		intB = intA;
		intB[0]=20;
		intB[2]=10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}

	}

}
