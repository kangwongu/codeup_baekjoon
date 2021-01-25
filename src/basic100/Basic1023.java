package basic100;

import java.util.Scanner;

public class Basic1023 {
	public static void main(String[] args) {
		// 문자열 입력받음
		// 입력받은 문자열의 각 요소을 '문자'형식으로 나눠서 출력
		//	StringBuilder생성
		//		저장된 문자열 길이만큼 반복문 실행 -> 저장된 문자열을 지정형식으로 변환해 출력
		
		// 변수구성
		String str;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		
		// 지정형식으로 변환 / 출력
		StringBuilder sb = new StringBuilder(str);	
		
		for(int i=0; i<sb.length(); i++) {	
			System.out.println("\'"+sb.charAt(i)+"\'");	// 지정형식으로 변환해 출력
		}
	}

}
