package chap02;

import java.util.Scanner;

public class exercise09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("전공 이수 학점 : ");
		int major_score = input.nextInt();
		System.out.print("교양 이수 학점 : ");
		int gyo_score = input.nextInt();
		System.out.print("일반 이수 학점 : ");
		int general_score = input.nextInt();
		
		if (major_score >= 70) {
			if ((gyo_score >= 30 && general_score >= 30) || (gyo_score + general_score >= 80)) {
				System.out.println("졸업 가능");
			}
			else {
				System.out.println("졸업 불가능");
			}
		}
		else {
			System.out.println("졸업 불가능");
		}
	

	}

}
