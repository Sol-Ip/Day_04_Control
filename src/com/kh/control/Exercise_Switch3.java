package com.kh.control;

import java.util.Scanner;

public class Exercise_Switch3 {
	
	//1~12 ������ ���ڸ� �Է¹޾� �ش��ϴ� ���� ���� ������ ��¥�� ����ϼ���.
	//�� ���� ���ڸ� �Է��� ��� 1~12������ ���ڸ� �Է��ϼ��並 ����ϼ���.
	//	ex)1��~12�� ���� �� �ϳ��� �Է��ϼ��� : 3
	//�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		case 2 :
			System.out.println("�Է��Ͻ� ���� 28-29�ϱ��� �Դϴ�.");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�.");
			break;
		default :
			System.out.println("1~12������ ���ڸ� �Է��ϼ���");
			
		}
	}
}