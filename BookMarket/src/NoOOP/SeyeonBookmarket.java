package NoOOP;

import java.util.Scanner;

public class SeyeonBookmarket {
	
	static final int NUM_MENU = 4;

	public static void main(String[] args) {
		
		int[] cartList = {0, 0, 0};
		int numCartItem = 0;
		
		displayWelcome();
		boolean quit = false;
		while (!quit) {
			int menu = displayGetMenu();
			switch (menu) {
			case 1 : 
				menuBookList();
				break;
			case 2 :
				menuCartList(cartList);
				break;
			case 3 :
				cartList[menuAddCartItem()] += 1;
				break;
			case 4 :
				menuClearcart(cartList);
				break;
			case 0 :
				menuExit();
				quit = true;
				break;
			default :
				menuWrongNumber();
			}
		}

	}
	
	// 처음 화면
	
	static void displayWelcome() {
		String welcome = "*****************************************\n"
				+ "*    Welcome to Seyeon Book Market    *\n"
				+ "*****************************************";
		System.out.println(welcome);
	}
	
	// 메뉴 입력
	static int displayGetMenu() {
		String menuStr = "=========================================\r\n"
				+ "1. 도서 목록 보기\n"
				+ "2. 장바구니 보기\n"
				+ "3. 장바구니에 도서 추가\n"
				+ "4. 장바구니 비우기\n"
				+ "0. 종료\n"
				+ "=========================================";
		System.out.println(menuStr);
		System.out.print(">> 메뉴 선택 : ");
		
		Scanner input = new Scanner(System.in);
		int menu = input.nextInt();
		return menu;
	}
	
	// 북 목록 배열 리턴
	static String[][] BookList() {
		String book_Arr[][] = {
				{"ID2401", "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", "20,000원"},
				{"ID2402", "코딩 자율학습 HTML+CSS+자바스크립트", "김기수", "길벗", "30,000원"},
				{"ID2403", "Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편", "보요시바타", "이지스퍼블리싱", "25,000원"}
			};
		return book_Arr;
	}
	
	
	
	
	// 1번 북리스트
	static void menuBookList() {
		BookList();
		System.out.println(">> 도서 목록");
		System.out.println("------------------------------------------------------------------------");
		for (int i = 0; i < BookList().length; i++) {
			for (int j = 0; j < BookList()[i].length; j++) {
				System.out.print(BookList()[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------");
		
	}

	// 2번 장바구니 목록 출력
	static void menuCartList(int cartList[]) {
		int N = 0;
		System.out.println(">> 장바구니 보기");
		System.out.println("------------------------------------------------------------------------");
		for (int i = 0; i < cartList.length; i++) {
			if(cartList[i] > 0) {
				N = 1;
				System.out.println(cartList[i]+"권, " +  BookList()[i][1] + ", " +  BookList()[i][2] + ", " +  BookList()[i][3] + ", " + BookList()[i][4]);
			}
		}
		if (N == 0) {
			System.out.println(">> 장바구니가 비어 있습니다.");
		}
		
		System.out.println("------------------------------------------------------------------------");
	}
	
	// 3번 장바구니에 도서 추가
	static int menuAddCartItem() {
		boolean bool = true;
		int index = -1;
		while (bool = true) {
			BookList();
			Scanner input2 = new Scanner(System.in);
			menuBookList();
			System.out.print(">> 추가할 도서 ID 입력 : ");
			String add_ID = input2.next();
			for (int i = 0; i < BookList().length; i++) {
				if (BookList()[i][0].equals(add_ID)) {
					index = i;
				}
			}
			if (index != -1) {
				System.out.println(">>> 장바구니 추가 : " + BookList()[index][1]);
				break;
			}
			else {
				System.out.println(">> 없는 ID입니다. 도서 목록에 있는 ID를 입력하세요.");
				bool = true;
			}
			
		}
		
		return index;
	}

	// 4번 장바구니 비우기
	static void menuClearcart(int cartList[]) {
		for (int i = 0; i < cartList.length; i++) {
			cartList[i] = 0;
		}
		System.out.println(">> 장바구니에 있는 아이템을 모두 삭제하였습니다.");
	}
	
	// 0번 종료 조건
	static void menuExit() {
		System.out.println(">>> Seyeon Book Market을 종료합니다.");
	}
	
	// 없는 메뉴 번호 안내
	static void menuWrongNumber() {
		System.out.println("없는 메뉴 입니다. 0번부터 " + NUM_MENU + "번 까지의 숫자를 입력해주세요.");
	}

}


