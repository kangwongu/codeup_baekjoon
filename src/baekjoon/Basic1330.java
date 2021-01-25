package baekjoon;

import java.util.Scanner;

public class Basic1330 {
	public static void main(String[] args) {
		// 정수 2개 입력받음
		// 비교연산
		//	A>B, A=B, A<B
		// 3가지 상황중, 해당상황 출력
		
		// 변수구성
		int A, B;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		// 비교연산
		if(A>B)
			System.out.println(">");
		else if(A<B)
			System.out.println("<");
		else
			System.out.println("==");
		
	}

}
