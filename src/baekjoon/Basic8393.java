package baekjoon;

import java.util.Scanner;

public class Basic8393 {
	public static void main(String[] args) {
		// �������� ( �����Է¹���, �������� ���� ���� )
		// 1���� �Է¹��� �������� ���� ����
		
		// ��������
		int num;
		int sum = 0;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		// 1~�Է¹��� �������� ��
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
