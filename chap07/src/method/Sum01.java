package method;

import java.util.Scanner;

public class Sum01 {
	
	
	// 함수 입력
	public static int getNumberKeyborad(String message) {
		System.out.print(message);
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	
	// 함수 1부터 더하기
	public static int getSum(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;	
	}
	
	
	// 함수 출력
	public static void printScreen(int value) {
		System.out.println(value);
	}
	
	
	// 함수 출력 오버로딩
	public static void printScreen(int value, String message) {
		System.out.println(message + value);
	}
	
	

	public static void main(String[] args) {
		// 1.입력 받기	
		int num;
		
		// 2.슷자가 양수이면 진행
		while ((num = getNumberKeyborad("양의 숫자를 입력하세요 : ")) > 0) {
			
			// 3.1부터 숫자까지 더하기
			int result = getSum(num);
			
			// 4.더한 값 출력
			printScreen(result, "합계 : ");
		}
		
		System.out.println("다음에 또 봐요~~~");
	    
		
		
	}	
	

}
