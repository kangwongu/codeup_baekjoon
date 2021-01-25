package basic100;

import java.util.Scanner;

public class Basic1026 {
	public static void main(String[] args) {
		// String으로 시간을 입력받음
		// ':'기준으로 split이용해 String배열에 담고 1번째 요소 출력
		
		// 변수구성
		String time;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		time = scanner.nextLine();
		
		// ':'기준으로 문자열 분할
		String timeArr[] = time.split(":");
		
		
		System.out.println(Integer.parseInt(timeArr[1]));
	}

}
