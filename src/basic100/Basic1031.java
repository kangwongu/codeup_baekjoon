package basic100;

import java.util.Scanner;

public class Basic1031 {
	public static void main(String[] args) {
		// 수를 입력받음
		// Integer.toOctalString()을 사용해 16진수로 변환해 출력
		
		// 변수구성
		int number;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		
		// 16진수로 변환해 출력
		System.out.println(Integer.toHexString(number));
	}
}
