package com.kh.control;

import java.util.Scanner;

public class Exercise_Switch1 {
	// 1~3 ������ ������ �Է¹޾�
	// 1�� ��� �������Դϴ�. 2�� ��� �Ķ����Դϴ�. 3�ΰ�� �ʷϻ��Դϴ�.
	// �� ���� ������ �Է��� ��� �߸� �Է��Ͽ����ϴٸ� ����ϼ���.
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 ������ ������ �Է��ϼ��� : ");
		int num = sc.nextInt();

		
		switch (num) {
		case 1 :
			System.out.println("�������Դϴ�."); 
			break;
		case 2 : 
			System.out.println("�Ķ����Դϴ�."); 
			break;
		case 3 :
			System.out.println("�ʷϻ��Դϴ�."); 
			break;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			
		}
	}

}