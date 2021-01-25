package basic100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Basic1019 {
	public static void main(String[] args) {
		// 년,월,일을 한번에 입력받음
		// StringTokenizer이용해 '.'를 기준으로 분리
		// 분리한 토큰들을 각각 저장
		// 형식에 맞게 출력
		String date;
		System.out.print("년,월,일을 입력하세요. ");
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		date = scanner.nextLine();
		
		StringTokenizer st = new StringTokenizer(date, ".");
		int[] a = new int[st.countTokens()]; 
		
		int i=0; // while문에 쓰일 변수
		while(st.hasMoreTokens()) {
			a[i] = Integer.parseInt(st.nextToken()); // 토큰을 정수형으로 형변환
			i++;
		}
		
		System.out.printf("%04d.%02d.%02d", a[0], a[1], a[2]);
		
	}

}
