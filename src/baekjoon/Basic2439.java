package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Basic2439 {
	public static void main(String[] args) throws Exception {
		// ��������
		//	a
		// �Է�
		//  a�Է¹���
		// a
		
		int a;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=1; i<=a; i++) {
			for(int k=a; k>i; k--) {	// ������ ���
				bw.write(" ");
			}
			for(int j=1; j<=i; j++) {	// ���� ���
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
	}

}
