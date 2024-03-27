package chap03;

import java.util.Scanner;

public class num_3 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int num = 1;
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			Scanner input = new Scanner(System.in);
			num = input.nextInt();
			if (num % 2 == 0) {
				sum += num;
			}
		} while (num > 0);
		
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
		
		
	}

}
