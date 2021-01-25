package basic100;

import java.util.Scanner;

public class Basic1027 {
	public static void main(String[] args) {
		// 날짜를 한줄로 입력받음
		// split이용해 구분후, 지정된 형식에 맞게 출력
		
		// 변수구성
		String date;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		date = scanner.nextLine();
		
		// split이용
		String[] dateArr = date.split("\\.");	// split사용시 괄호안에 '\\'기호 사용 필수
		
		// 지정된 형식에 맞게 출력
		System.out.println(dateArr[2] + "-" + dateArr[1] + "-" + dateArr[0]);
	}

}
