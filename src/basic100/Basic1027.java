package basic100;

import java.util.Scanner;

public class Basic1027 {
	public static void main(String[] args) {
		// ��¥�� ���ٷ� �Է¹���
		// split�̿��� ������, ������ ���Ŀ� �°� ���
		
		// ��������
		String date;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		date = scanner.nextLine();
		
		// split�̿�
		String[] dateArr = date.split("\\.");	// split���� ��ȣ�ȿ� '\\'��ȣ ��� �ʼ�
		
		// ������ ���Ŀ� �°� ���
		System.out.println(dateArr[2] + "-" + dateArr[1] + "-" + dateArr[0]);
	}

}
