package com.kh.control;

import java.util.Scanner;

public class Exercise_Switch1 {
	// 1~3 사이의 정수를 입력받아
	// 1인 경우 빨간색입니다. 2인 경우 파란색입니다. 3인경우 초록색입니다.
	// 그 외의 정수를 입력할 경우 잘못 입력하였습니다를 출력하세요.
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();

		
		switch (num) {
		case 1 :
			System.out.println("빨간색입니다."); 
			break;
		case 2 : 
			System.out.println("파란색입니다."); 
			break;
		case 3 :
			System.out.println("초록색입니다."); 
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
			
		}
	}

}
