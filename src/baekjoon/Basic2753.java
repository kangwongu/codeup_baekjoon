package baekjoon;

import java.util.Scanner;

public class Basic2753 {
	public static void main(String[] args) {
		// ������ �Է¹���
		// ������ ���������� üũ
		
		// ��������
		int year;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		
		// �Է� üũ
		if(year < 1 || year > 4000) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
			
		// ���� üũ
		if(year%4==0 && year%100!=0 || year%400==0)
			System.out.println("1");
		else
			System.out.println(0);
	
	}

}
