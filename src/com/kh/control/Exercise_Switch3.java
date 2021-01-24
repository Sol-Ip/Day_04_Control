package com.kh.control;

import java.util.Scanner;

public class Exercise_Switch3 {
	
	//1~12 사이의 숫자를 입력받아 해당하는 숫자 달의 마지막 날짜를 출력하세요.
	//그 외의 숫자를 입력할 경우 1~12까지의 숫자를 입력하세요를 출력하세요.
	//	ex)1월~12월 까지 중 하나를 입력하세요 : 3
	//입력하신 월은 31일까지 입니다.
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("입력하신 월은 31일까지 입니다.");
			break;
		case 2 :
			System.out.println("입력하신 월은 28-29일까지 입니다.");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("입력하신 월은 30일까지 입니다.");
			break;
		default :
			System.out.println("1~12까지의 숫자를 입력하세요");
			
		}
	}
}
