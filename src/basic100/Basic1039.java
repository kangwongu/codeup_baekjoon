package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Basic1039 {
	public static void main(String[] args) throws Exception {
		// ��������
		//	int a,b, StringTokenizer��������
		// StringTokenizer�� �Է¹��� ( ������ �ΰ� �� ���� �Է� )
		//	�������� ��ū�� �и� �� ���� a, b�� ����
		// 	a, b�� ���� ���
		
		// ��������
		long a = 0, b = 0;
		StringTokenizer st;
		
		// �Է�
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
