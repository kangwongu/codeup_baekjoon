package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Basic11022 {
	public static void main(String[] args) throws Exception {
		// 변수구성
		//	t,a,b ( t만큼 a,b를 입력받기위함 )
		// t입력
		// t만큼 a,b를 입력받음
		// a+b를 지정된 형식에 맞게 출력
		
		// 변수구성
		int t,a,b;
		
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		
		for(int i=1; i<=t; i++) {
			
			st = new StringTokenizer(br.readLine()+" ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
			bw.flush();
		}
	}
}
