package com.kh.control;

import java.util.Scanner;

public class Exercise_If3 {
//	   중간고사, 기말고사, 과제점수, 출석회수를 입력하고 
//	   Pass 또는 Fail을 출력하세요.
//	   평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 
//	   출석 100%로 이루어져 있고 
//	   이 때, 출석 비율은 출석 회수는 총 강의 회수 20회 중에서 
//	   출석한 날만 따진 값으로 계산하세요. 
//	   70점 이상일 경우 Pass, 70점 미만이거나 
//	   전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
//	    1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

	public static void main (String []args) {

		// Scanner import 및 사용 준비
		Scanner sc = new Scanner (System.in);
		// 중간 고사 점수 입력
		System.out.print("중간고사 점수를 입력하세요 : ");
		int x = sc.nextInt();
		// 기말 고사 점수 입력
		System.out.print("기말고사 점수를 입력하세요 : ");
		int y = sc.nextInt();		
		// 과제 점수 입력
		System.out.print("과제 점수를 입력하세요 : ");
		int z = sc.nextInt();		
		// 출석 회수 입력
		System.out.print("출석 회수를 입력하세요 : ");
		int k = sc.nextInt();			
		// 평가비율 반영
		//100 * 20/100=20, 100*0.2=20
		double midTerm = x * 0.2;
		double finalTerm = y * 0.3;
		double homeWork = z * 0.3;
		double at = k;
		// 총 점수 계산
		double total = midTerm + finalTerm + homeWork + at;
	// double total = ((x*0.2) + (y*0.3) + (z*0.3) + (k*1));
		
		// Pass or Fail 출력	
		
		if (total >= 70 && at > 20 * 0.7) {
			// 중간 고사 점수(20) : 70
			System.out.println("중간 고사 점수(20) : " + x);
			// 기말 고사 점수(30) : 80
			System.out.println("기말 고사 점수(30) : " + y);
			// 과제 점수     (30) : 77
			System.out.println("과제 점수(30) : " + z);
			// 출석 점수     (100): 18
			System.out.println("출석 점수(100) : " + k);
			// 총점 : 79
			// Pass 입니다.
			System.out.println("총점: " + total);
			System.out.println("Pass입니다.");
			
		} else {
			 if (total >= 70) {
				System.out.println("Fail [출석 횟수 부족] ("+ k + " / 20)");
			 } else if 
				(at > 20 * 0.7) {
					System.out.println("Fail [점수 미달] (총점 : " + total + ")");
				} else {
					System.out.println("Fail [출석 횟수 부족] (" + k + " / 20)");
					System.out.println("Fail [점수 미달] (총점 : " + total + ")");
				}	
			// 점수 통과 / 출석 미달
		    // Fail [출석 횟수 부족] (13 / 20)
			
			// 점수 미달 / 출석 통과
			// Fail [ 점수 미달 ] ( 총점 : 68 )
			
			// 점수 미달 / 출석 미달
			// Fail [출석 횟수 부족] (13 / 20 )
			// Fail [ 점수 미달 ] ( 총점 : 68 )
			System.out.println("Fail입니다.");
		}
	
	}
	
	
}
