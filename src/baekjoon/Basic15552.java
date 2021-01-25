package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Basic15552 {
	public static void main(String[] args) throws Exception {
		// 변수구성 ( t ), 입력받음
		// 입력, BufferedReader이용해 입력받음
		// 출력, BufferedWriter이용해 출력
		// StringTokenizer 이용해 입력받은 t의 크기만큼 반복하며 두 정수의 합을 계산
		
		// 변수구성
		int t,a,b;
		
		// 입출력에 필요한 BufferedReader, Writer
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		// StringTokenizer이용해 
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		
		bw.flush();
	}

}
