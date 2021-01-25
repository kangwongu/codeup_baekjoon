package baekjoon;

import java.util.Scanner;

public class Basic10430 {
	public static void main(String[] args) {
		// 3개의 수 입력
		//
		int A,B,C;
		
		Scanner scanner = new Scanner(System.in);
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}

}
