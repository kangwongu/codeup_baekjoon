package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Basic11021 {
	public static void main(String[] args) throws Exception {
		// ��������
		//	t,a,b�Է� ( t-�Է¹��� ����ŭ �ݺ��� Ȱ���ϴ� ���� )
		// ������ ���Ŀ��°� ���
		
		// ��������
		int t,a,b;
		
		// �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i=1; i<=t; i++) {
			st = new StringTokenizer(br.readLine()+" ");
			
			System.out.println("Case #"+i+": "+ (Integer.parseInt(st.nextToken())
					+(Integer.parseInt(st.nextToken()))));
		}
		br.close();
	}
}
