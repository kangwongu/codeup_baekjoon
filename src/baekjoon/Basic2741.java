package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Basic2741 {
	public static void main(String[] args) throws Exception {
		// �����Է�
		// ���� ~ 1���� �����ϸ� ���
		
		// ��������
		int number;
		
		// �Է�
//		Scanner scanner = new Scanner(System.in);
//		number = scanner.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		number = Integer.parseInt(br.readLine());
		
		
		// ���
		for(int i=number; i>0; i--) {
			System.out.println(i);
		}
	}
}
