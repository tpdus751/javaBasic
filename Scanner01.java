package scanner;

import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 타입 숫자를 입력하세요. : ");
		int a = input.nextInt();
		System.out.print("실수 타입 숫자를 입력하세요. : ");
		float b = input.nextFloat();
		
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		

	}

}
