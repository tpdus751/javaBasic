package scanner;

import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하세요.(cm) : ");
		int a = input.nextInt();
		System.out.print("원의 넓이는 " + (3.14 * a * a) + " 입니다.");

	}

}
