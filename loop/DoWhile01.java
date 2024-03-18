package loop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int sum = 0;
		int num = 0;
		
		
		do {
			System.out.print("숫자를 입력하세요. : ");
			num = input.nextInt();
			sum += num;
		} 
		while (num != 0); {
			
		}
		
		System.out.println("지금까지 입력한 숫자의 합은 " + sum + "입니다.");
		
		
			
		
		
		
		
		
		

	}

}
