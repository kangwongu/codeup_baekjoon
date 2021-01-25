package basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic1035 {
	public static void main(String[] args) throws IOException {
		// 변수구성
		//  String으로 16진수값을 입력받음
		// 16진수 -> 10진수
		// 10진수 -> 8진수로 변환, 출력
		
		// 변수구성
		String num;
		
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = br.readLine();
		
		// 16진수 -> 10진수
		int hex = Integer.parseInt(num, 16);		
		
		// 10진수 -> 8진수로 변환, 출력
		System.out.println(Integer.toOctalString(hex));
	}

}
