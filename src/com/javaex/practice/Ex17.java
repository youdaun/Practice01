package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		double helf = sc.nextDouble();
		double circle = (4.0 * 3.14 * (helf * helf * helf) / 3.0);
		
		System.out.print("구의부피는: " + circle);
		
		sc.close();
	}
}
