package chap02;

import java.util.Scanner;

public class exercise07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		if (a % 4 == 0 && a % 5 == 0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		if (a % 4 == 0 || a % 5 == 0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		if ((a % 4 == 0 || a % 5 == 0) && (a % 4 == 0 && a % 5 == 0)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		

	}

}
