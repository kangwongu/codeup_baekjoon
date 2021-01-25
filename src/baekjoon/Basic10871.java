package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Basic10871 {
	public static void main(String[] args) throws Exception {
		// 변수구성
		//	int n, x, StringTokenizer참조변수, int arr[] 
		// 입력
		//	StringTokenizer변수에 입력받고 공백으로 토큰 분리 후, n, x에 각각 저장
		//	n개만큼 정수입력받아 배열arr에 저장
		//	arr의 요소 중에 x보다 작은 값 있으면 출력
		
		// 변수구성
		int n, x;
		StringTokenizer st;
		
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		
		// 공백을 기준으로 토큰 분리
		n = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// n만큼 입력받고 x보다 작은 수 출력
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
