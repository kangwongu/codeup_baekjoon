package basic100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Basic1022 {

	public static void main(String[] args) {
		// �Ǽ� �Է�
		// �Է¹��� �Ǽ��� �����κ�, �Ǽ��κ� ������ ���
		
		// ��������
		double d;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		d = scanner.nextDouble();
		
		// ������������ ��ȯ (�����κ�, �Ǽ��κ�)
		String number = String.valueOf(d);	// ����ȯ, Double -> String
		StringTokenizer st = new StringTokenizer(number, ".");
		
		// ���
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
