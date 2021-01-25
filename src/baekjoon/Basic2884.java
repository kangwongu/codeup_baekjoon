package baekjoon;

import java.util.Scanner;

public class Basic2884 {
	public static void main(String[] args) {
		// 시,분 입력받음
		// 입력받은 시간보다 45분 빠른 시간을 출력
		//	minute > 45 ->  minute-45
		//	minute < 45 ->  minute-45+60
		//		hour-1
		//		hour < 0 -> h=23 
		
		// 변수구성
		int hour;
		int minute;
		
		// 입력
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