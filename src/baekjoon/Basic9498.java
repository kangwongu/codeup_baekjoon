package baekjoon;

import java.util.Scanner;

public class Basic9498 {
	public static void main(String[] args) {
		// �������� �Է�
		// �Է¹��� ���������� ����90~100 = A, 80~89 = B, 70~79 = C, 60~69 = D, ������ F�� �б�
		
		// ��������
		int score;
		char grade;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		// �ùٸ� ���������� ����
		if(score > 100 || score < 0)
			System.out.println("���� ����");
		
		// ���輺������ �б�
		if(score >= 90) 
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else 
			grade = 'F';
		
		// ���
		System.out.println(grade);
	}

}
