package baekjoon;

import java.util.Scanner;

public class Basic2739 {
	public static void main(String[] args) {
		// �� �Է¹���
		// �Է¹��� ���� ������ ���
		
		// ��������
		int dan;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		dan = scanner.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}

}
