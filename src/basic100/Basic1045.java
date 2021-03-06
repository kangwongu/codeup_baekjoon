package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Basic1045 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write((a+b) + "\n");
			bw.write((a-b) + "\n");
			bw.write((a*b) + "\n");
			bw.write((a/b) + "\n");
			bw.write((a%b) + "\n");
			bw.write(String.format("%.2f", ((double)a/b)));	// format이용해 소수점자리 지정출력
		}
		bw.flush();
	}
}
