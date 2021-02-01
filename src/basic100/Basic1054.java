package basic100;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Basic1054 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if((a!=1 && a!=0) && (b!=1 && b!=0) ) {
			bw.write("잘못된 입력");
		}
		
		if(a==1 && b==1) {
			bw.write(1 + "\n");
		} else {
			bw.write(0 + "\n");
		}
		
		bw.flush();
	}
}

