package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Basic1038 {
	public static void main(String[] args) throws Exception {
		// 변수구성
		//	a,b
		//	StringTokenizer참조변수
		// 입력
		//  StringTokenizer의 생성자의 매개변수에 입력받음
		//  토큰를 a,b로 구분해 합을 출력
		
		// 변수구성
		long a = 0, b = 0;
		StringTokenizer st;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine() + " ");
		while(st.hasMoreTokens()) {
			a = Long.parseLong(st.nextToken());
			b = Long.parseLong(st.nextToken());
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write((a+b)+"\n");
		bw.flush();
	}
}