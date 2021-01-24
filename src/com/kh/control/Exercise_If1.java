package com.kh.control;

import java.util.Scanner;

public class Exercise_If1 {
	// 키보드로 정수를 입력받고 입력받은 정수가 양수이면 짝수일 때만
	// "짝수다" 를 출력하고 짝수가 아니면 "홀수다" 를 출력하세요
	// 양수가 아니면 "양수를 입력해주세요"를 출력하세요
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("정수 하나 입력해주세요 : ");
		int num = sc.nextInt();
		
		//양수이면 ~ , 양수가 아니면 ~
		// if~
		if ( num > 0 ) {
			if (num%2 == 0 ) {
				System.out.println("짝수 이다.");
			} else {
				System.out.println("홀수 이다.");
			 }
		 } else  {
			 System.out.println("양수를 입력해주세요");
		}
	
		// - 2번째, 양수이면 ~ , 양수가 아니면 ~
		if (num > 0 && (num%2 == 0)) {
			System.out.println("짝수 이다.");
		} else if (num > 0 && (num%2!=0)) {
			System.out.println("홀수 이다.");
		} else {
			System.out.println("양수를 입력해주세요");
		}
		
		if (num <= 0 ) {
			System.out.println("양수를 입력해주세요");
		} else if (num%2 == 0 ) {
			System.out.println("짝수 이다.");
		} else {
			System.out.println("홀수 이다.");
		}
	}
}
