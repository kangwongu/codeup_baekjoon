package basic100;

import java.util.Scanner;

public class Basic1025 {

	public static void main(String[] args) {
		// ���ڿ��� �Է¹���
		// ���ڿ��� ���̸�ŭ int�� �迭 ����
		//	int�� �迭�� ���ڿ��� �� ��Ҹ� ���ʴ�� ����, String -> int
		// int�� �迭�� ������ ���Ŀ� �°� ���
		
		// ��������
		String str;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		str = scanner.next();
		
		// �Է¹��� ���ڿ� ���̸�ŭ int���迭 ����
		int[] intArr = new int[str.length()];
		
		// int�� �迭 �ʱ�ȭ, String -> int
		for(int i=0; i<str.length(); i++) {
			intArr[i] = str.charAt(i) - '0';	// int������ ��ȯ
		}
		
		System.out.println("["+intArr[0]*10000+"]");
		System.out.println("["+intArr[1]*1000+"]");
		System.out.println("["+intArr[2]*100+"]");
		System.out.println("["+intArr[3]*10+"]");
		System.out.println("["+intArr[4]+"]");
	}
}
