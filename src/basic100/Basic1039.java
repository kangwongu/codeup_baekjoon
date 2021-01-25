package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Basic1039 {
	public static void main(String[] args) throws Exception {
		// 변수구성
		//	int a,b, StringTokenizer참조변수
		// StringTokenizer에 입력받음 ( 공백을 두고 두 수를 입력 )
		//	공백으로 토큰을 분리 해 각각 a, b에 저장
		// 	a, b의 합을 출력
		
		// 변수구성
		long a = 0, b = 0;
		StringTokenizer st;
		
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			a = Long.parseLong(st.nextToken());
			b = Long.parseLong(st.nextToken());
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write((a+b)+"\n");
		bw.flush();
	}

}
