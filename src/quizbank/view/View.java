package quizbank.view;

import java.util.Scanner;

import quizbank.model.Customer;

public class View {

	public void displayWelcome(Customer customer) {
		String welcome = ("*****************************************\n"
                + "*    세연이의 퀴즈 은행      *\n"
                + "*****************************************");
		System.out.println(welcome);
		askQuestion("1.로그인, 2.회원가입 : ", customer);
      
	
		
	}

	private void askQuestion(String message, Customer customer) {
		Scanner input = new Scanner(System.in);
		System.out.print(message);
		int answer = input.nextInt();
		switch (answer) {
			case 1: 
				goToLogin(customer);
				break;
			case 2:
				goToRegister();
				break;
			case 0:
				break;
			default :
				System.out.println("잘못된 번호 입니다.");
		}
	}

	public void goToLogin(Customer customer) {
		Scanner input = new Scanner(System.in);
		System.out.println("퀴즈 은행을 이용하시려면 아이디와 패스워드를 입력하세요.");
		System.out.print(">> ID : ");
		String id = input.nextLine();
		System.out.print(">> PASSWORD : ");
		String password = input.nextLine();
	}

}
