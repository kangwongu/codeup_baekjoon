package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Basic11021 {
	public static void main(String[] args) throws Exception {
		// 변수구성
		//	t,a,b입력 ( t-입력받은 수만큼 반복에 활용하는 변수 )
		// 지정된 형식에맞게 출력
		
		// 변수구성
		int t,a,b;
		
		// 입력
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
