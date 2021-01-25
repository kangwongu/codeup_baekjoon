package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Basic11022 {
	public static void main(String[] args) throws Exception {
		// ��������
		//	t,a,b ( t��ŭ a,b�� �Է¹ޱ����� )
		// t�Է�
		// t��ŭ a,b�� �Է¹���
		// a+b�� ������ ���Ŀ� �°� ���
		
		// ��������
		int t,a,b;
		
		// �Է�
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
