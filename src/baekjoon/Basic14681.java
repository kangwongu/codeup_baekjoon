package baekjoon;

import java.util.Scanner;

public class Basic14681 {
	public static void main(String[] args) {
		// x,y값을 입력받음
		// 위치에 따라 몇사분면인지를 출력 (if)
		//	+x +y -> 1사분면
		//	-x +y -> 2사분면
		//	-x -y -> 3사분면
		//	+x -y -> 4사분면
		
		// 변수구성
		int x, y;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		
		// 입력체크
		if(-1000 > x || x > 1000) {
			System.out.println("입력 오류입니다.");
			return;
		}
		
		y = scanner.nextInt();
		
		if(-1000 > y || y > 1000) {
			System.out.println("입력 오류입니다.");
			return;
		}
		
		// x,y위치에 따라 몇사분면인지?
		if(x > 0 && y > 0)
			System.out.println("1");
		else if(x < 0 && y > 0)
			System.out.println("2");
		else if(x <0 && y < 0)
			System.out.println("3");
		else
			System.out.println("4");
		
	}

}
