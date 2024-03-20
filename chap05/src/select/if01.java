package select;

import java.util.Scanner; // 컨트롤 + 쉬프트 + O

public class if01 {

	public static void main(String[] args) {
		// 세 개의 숫자를 입력
		Scanner input = new Scanner(System.in);
		
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int max = a;
		
		
		// 최대값 구하기
		if (b > max) {
			max = b;
		}
		
		if (c > max) {
			max = c;
		}
		

		
		
		// 최대값 출력
		System.out.println("가장 큰 수는 " + max + "입니다.");

	}

}
