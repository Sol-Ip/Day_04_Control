package com.kh.control;

import java.util.Scanner;

public class Exercise_If3 {
//	   �߰�����, �⸻����, ��������, �⼮ȸ���� �Է��ϰ� 
//	   Pass �Ǵ� Fail�� ����ϼ���.
//	   �� ������ �߰����� 20%, �⸻���� 30%, ���� 30%, 
//	   �⼮ 100%�� �̷���� �ְ� 
//	   �� ��, �⼮ ������ �⼮ ȸ���� �� ���� ȸ�� 20ȸ �߿��� 
//	   �⼮�� ���� ���� ������ ����ϼ���. 
//	   70�� �̻��� ��� Pass, 70�� �̸��̰ų� 
//	   ��ü ���ǿ� 30% �̻� �Ἦ �� Fail�� ����ϼ���.
//	    1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

	public static void main (String []args) {

		// Scanner import �� ��� �غ�
		Scanner sc = new Scanner (System.in);
		// �߰� ���� ���� �Է�
		System.out.print("�߰����� ������ �Է��ϼ��� : ");
		int x = sc.nextInt();
		// �⸻ ���� ���� �Է�
		System.out.print("�⸻���� ������ �Է��ϼ��� : ");
		int y = sc.nextInt();		
		// ���� ���� �Է�
		System.out.print("���� ������ �Է��ϼ��� : ");
		int z = sc.nextInt();		
		// �⼮ ȸ�� �Է�
		System.out.print("�⼮ ȸ���� �Է��ϼ��� : ");
		int k = sc.nextInt();			
		// �򰡺��� �ݿ�
		//100 * 20/100=20, 100*0.2=20
		double midTerm = x * 0.2;
		double finalTerm = y * 0.3;
		double homeWork = z * 0.3;
		double at = k;
		// �� ���� ���
		double total = midTerm + finalTerm + homeWork + at;
	// double total = ((x*0.2) + (y*0.3) + (z*0.3) + (k*1));
		
		// Pass or Fail ���	
		
		if (total >= 70 && at > 20 * 0.7) {
			// �߰� ���� ����(20) : 70
			System.out.println("�߰� ���� ����(20) : " + x);
			// �⸻ ���� ����(30) : 80
			System.out.println("�⸻ ���� ����(30) : " + y);
			// ���� ����     (30) : 77
			System.out.println("���� ����(30) : " + z);
			// �⼮ ����     (100): 18
			System.out.println("�⼮ ����(100) : " + k);
			// ���� : 79
			// Pass �Դϴ�.
			System.out.println("����: " + total);
			System.out.println("Pass�Դϴ�.");
			
		} else {
			 if (total >= 70) {
				System.out.println("Fail [�⼮ Ƚ�� ����] ("+ k + " / 20)");
			 } else if 
				(at > 20 * 0.7) {
					System.out.println("Fail [���� �̴�] (���� : " + total + ")");
				} else {
					System.out.println("Fail [�⼮ Ƚ�� ����] (" + k + " / 20)");
					System.out.println("Fail [���� �̴�] (���� : " + total + ")");
				}	
			// ���� ��� / �⼮ �̴�
		    // Fail [�⼮ Ƚ�� ����] (13 / 20)
			
			// ���� �̴� / �⼮ ���
			// Fail [ ���� �̴� ] ( ���� : 68 )
			
			// ���� �̴� / �⼮ �̴�
			// Fail [�⼮ Ƚ�� ����] (13 / 20 )
			// Fail [ ���� �̴� ] ( ���� : 68 )
			System.out.println("Fail�Դϴ�.");
		}
	
	}
	
	
}