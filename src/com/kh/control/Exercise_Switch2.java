package com.kh.control;

import java.util.Scanner;

public class Exercise_Switch2 {
	// ���� �ΰ��� �����ȣ ���� 1���� �Է¹޾Ƽ�
	// �����ȣ����(+,-,*,/)�� �ش��ϴ� ����� �����ϰ� ����ϼ���
	// ��, �� ���� ���ڸ� �Է��� ��� �����ڸ� �߸��Է��ϼ̽��ϴٸ� ����ϼ���.
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		int first = sc.nextInt();
		
		System.out.print("�ι�° �� : ");
		int second = sc.nextInt();
		
		System.out.print("������ (+, -, *, /) : ");
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
			System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
		}
	   System.out.println(first + " " + op + " " + second + " = " + result );
	}
}