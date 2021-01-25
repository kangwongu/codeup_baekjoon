package basic100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Basic1020 {
	public static void main(String[] args) {
		// String으로 입력받음
		// StringTokenizer를 활용해 '-'기준으로 구분
		// '-'기호 제외 출력
		
		// 변수구성
		String jumin;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		jumin = scanner.nextLine();
		
		// 구분
		StringTokenizer st = new StringTokenizer(jumin, "-");
		
		// 출력
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}
	}

}
