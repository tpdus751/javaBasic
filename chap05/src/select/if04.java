package select;

import java.util.Scanner;

public class if04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(("점수를 입력하세요 : "));
		
		int a = input.nextInt();
		char grade;
		
		if (a >= 90) {
			grade = 'A';
			System.out.println("학점은 " + grade + "입니다.");
			
		} 
		else if (a >= 80) {
			grade = 'B';
			System.out.println("학점은 " + grade + "입니다.");
		}
		else if (a >= 70) {
			grade = 'C';
			System.out.println("학점은 " + grade + "입니다.");
		}
		else if (a >= 60) {
			grade = 'D';
			System.out.println("학점은 " + grade + "입니다.");
		}
		else {
			grade = 'F';
			System.out.println("학점은 " + grade + "입니다.");
		}
	}

}
