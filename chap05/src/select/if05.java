package select;

import java.util.Scanner;

public class if05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int a = input.nextInt();
			
		if (a > 0) {
			if (a % 2 == 0) {
				System.out.println("짝수입니다.");
			}
			else {
				System.out.println("홀수입니다.");
			}
		}
		else {
			System.out.println("양수가 아닙니다.");
		}

	}

}
