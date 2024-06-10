package quizbank.controller;

import quizbank.model.Customer;
import quizbank.model.CustomerStorage;
import quizbank.model.QuizStorage;
import quizbank.view.View;

public class Controller {

	QuizStorage quizStorage;
	View view;
	Customer customer;
	CustomerStorage customerStorage;
	
	String[] menuList = {
			"0. 종료",
			"1. 과목별 문제 보기",
			"2. 과목별 문제 풀기",
			"3. 과목별 틀린 문제 보기 및 풀기",
			"4. 점수 확인",
			"5. 관리자모드"
	};
	
	String[] adminMenuList = {
			"0. 종료",
			"1. 과목별 문제 추가",
			"2. 과목별 문제 삭제",
			"3. 과목별 문제 수정"
	};
	
	public Controller(QuizStorage quizStorage, View view, Customer customer, CustomerStorage customerStorage) {
		this.quizStorage = quizStorage;
		this.view = view;
		this.customer = customer;
		this.customerStorage = customerStorage;
	}
	
	
	public void start() {
		
		view.displayWelcome(customer, customerStorage);
		
		int menu;
		
		do {
			menu = view.selectMenuNo(menuList);
			
			switch (menu) {
			case 1:
				viewBookInfo();
				break;
			case 2:
				viewCart();
				break;
			case 3:
				addBookToCart();
				break;
			case 4:
				removeBookFromCart();
				break;
			case 5:
				changeBookQuantityFromCart();
				break;
			case 6:
				resetCart();
				break;
			case 7:
				order();
				break;
			case 8:
				adminMode(); // 0530 with 교수님
				break;
			default :
				view.showMessage("잘못된 메뉴 번호입니다.");
			}
			
		} while (menu != 0);
		view.showMessage("Seyeon Book Market을 종료 합니다.");
	}
}


