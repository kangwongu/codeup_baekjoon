package basic100;

import java.util.Scanner;

public class Basic1023 {
	public static void main(String[] args) {
		// ���ڿ� �Է¹���
		// �Է¹��� ���ڿ��� �� ����� '����'�������� ������ ���
		//	StringBuilder����
		//		����� ���ڿ� ���̸�ŭ �ݺ��� ���� -> ����� ���ڿ��� ������������ ��ȯ�� ���
		
		// ��������
		String str;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		
		// ������������ ��ȯ / ���
		StringBuilder sb = new StringBuilder(str);	
		
		for(int i=0; i<sb.length(); i++) {	
			System.out.println("\'"+sb.charAt(i)+"\'");	// ������������ ��ȯ�� ���
		}
	}

}
