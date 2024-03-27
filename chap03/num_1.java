package chap03;

import java.util.Scanner;

public class num_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int age = input.nextInt();
		
		if (age >= 19) {
			System.out.println("성년");
		}
		else {
			System.out.println("미성년");
		}

	}

}
