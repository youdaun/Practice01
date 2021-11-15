package com.javaex.practice;

public class Ex19 {

	public static void main(String[]args) {
		
		long light, year = 1L;
		
		year = 60*60*24*365;
		light = 300000 * year;
		
		System.out.println("빛이 1년동안 가는 거리는 " + light + " km 입니다.");
	}
}
