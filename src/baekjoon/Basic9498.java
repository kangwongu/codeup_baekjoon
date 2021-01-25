package baekjoon;

import java.util.Scanner;

public class Basic9498 {
	public static void main(String[] args) {
		// 시험점수 입력
		// 입력받은 시험점수에 따라90~100 = A, 80~89 = B, 70~79 = C, 60~69 = D, 나머지 F로 분기
		
		// 변수구성
		int score;
		char grade;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		// 올바른 점수범위를 설정
		if(score > 100 || score < 0)
			System.out.println("점수 오류");
		
		// 시험성적따라 분기
		if(score >= 90) 
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else 
			grade = 'F';
		
		// 출력
		System.out.println(grade);
	}

}
