package basic100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Basic1020 {
	public static void main(String[] args) {
		// String���� �Է¹���
		// StringTokenizer�� Ȱ���� '-'�������� ����
		// '-'��ȣ ���� ���
		
		// ��������
		String jumin;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		jumin = scanner.nextLine();
		
		// ����
		StringTokenizer st = new StringTokenizer(jumin, "-");
		
		// ���
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}
	}

}
