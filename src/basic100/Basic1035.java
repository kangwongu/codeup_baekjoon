package basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic1035 {
	public static void main(String[] args) throws IOException {
		// ��������
		//  String���� 16�������� �Է¹���
		// 16���� -> 10����
		// 10���� -> 8������ ��ȯ, ���
		
		// ��������
		String num;
		
		// �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = br.readLine();
		
		// 16���� -> 10����
		int hex = Integer.parseInt(num, 16);		
		
		// 10���� -> 8������ ��ȯ, ���
		System.out.println(Integer.toOctalString(hex));
	}

}
