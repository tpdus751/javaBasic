package loop;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		
		int a = 1;
		
		
		while (a == 1) {
			System.out.print("숫자를 입력하세요 : ");
			int num = input.nextInt();
			
			if (num % 2 == 0) {
				System.out.println(">>> 짝수입니다.");
				System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
				
				a = input.nextInt();
			}
			else {
				System.out.println(">>> 홀수입니다.");
				System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
				
				a = input.nextInt();
			}
			
			
			
		}
		
		System.out.println("다음에 또 봐요~~~!");
		
	}

}
