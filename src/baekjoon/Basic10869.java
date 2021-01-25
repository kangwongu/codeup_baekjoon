package baekjoon;

import java.util.Scanner;

public class Basic10869 {
	public static void main(String[] args) {
		// 정수 2개 입력
		// 사칙연산
		// 출력
		
		// 변수구성
		int A, B;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		// 연산
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}

}
