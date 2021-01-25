package basic100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Basic1022 {

	public static void main(String[] args) {
		// 실수 입력
		// 입력받은 실수를 정수부분, 실수부분 나눠서 출력
		
		// 변수구성
		double d;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		d = scanner.nextDouble();
		
		// 지정형식으로 변환 (정수부분, 실수부분)
		String number = String.valueOf(d);	// 형변환, Double -> String
		StringTokenizer st = new StringTokenizer(number, ".");
		
		// 출력
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
