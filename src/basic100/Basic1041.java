package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Basic1041 {

	public static void main(String[] args) throws Exception {
		char a;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = (char) br.read();
		
		System.out.println((char)(a+1));	// char형으로 변환해 출력
	}

}
