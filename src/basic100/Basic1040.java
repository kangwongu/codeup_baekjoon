package basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic1040 {

	public static void main(String[] args) throws IOException {
		int num;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		System.out.println(-num);
	}

}
