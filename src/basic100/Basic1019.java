package basic100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Basic1019 {
	public static void main(String[] args) {
		// ��,��,���� �ѹ��� �Է¹���
		// StringTokenizer�̿��� '.'�� �������� �и�
		// �и��� ��ū���� ���� ����
		// ���Ŀ� �°� ���
		String date;
		System.out.print("��,��,���� �Է��ϼ���. ");
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		date = scanner.nextLine();
		
		StringTokenizer st = new StringTokenizer(date, ".");
		int[] a = new int[st.countTokens()]; 
		
		int i=0; // while���� ���� ����
		while(st.hasMoreTokens()) {
			a[i] = Integer.parseInt(st.nextToken()); // ��ū�� ���������� ����ȯ
			i++;
		}
		
		System.out.printf("%04d.%02d.%02d", a[0], a[1], a[2]);
		
	}

}
