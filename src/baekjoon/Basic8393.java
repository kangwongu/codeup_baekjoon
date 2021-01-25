package baekjoon;

import java.util.Scanner;

public class Basic8393 {
	public static void main(String[] args) {
		// 변수구성 ( 정수입력받음, 정수합을 담을 변수 )
		// 1부터 입력받은 정수까지 합을 구함
		
		// 변수구성
		int num;
		int sum = 0;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		// 1~입력받은 정수까지 합
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
