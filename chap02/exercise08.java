package chap02;

import java.util.Scanner;

public class exercise08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.print("0 ~ 999 사이의 숫자를 입력하세요 : ");
		 int a = input.nextInt();
		 int sum = 0;
		 int a_3 = (a / 100);
		 int a_2 = ((a % 100) / 10);
		 int a_1 = (a % 10);
		 
		 System.out.print("각 자릿수의 합 : " + (a_3 + a_2 + a_1));
		 
		

	}

}
