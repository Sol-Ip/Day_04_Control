package com.kh.control;

import java.util.Scanner;

public class Exam_Switch1 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
//		if(num == 1) {
//			System.out.println("�Է¸޴��Դϴ�.");
//		} else if (num == 2) {
//			System.out.println("�����޴��Դϴ�.");
//		}
		switch (num) {
		case 1 :
			System.out.println("�Է¸޴��Դϴ�.");
			break;
		case 2 :
			System.out.println("�����޴��Դϴ�.");
			break;
		case 3 :
			System.out.println("��ȸ�޴��Դϴ�.");
			break;
		case 4 :
			System.out.println("�����޴��Դϴ�.");
			break;
		case 7 :
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
	    default :
		    System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
}