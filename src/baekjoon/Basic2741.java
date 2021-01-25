package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Basic2741 {
	public static void main(String[] args) throws Exception {
		// 정수입력
		// 정수 ~ 1까지 감소하며 출력
		
		// 변수구성
		int number;
		
		// 입력
//		Scanner scanner = new Scanner(System.in);
//		number = scanner.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		number = Integer.parseInt(br.readLine());
		
		
		// 출력
		for(int i=number; i>0; i--) {
			System.out.println(i);
		}
	}
}
