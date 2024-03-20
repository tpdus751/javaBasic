package method;

import java.util.Scanner;

public class EvenOdd01 {
	
	
	
	public static void decideEvenOdd() {
		
		System.out.print("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
	}

	public static void main(String[] args) {
		
		int bContinue = 1;
		
		while (bContinue != 0) {
			decideEvenOdd();
			
			System.out.print("계속 하시겠습니까? [0/1] : ");
			Scanner input = new Scanner(System.in);
			bContinue = input.nextInt();
			
		}
		
		System.out.println("다음에 똬 봐요~~^^");
		
	
	

	}

}
