package baekjoon;

import java.util.Scanner;

public class Basic10950 {
	public static void main(String[] args) {
		// 테스트 수 입력받음
		// 두개의 정수 입력받음
		// 테스트 수 만큼 두개의 정수 합을 출력
		
		// 변수구성
		int t, a, b;
		int sumArr[];
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextInt();
		sumArr = new int[t];
		
		for(int i=0; i<t; i++) {	// t만큼 a,b입력
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			sumArr[i] = a+b;
		}
		
		for(int i=0; i<sumArr.length; i++) {
			System.out.println(sumArr[i]);
		}
	}
}
