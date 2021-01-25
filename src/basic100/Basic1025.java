package basic100;

import java.util.Scanner;

public class Basic1025 {

	public static void main(String[] args) {
		// 문자열을 입력받음
		// 문자열의 길이만큼 int형 배열 생성
		//	int형 배열에 문자열의 각 요소를 차례대로 저장, String -> int
		// int형 배열을 지정된 형식에 맞게 출력
		
		// 변수구성
		String str;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		str = scanner.next();
		
		// 입력받은 문자열 길이만큼 int형배열 생성
		int[] intArr = new int[str.length()];
		
		// int형 배열 초기화, String -> int
		for(int i=0; i<str.length(); i++) {
			intArr[i] = str.charAt(i) - '0';	// int형으로 변환
		}
		
		System.out.println("["+intArr[0]*10000+"]");
		System.out.println("["+intArr[1]*1000+"]");
		System.out.println("["+intArr[2]*100+"]");
		System.out.println("["+intArr[3]*10+"]");
		System.out.println("["+intArr[4]+"]");
	}
}
