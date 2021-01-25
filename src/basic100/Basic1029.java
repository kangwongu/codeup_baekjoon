package basic100;

import java.util.Scanner;

public class Basic1029 {
	public static void main(String[] args) {
		// 실수입력받음
		//	소수점이하 11자리까지 출력
		
		// 변수구성
		double num;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextDouble();
		
		// 출력
		System.out.printf("%.11f", num);

	}
}
