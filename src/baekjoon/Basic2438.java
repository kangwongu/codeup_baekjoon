package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Basic2438 {
	public static void main(String[] args) throws IOException {
		
		// 변수구성
		int num;
		
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
	}

}
