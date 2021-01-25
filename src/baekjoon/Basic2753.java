package baekjoon;

import java.util.Scanner;

public class Basic2753 {
	public static void main(String[] args) {
		// 연도를 입력받음
		// 연도가 윤년인지를 체크
		
		// 변수구성
		int year;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		
		// 입력 체크
		if(year < 1 || year > 4000) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
			
		// 윤년 체크
		if(year%4==0 && year%100!=0 || year%400==0)
			System.out.println("1");
		else
			System.out.println(0);
	
	}

}
