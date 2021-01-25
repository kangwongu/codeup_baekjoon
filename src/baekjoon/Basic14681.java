package baekjoon;

import java.util.Scanner;

public class Basic14681 {
	public static void main(String[] args) {
		// x,y���� �Է¹���
		// ��ġ�� ���� ���и������� ��� (if)
		//	+x +y -> 1��и�
		//	-x +y -> 2��и�
		//	-x -y -> 3��и�
		//	+x -y -> 4��и�
		
		// ��������
		int x, y;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		
		// �Է�üũ
		if(-1000 > x || x > 1000) {
			System.out.println("�Է� �����Դϴ�.");
			return;
		}
		
		y = scanner.nextInt();
		
		if(-1000 > y || y > 1000) {
			System.out.println("�Է� �����Դϴ�.");
			return;
		}
		
		// x,y��ġ�� ���� ���и�����?
		if(x > 0 && y > 0)
			System.out.println("1");
		else if(x < 0 && y > 0)
			System.out.println("2");
		else if(x <0 && y < 0)
			System.out.println("3");
		else
			System.out.println("4");
		
	}

}
