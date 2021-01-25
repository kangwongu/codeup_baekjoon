package baekjoon;

import java.util.Scanner;

public class Basic2739 {
	public static void main(String[] args) {
		// 단 입력받음
		// 입력받은 단의 구구단 출력
		
		// 변수구성
		int dan;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		dan = scanner.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}

}
