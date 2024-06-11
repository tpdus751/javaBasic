package quizbank.controller;

<<<<<<< HEAD
import quizbank.model.CustomerStorage;
import quizbank.model.JavaQuizStorage;
=======
import quizbank.model.Customer;
import quizbank.model.CustomerStorage;
import quizbank.model.QuizStorage;
>>>>>>> branch 'master' of https://github.com/tpdus751/QuizBank.git
import quizbank.view.View;

public class Controller {

	JavaQuizStorage quizStorage;
	View view;
<<<<<<< HEAD
	CustomerStorage customerStorage;
	JavaQuizStorage javaQuizStorage;
=======
	Customer customer;
	CustomerStorage customerStorage;
>>>>>>> branch 'master' of https://github.com/tpdus751/QuizBank.git
	
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
	
<<<<<<< HEAD
	String[] QuizType = {
			"1. 자바 문제 확인하기",
			"2. 알고리즘 문제 확인하기",
			"3. 인터페이스 문제 확인하기"
	};
	
	public Controller(JavaQuizStorage quizStorage, View view, CustomerStorage customerStorage) {
=======
	public Controller(QuizStorage quizStorage, View view, Customer customer, CustomerStorage customerStorage) {
>>>>>>> branch 'master' of https://github.com/tpdus751/QuizBank.git
		this.quizStorage = quizStorage;
		this.view = view;
<<<<<<< HEAD
=======
		this.customer = customer;
>>>>>>> branch 'master' of https://github.com/tpdus751/QuizBank.git
		this.customerStorage = customerStorage;
	}
	
	
	public void start() {
		
<<<<<<< HEAD
		view.displayWelcome(customerStorage);
=======
		view.displayWelcome(customer, customerStorage);
>>>>>>> branch 'master' of https://github.com/tpdus751/QuizBank.git
		
		int menu;
		
		do {
			menu = view.selectMenuNo(menuList);
			
			switch (menu) {
			case 1:
				viewQuiz();
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


	private void viewQuiz() {
int menu;
		
		do {
			menu = view.selectMenuNo(QuizType);
			
			switch (menu) {
			case 1:
				viewJavaQuiz();
				break;
			case 2:
				viewAlgorithmsQuiz();
				break;
			case 3:
				addBookToCart();
				break;
			default :
				view.showMessage("잘못된 메뉴 번호입니다.");
			}
			
		} while (menu != 0);
		view.showMessage("Seyeon Book Market을 종료 합니다.");
	}


	private void viewAlgorithmsQuiz() {
		// TODO Auto-generated method stub
		
	}


	private void viewJavaQuiz() {
		javaQuizStorage.viewAllQuiz();
	}
		
	
}


