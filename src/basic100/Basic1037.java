package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Basic1037 {
	public static void main(String[] args) throws Exception {
		// ��������
		//  int num
		// num�Է¹���
		// num�� ����(char)�� ��ȯ, ���
		
		// ��������
		int num;
		
		// �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		
		// ���� -> ����
		char ch = (char)num;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(ch);
		bw.flush();

	}
}
