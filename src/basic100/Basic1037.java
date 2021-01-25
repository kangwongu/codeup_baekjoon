package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Basic1037 {
	public static void main(String[] args) throws Exception {
		// 변수구성
		//  int num
		// num입력받음
		// num을 문자(char)로 변환, 출력
		
		// 변수구성
		int num;
		
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		
		// 정수 -> 문자
		char ch = (char)num;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(ch);
		bw.flush();

	}
}
