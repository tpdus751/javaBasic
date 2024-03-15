package chap02;

import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = input.nextInt();
		
		System.out.println(a + "의 제곱은 " + (a * a));
		
		

	}

}
