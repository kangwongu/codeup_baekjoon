package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Basic15552 {
	public static void main(String[] args) throws Exception {
		// �������� ( t ), �Է¹���
		// �Է�, BufferedReader�̿��� �Է¹���
		// ���, BufferedWriter�̿��� ���
		// StringTokenizer �̿��� �Է¹��� t�� ũ�⸸ŭ �ݺ��ϸ� �� ������ ���� ���
		
		// ��������
		int t,a,b;
		
		// ����¿� �ʿ��� BufferedReader, Writer
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		// StringTokenizer�̿��� 
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		
		bw.flush();
	}

}
