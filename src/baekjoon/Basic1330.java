package baekjoon;

import java.util.Scanner;

public class Basic1330 {
	public static void main(String[] args) {
		// ���� 2�� �Է¹���
		// �񱳿���
		//	A>B, A=B, A<B
		// 3���� ��Ȳ��, �ش��Ȳ ���
		
		// ��������
		int A, B;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		// �񱳿���
		if(A>B)
			System.out.println(">");
		else if(A<B)
			System.out.println("<");
		else
			System.out.println("==");
		
	}

}
