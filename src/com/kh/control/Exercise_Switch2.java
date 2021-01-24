package com.kh.control;

import java.util.Scanner;

public class Exercise_Switch2 {
	// 정수 두개와 연산기호 문자 1개를 입력받아서
	// 연산기호문자(+,-,*,/)에 해당하는 계산을 수행하고 출력하세요
	// 단, 그 외의 문자를 입력할 경우 연산자를 잘못입력하셨습니다를 출력하세요.
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값 : ");
		int first = sc.nextInt();
		
		System.out.print("두번째 값 : ");
		int second = sc.nextInt();
		
		System.out.print("연산자 (+, -, *, /) : ");
		char op = sc.next().charAt(0);
		
		int result = 0;
		switch (op) {
		//case '~' :
//			System.out.println(first + " + " + second + " = " (first+second));
		case '+' : 
			result = first + second; break;
		case '-' : 
			result = first - second; break;
		case '*' : 
			result = first * second; break;
		case '/' : 
			result = first / second; break;
		default:
			System.out.println("연산자를 잘못 입력하셨습니다.");
		}
	   System.out.println(first + " " + op + " " + second + " = " + result );
	}
}
