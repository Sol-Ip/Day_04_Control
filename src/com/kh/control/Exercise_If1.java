package com.kh.control;

import java.util.Scanner;

public class Exercise_If1 {
	// Ű����� ������ �Է¹ް� �Է¹��� ������ ����̸� ¦���� ����
	// "¦����" �� ����ϰ� ¦���� �ƴϸ� "Ȧ����" �� ����ϼ���
	// ����� �ƴϸ� "����� �Է����ּ���"�� ����ϼ���
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("���� �ϳ� �Է����ּ��� : ");
		int num = sc.nextInt();
		
		//����̸� ~ , ����� �ƴϸ� ~
		// if~
		if ( num > 0 ) {
			if (num%2 == 0 ) {
				System.out.println("¦�� �̴�.");
			} else {
				System.out.println("Ȧ�� �̴�.");
			 }
		 } else  {
			 System.out.println("����� �Է����ּ���");
		}
	
		// - 2��°, ����̸� ~ , ����� �ƴϸ� ~
		if (num > 0 && (num%2 == 0)) {
			System.out.println("¦�� �̴�.");
		} else if (num > 0 && (num%2!=0)) {
			System.out.println("Ȧ�� �̴�.");
		} else {
			System.out.println("����� �Է����ּ���");
		}
		
		if (num <= 0 ) {
			System.out.println("����� �Է����ּ���");
		} else if (num%2 == 0 ) {
			System.out.println("¦�� �̴�.");
		} else {
			System.out.println("Ȧ�� �̴�.");
		}
	}
}