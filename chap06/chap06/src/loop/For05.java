package loop;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		System.out.print("양의 숫자를 입력하세요. : ");
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int sum = 0;
		
		while (num <= 0) {
			System.out.print("양의 숫자가 아닙니다. 다시 입력하세요 : ");
			num = input.nextInt();
		}	
		
		for (int i = num; i >= 0; i--) {
			sum += i;
		}
		
		System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");

	}

}
