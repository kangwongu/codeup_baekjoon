package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Basic1036 {
	public static void main(String[] args) throws IOException {
		// ��������
		//	char ch
		// ch�� �Է¹���
		// ���� -> ������ ����ȯ
		// ch ���
		
		// ��������
		char ch;
		
		// �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ch = br.readLine().charAt(0);
		
		// ���� -> ����
		int num = (int)ch;
		bw.write(num);
		bw.flush();
		
		// ���
		//System.out.println(num);
	}
}