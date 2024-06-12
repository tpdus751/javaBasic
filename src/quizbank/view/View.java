package quizbank.view;

import java.util.Scanner;

import quizbank.model.Cart;
import quizbank.model.CustomerStorage;

public class View {

	public Cart cart;

	public void displayWelcome() {
		String welcome = ("*****************************************\n"
                + "*********    세연이의 퀴즈 은행      *********\n"
                + "*****************************************");
		System.out.println(welcome);
      
	
		
	}

	

	public void goToRegister(CustomerStorage customerStorage) {
		String id = null;
		boolean isTrue = true;
		Scanner input = new Scanner(System.in);
		System.out.println("회원가입 진행");
		System.out.print(">> 이름 : ");
		String name = input.nextLine();
		while (isTrue) {
			System.out.print(">> ID : ");
			id = input.nextLine();
			isTrue = customerStorage.isPossibleId(id);
			if (isTrue) {
				System.out.println("이미 등록되어 있는 ID 입니다.");
			} 
				System.out.println("사용 가능한 ID 입니다.");
		}
		System.out.print(">> PASSWORD : ");
		String password = input.nextLine();
		customerStorage.addCustomer(name, id, password);
		customerStorage.saveBookList2File();
	}


	public boolean goToLogin(CustomerStorage customerStorage, Cart cart) {
		Scanner input = new Scanner(System.in);
		System.out.println("퀴즈 은행을 이용하시려면 아이디와 패스워드를 입력하세요.");
		System.out.print(">> ID : ");
		String id = input.nextLine();
		System.out.print(">> PASSWORD : ");
		String password = input.nextLine();
		if (customerStorage.isValidCustomer(id, password)) {
			System.out.println("로그인 성공하였습니다.");
			if (cart == null) {
	            this.cart = new Cart("", "", 0, "", 0, "", 0); // Cart 객체 초기화
	        }
	        
	        cart.setId(id);
			
			return true;
		} else {
			System.out.println("로그인 실패하였습니다.");
			return false;
		}
		
	}

	public int selectMenuNo(String[] menuList) {
		Scanner input = new Scanner(System.in);
		displayMenu(menuList);
		
		int menu;
		do {
			System.out.print(">> 메뉴 입력 : ");
			menu = inputNumberWithVaildation();
			if (menu < 0  || menu >= menuList.length) {
				System.out.println("0 부터 " + (menuList.length-1) + " 까지의 숫자를 입력하세요.");
			}
			
		} while (menu < 0 || menu >= menuList.length);
		
		return menu;
		
	}

	private int inputNumberWithVaildation() {
		Scanner input = new Scanner(System.in);
		try {
			int number = input.nextInt();
			return number;
		} catch (Exception e) {
			System.out.print(">> 숫자를 입력하세요 : ");
			return inputNumberWithVaildation();
		}
	}

	private void displayMenu(String[] menuList) {
		System.out.println("=========================================");
		for (int i = 0; i < menuList.length; i++) {
			System.out.println(menuList[i]);
		}
		System.out.println("=========================================");
	}

	public void showMessage(String string) {
		System.out.println(string);
	}

	

}
