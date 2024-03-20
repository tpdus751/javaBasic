package method;

import java.util.Scanner;

public class EvenOdd03 {

public static String decideEvenOdd(int num) {
		
		if (num % 2 == 0) {
			return "짝수입니다.";
		} else {
			return "홀수입니다.";
		}
		
	}

	public static void main(String[] args) {
		
		int bContinue = 1;
		
		while (bContinue != 0) {
		
			System.out.print("숫자를 입력하세요 : ");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			
			String result = decideEvenOdd(num);
			System.out.println(result);
			
			System.out.print("계속 하시겠습니까? [0/1] : ");
			
			bContinue = input.nextInt();
			
		}
		
		System.out.println("다음에 똬 봐요~~^^");
		
	
	

	}

}