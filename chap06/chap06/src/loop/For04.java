package loop;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요. : ");
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int factorial = 1;
		
		for (int i = num; i >= 1; i--) {
			factorial *= i;
		}
		
		System.out.println(num + "! = " + factorial);
		
	}

}
