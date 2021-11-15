package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");
		double helf_circle = sc.nextDouble();
		
		double circle = helf_circle * 2.0 * 3.14;
		System.out.println("원의 넓이는 " + circle);
		
		sc.close();
	}
}
