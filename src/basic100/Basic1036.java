package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Basic1036 {
	public static void main(String[] args) throws IOException {
		// 변수구성
		//	char ch
		// ch를 입력받음
		// 문자 -> 정수로 형변환
		// ch 출력
		
		// 변수구성
		char ch;
		
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ch = br.readLine().charAt(0);
		
		// 문자 -> 숫자
		int num = (int)ch;
		bw.write(num);
		bw.flush();
		
		// 출력
		//System.out.println(num);
	}
}