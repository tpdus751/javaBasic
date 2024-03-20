package select;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 카푸치노");
		System.out.println("4. 돌체라떼");
		System.out.println("메뉴 번호를 선택하세요 : ");
		
		int numMenu = input.nextInt();
		
		switch (numMenu) {
			case 1 :
			case 2 :
			case 3 :
			case 4 :
				System.out.println("몇 잔을 주문하시겠습니까? ");
				int numCoffee = input.nextInt();
				System.out.println(numMenu + "번 메뉴를 " + numCoffee + "잔 주문하셨습니다.");
				break;
			default :
				System.out.println("없는 메뉴입니다.");
				
		}
			

	}

}
