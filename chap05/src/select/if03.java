package select;

import java.util.Scanner;

public class if03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		
		int a = input.nextInt();
		
		if (a > 0) {
			System.out.println("양수입니다.");
		}
		else if (a == 0) {
			System.out.println("0 입니다.");
		}
		else {
			System.out.println("음수입니다.");
		}
		// TODO Auto-generated method stub

	}

}
