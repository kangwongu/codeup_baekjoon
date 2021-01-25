package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Basic10871 {
	public static void main(String[] args) throws Exception {
		// ��������
		//	int n, x, StringTokenizer��������, int arr[] 
		// �Է�
		//	StringTokenizer������ �Է¹ް� �������� ��ū �и� ��, n, x�� ���� ����
		//	n����ŭ �����Է¹޾� �迭arr�� ����
		//	arr�� ��� �߿� x���� ���� �� ������ ���
		
		// ��������
		int n, x;
		StringTokenizer st;
		
		// �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		
		// ������ �������� ��ū �и�
		n = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// n��ŭ �Է¹ް� x���� ���� �� ���
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] < x)
				bw.write(arr[i] + " ");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
