package basic100;

import java.util.Scanner;

public class Basic1031 {
	public static void main(String[] args) {
		// ���� �Է¹���
		// Integer.toOctalString()�� ����� 16������ ��ȯ�� ���
		
		// ��������
		int number;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		
		// 16������ ��ȯ�� ���
		System.out.println(Integer.toHexString(number));
	}
}
