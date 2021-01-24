package com.kh.control;

import java.util.Scanner;

public class Exam_Switch1 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
//		if(num == 1) {
//			System.out.println("입력메뉴입니다.");
//		} else if (num == 2) {
//			System.out.println("수정메뉴입니다.");
//		}
		switch (num) {
		case 1 :
			System.out.println("입력메뉴입니다.");
			break;
		case 2 :
			System.out.println("수정메뉴입니다.");
			break;
		case 3 :
			System.out.println("조회메뉴입니다.");
			break;
		case 4 :
			System.out.println("삭제메뉴입니다.");
			break;
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			break;
	    default :
		    System.out.println("잘못 입력하셨습니다.");
		}
		
	}
}
