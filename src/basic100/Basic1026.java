package basic100;

import java.util.Scanner;

public class Basic1026 {
	public static void main(String[] args) {
		// String���� �ð��� �Է¹���
		// ':'�������� split�̿��� String�迭�� ��� 1��° ��� ���
		
		// ��������
		String time;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		time = scanner.nextLine();
		
		// ':'�������� ���ڿ� ����
		String timeArr[] = time.split(":");
		
		
		System.out.println(Integer.parseInt(timeArr[1]));
	}

}
