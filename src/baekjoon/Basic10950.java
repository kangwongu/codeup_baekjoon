package baekjoon;

import java.util.Scanner;

public class Basic10950 {
	public static void main(String[] args) {
		// �׽�Ʈ �� �Է¹���
		// �ΰ��� ���� �Է¹���
		// �׽�Ʈ �� ��ŭ �ΰ��� ���� ���� ���
		
		// ��������
		int t, a, b;
		int sumArr[];
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextInt();
		sumArr = new int[t];
		
		for(int i=0; i<t; i++) {	// t��ŭ a,b�Է�
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			sumArr[i] = a+b;
		}
		
		for(int i=0; i<sumArr.length; i++) {
			System.out.println(sumArr[i]);
		}
	}
}
