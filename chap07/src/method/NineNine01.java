package method;

import java.util.Scanner;

public class NineNine01 {
	
	public static void printNineNine(int num) {
		System.out.println("[ 구구단 " + num + "단 ]");
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "x" + i + "=" + (num * i));
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("입력하세요 : ");
		int a = input.nextInt();
		printNineNine(a);
		

	}

}
