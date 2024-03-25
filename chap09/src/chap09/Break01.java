package chap09;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//양의 숫자 입력 받기

	
		
		int sum = 0;
		int num = 0;
		
		while (true) {
			System.out.print("숫자 입력 : ");
			num = input.nextInt();
					
			if (num <= 0) {
				System.out.println("0보다 큰 숫자를 입력하세요.");
				continue;
			}
			else {
				for (int i = 1; i < num + 1; i++) {
					sum += i;
				}
				break;
			}
		}
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
	}

}
