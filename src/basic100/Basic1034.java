package basic100;

import java.util.Scanner;

public class Basic1034 {
	public static void main(String[] args) {
		// 8진수 정수입력
		// 10진수로 출력
		
		// 변수구성
		String number;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		number = scanner.next();
		
		// 출력
		System.out.println(Integer.parseInt(number, 8));
	}
}
