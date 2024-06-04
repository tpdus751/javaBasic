package quizbank.view;

import java.util.Scanner;

import quizbank.model.Customer;
import quizbank.model.CustomerStorage;

public class View {

	public void displayWelcome(Customer customer, CustomerStorage customerStorage) {
		String welcome = ("*****************************************\n"
                + "*    세연이의 퀴즈 은행      *\n"
                + "*****************************************");
		System.out.println(welcome);
		askQuestion("1.로그인, 2.회원가입 : ", customer, customerStorage);
      
	
		
	}

	private void askQuestion(String message, Customer customer, CustomerStorage customerStorage) {
		Scanner input = new Scanner(System.in);
		System.out.print(message);
		int answer = input.nextInt();
		do {
			switch (answer) {
				case 1: 
					goToLogin(customer, customerStorage);
					break;
				case 2:
					goToRegister();
					break;
				case 0:
					break;
				default :
					System.out.println("잘못된 번호 입니다.");
			}
		} while (!true);
	}

	private void goToRegister() {
		// TODO Auto-generated method stub
		
	}

	public boolean goToLogin(Customer customer, CustomerStorage customerStorage) {
		Scanner input = new Scanner(System.in);
		System.out.println("퀴즈 은행을 이용하시려면 아이디와 패스워드를 입력하세요.");
		System.out.print(">> ID : ");
		String id = input.nextLine();
		System.out.print(">> PASSWORD : ");
		String password = input.nextLine();
		if (customerStorage.isValidCustomer(id, password)) {
			System.out.println("로그인 성공하였습니다.");
			return true;
		} else {
			System.out.println("로그인 실패하였습니다.");
			return false;
		}
		
	}

}
