package basic100;

import java.util.Scanner;

public class Basic1033 {
	public static void main(String[] args) {
		// 정수입력
		// 16진수로 출력
		
		// 변수구성
		int number;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		
		// 출력
		System.out.printf("%X", number);
	}

}
