package basic100;

import java.util.Scanner;

public class Basic1034 {
	public static void main(String[] args) {
		// 8���� �����Է�
		// 10������ ���
		
		// ��������
		String number;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		number = scanner.next();
		
		// ���
		System.out.println(Integer.parseInt(number, 8));
	}
}
