package baekjoon;

import java.util.Scanner;

public class Basic2884 {
	public static void main(String[] args) {
		// ��,�� �Է¹���
		// �Է¹��� �ð����� 45�� ���� �ð��� ���
		//	minute > 45 ->  minute-45
		//	minute < 45 ->  minute-45+60
		//		hour-1
		//		hour < 0 -> h=23 
		
		// ��������
		int hour;
		int minute;
		
		// �Է�
		Scanner scanner = new Scanner(System.in);
		hour = scanner.nextInt();
		minute = scanner.nextInt();
		
		if(minute<45) {		
			hour--;
			minute += 15;
			if(hour < 0)
				hour = 23;
		} else
			minute -= 45;
		
		System.out.println(hour + " " + minute);
	}
}